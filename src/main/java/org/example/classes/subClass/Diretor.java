package org.example.classes.subClass;

import org.example.Interface.PermitirAcesso;
import org.example.classes.superClass.Pessoa;

import java.util.Objects;

public class Diretor extends Pessoa implements PermitirAcesso {
    private String registroEducacional;
    private String tempoDirecao;
    private String titulacao;

//	---------------------------- /*Setters é Getters*/ ----------------------------
    public String getRegistroEducacional() {
        return registroEducacional;
    }

    public void setRegistroEducacional(String registroEducacional) {
        this.registroEducacional = registroEducacional;
    }

    public String getTempoDirecao() {
        return tempoDirecao;
    }

    public void setTempoDirecao(String tempoDirecao) {
        this.tempoDirecao = tempoDirecao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
//	---------------------------- /*Setters é Getters*/ ----------------------------

//	---------------------------- /*ToString*/ ---------------------------
    @Override
    public String toString() {
        return "Diretor{" +
                "registroEducacional='" + registroEducacional + '\'' +
                ", tempoDirecao='" + tempoDirecao + '\'' +
                ", titulacao='" + titulacao + '\'' +
                "} " + super.toString();
    }
//	---------------------------- /*ToString*/ ---------------------------

//	---------------------------- /*HashCode and Equals*/ ---------------------------
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Diretor diretor = (Diretor) o;
        return Objects.equals(registroEducacional, diretor.registroEducacional) && Objects.equals(tempoDirecao, diretor.tempoDirecao) && Objects.equals(titulacao, diretor.titulacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registroEducacional, tempoDirecao, titulacao);
    }
//	---------------------------- /*HashCode and Equals*/ ---------------------------

//	---------------------------- /*Métodos*/ ---------------------------
    @Override
    public Double salario() {
        return 3500.0;
    }
//	---------------------------- /*Métodos*/ ---------------------------

    private String usuario;
    private int senha;

    public Diretor(String usuario, int senha){
        this.usuario = usuario;
        this.senha = senha;
    }
    public Diretor(){}

    @Override
    public boolean autenticar(String usuario, int senha) {
        this.usuario = usuario;
        this.senha = senha;

        return autenticar();
    }

    @Override
    public boolean autenticar() {
        return usuario.equalsIgnoreCase("admin") && senha == 123;
    }
}
