package org.example.classes.subClass;

import org.example.classes.superClass.pessoa;
import org.example.constantes.statusAluno;

import java.util.ArrayList;
import java.util.Objects;

public class Aluno extends pessoa { // this is a subClass
	// Dados do Aluno
	private String dataMatricula;
	private String serieEscolar;
	private String nomeEscola;
	// Dados do Aluno
	
	private ArrayList<disciplina> Disciplinas = new ArrayList<disciplina>();

	// Dados dos Pais do Aluno
	private Double telMae;
	private Double telPai;
	private String emailMae;
	private String emailPai;
	private String cpfMae;
	private String rgMae;
	private String cpfPai;
	private String rgPai;
	// Fechamento dos Dados
	
//	---------------------------- /*Setters é Getters*/ ----------------------------
	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getSerieEscolar() {
		return serieEscolar;
	}

	public void setSerieEscolar(String serieEscolar) {
		this.serieEscolar = serieEscolar;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public ArrayList<disciplina> getDisciplinas() {
		return Disciplinas;
	}

	public void setDisciplinas(ArrayList<disciplina> disciplinas) {
		Disciplinas = disciplinas;
	}

	public Double getTelMae() {
		return telMae;
	}

	public void setTelMae(Double telMae) {
		this.telMae = telMae;
	}

	public Double getTelPai() {
		return telPai;
	}

	public void setTelPai(Double telPai) {
		this.telPai = telPai;
	}

	public String getEmailMae() {
		return emailMae;
	}

	public void setEmailMae(String emailMae) {
		this.emailMae = emailMae;
	}

	public String getEmailPai() {
		return emailPai;
	}

	public void setEmailPai(String emailPai) {
		this.emailPai = emailPai;
	}

	public String getCpfMae() {
		return cpfMae;
	}

	public void setCpfMae(String cpfMae) {
		this.cpfMae = cpfMae;
	}

	public String getRgMae() {
		return rgMae;
	}

	public void setRgMae(String rgMae) {
		this.rgMae = rgMae;
	}

	public String getCpfPai() {
		return cpfPai;
	}

	public void setCpfPai(String cpfPai) {
		this.cpfPai = cpfPai;
	}

	public String getRgPai() {
		return rgPai;
	}

	public void setRgPai(String rgPai) {
		this.rgPai = rgPai;
	}

//	---------------------------- /*Setters é Getters*/ ----------------------------
	
//	---------------------------- /*Métodos De Calculos*/ ---------------------------
	
	public Double getMediaAl() {// Calculo Media do Aluno
		Double SomaNotas = 0.0;
		for (disciplina disciplina : Disciplinas) {
			SomaNotas += disciplina.getNota();
		}
		return SomaNotas / Disciplinas.size();
	}
	
	public String getStatus() {// Verificar Se ele foi Aprovado ou não
		Double media = this.getMediaAl();
			if(media >= 70) {
				return statusAluno.APROVADO;
			}if(media >= 50) {
				return statusAluno.RECUPERACAO;
			}else {
				return statusAluno.REPROVADO;
			}
	}	
//	---------------------------- /*Métodos De Calculos*/ ---------------------------	

//	---------------------------- /*HastCode e Equals*/ ----------------------------
	@Override
	public boolean equals(Object o) {
		if (o == null || getClass() != o.getClass()) return false;
		Aluno aluno = (Aluno) o;
		return Objects.equals(dataMatricula, aluno.dataMatricula) && Objects.equals(serieEscolar, aluno.serieEscolar) && Objects.equals(nomeEscola, aluno.nomeEscola) && Objects.equals(Disciplinas, aluno.Disciplinas) && Objects.equals(telMae, aluno.telMae) && Objects.equals(telPai, aluno.telPai) && Objects.equals(emailMae, aluno.emailMae) && Objects.equals(emailPai, aluno.emailPai) && Objects.equals(cpfMae, aluno.cpfMae) && Objects.equals(rgMae, aluno.rgMae) && Objects.equals(cpfPai, aluno.cpfPai) && Objects.equals(rgPai, aluno.rgPai);
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataMatricula, serieEscolar, nomeEscola, Disciplinas, telMae, telPai, emailMae, emailPai, cpfMae, rgMae, cpfPai, rgPai);
	}
//	---------------------------- /*HastCode e Equals*/ ----------------------------

	
//	---------------------------- /*ToString*/ ---------------------------
	@Override
	public String toString() {
		return "Aluno{" +
				"dataMatricula='" + dataMatricula + '\'' +
				", serieEscolar='" + serieEscolar + '\'' +
				", nomeEscola='" + nomeEscola + '\'' +
				", Disciplinas=" + Disciplinas +
				", telMae=" + telMae +
				", telPai=" + telPai +
				", emailMae='" + emailMae + '\'' +
				", emailPai='" + emailPai + '\'' +
				", cpfMae='" + cpfMae + '\'' +
				", rgMae='" + rgMae + '\'' +
				", cpfPai='" + cpfPai + '\'' +
				", rgPai='" + rgPai + '\'' +
				"} " + super.toString();
	}
//	---------------------------- /*ToString*/ ---------------------------

}
