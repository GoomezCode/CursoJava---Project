package org.example.classes.subClass;

import org.example.Interface.PermitirAcesso;
import org.example.classes.superClass.Pessoa;

import java.util.Objects;

public class Secretario extends Pessoa implements PermitirAcesso {

    private String registro;
    private String nivelCargo;
    private String experiencia;

//	---------------------------- /*Setters é Getters*/ ----------------------------

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getNivelCargo() {
        return nivelCargo;
    }

    public void setNivelCargo(String nivelCargo) {
        this.nivelCargo = nivelCargo;
    }

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }
//	---------------------------- /*Setters é Getters*/ ----------------------------

//	---------------------------- /*ToString*/ ---------------------------
    @Override
    public String toString() {
        return "Secretario{" +
                "registro='" + registro + '\'' +
                ", nivelCargo='" + nivelCargo + '\'' +
                ", experiencia='" + experiencia + '\'' +
                "} " + super.toString();
    }
//	---------------------------- /*ToString*/ ---------------------------

//	---------------------------- /*HashCode and Equals*/ ---------------------------
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Secretario that = (Secretario) o;
        return Objects.equals(registro, that.registro) && Objects.equals(nivelCargo, that.nivelCargo) && Objects.equals(experiencia, that.experiencia);
    }

    @Override
    public int hashCode() {
        return Objects.hash(registro, nivelCargo, experiencia);
    }
//	---------------------------- /*HashCode and Equals*/ ---------------------------

//	---------------------------- /*Métodos*/ ---------------------------
    @Override
    public Double salario() {
        return 2300.0;
    }/*This method is from the SuperClass */
//	---------------------------- /*Métodos*/ ---------------------------


//	---------------------------- /*Autenticação*/ ---------------------------
    private String usuario;
    private int senha;

    public Secretario(String usuario, int senha){
        this.usuario = usuario;
        this.senha = senha;
    }
    public Secretario(){}


    /*this is Method for the contract of a authentication*/
    @Override
    public boolean autenticar(String usuario, int senha) {
        // return usuario.equalsIgnoreCase("admin") && senha == 123;
        this.usuario = usuario;
        this.senha = senha;
        return autenticar();
    }

    @Override
    public boolean autenticar() {
        return usuario.equalsIgnoreCase("admin") && senha == 123;
    }
//	---------------------------- /*Autenticação*/ ---------------------------

}
