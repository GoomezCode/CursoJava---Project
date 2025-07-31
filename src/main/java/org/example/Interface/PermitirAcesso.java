package org.example.Interface;

/*Essa interface será o nosso Contrato*/
public interface PermitirAcesso {
    boolean autenticar(String usuario, int senha);/*Apenas declaração do método*/
    boolean autenticar();
}
