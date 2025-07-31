package org.example.Interface;

import org.example.Interface.auxiliar.funcAutentica;
import org.example.classes.subClass.Diretor;
import org.example.classes.subClass.Secretario;

public class teste {
    public static void main(String[] args) {
        String usuario = "admin";
        int senha = 123;

        if(new funcAutentica(new Secretario(usuario,senha)).autenticar()){
            System.out.println("Acesso Permitido!!");
        }else{
            System.out.println("Acesso Negado!!!");
        }

        if(new funcAutentica(new Diretor(usuario,senha)).autenticar()){
            System.out.println("Acesso");
        }else{
            System.out.println("Negado");
        }
    }
}
