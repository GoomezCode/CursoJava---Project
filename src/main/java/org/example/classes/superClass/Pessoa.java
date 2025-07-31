package org.example.classes.superClass;

public abstract class Pessoa { // this is a superClass
    private String nome;
    private int idade;
    private String cpf;
    private String rg;
    private String dataNascimento;
    private String residencia;
    private String nomeMae;
    private String nomePai;

    public abstract Double salario();
    /*
        Método abstrato:
            Podemos escrever que determinando
            método será sempre escrito pelas
            classes filhas.

            Esse método e que fica na SueprClass
            ela e obrigatória para as SubClass
    */

//	---------------------------- /*Setters é Getters*/ ----------------------------
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getResidencia() {
        return residencia;
    }

    public void setResidencia(String residencia) {
        this.residencia = residencia;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }
//	---------------------------- /*Setters é Getters*/ ----------------------------

//	---------------------------- /*ToString*/ ---------------------------
    @Override
    public String toString() {
        return "pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", dataNascimento='" + dataNascimento + '\'' +
                ", residencia='" + residencia + '\'' +
                ", nomeMae='" + nomeMae + '\'' +
                ", nomePai='" + nomePai + '\'' +
                '}';
    }
//	---------------------------- /*ToString*/ ---------------------------
}
