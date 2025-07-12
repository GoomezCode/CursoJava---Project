package org.example.Funcao;


import org.example.Executavel.Escola;
import org.example.classes.Aluno;
import org.example.constantes.statusAluno;

public class funcList {
    public static Escola list = new  Escola();

    public static void listAprovado() {
        System.out.println("----------------------- LIST APROVADO -----------------------");
        for(Aluno lista: list.alunos){
            if(lista.getStatus() == statusAluno.APROVADO){
                System.out.println(lista.getNome() +" | Media = "+ lista.getMediaAl());
            }
        }
    }

    public static void listReprovado() {
        System.out.println("----------------------- LIST REPROVADO -----------------------");
        for(Aluno lista: list.alunos){
            if(lista.getStatus() == statusAluno.REPROVADO){
                System.out.println(lista.getNome() +" | Media = "+ lista.getMediaAl());
            }
        }
    }

    public static void listRecuperacao() {
        System.out.println("----------------------- LIST RECUPERAÇÃO -----------------------");
        for (Aluno lista : list.alunos) {
            if (lista.getStatus() == statusAluno.RECUPERACAO) {
                System.out.println(lista.getNome() + " | Media = " + lista.getMediaAl());
            }
        }
    }

}