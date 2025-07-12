package org.example.classes;

import org.example.constantes.statusAluno;

import java.util.ArrayList;
import java.util.Objects;

public class Aluno {
	// Dados do Aluno
	private String nome;
	private int idade;
	private String cpf;
	private String rg;
	private String dataNascimento;
	private String dataMatricula;
	private String serieEscolar;
	private String nomeEscola;
	private String residencia;
	// Dados do Aluno
	
	private ArrayList<disciplina> Disciplinas = new ArrayList<disciplina>();

	// Dados dos Pais do Aluno
	private String nomeMae;
	private String nomePai;
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
	
	public void setDisciplinas(ArrayList<disciplina> disciplina) {
		Disciplinas = disciplina;
	}
	public ArrayList<disciplina> getDisciplinas() {
		return Disciplinas;
	}
	
	public void setNome(String nome) {// Recebe os Dados
		this.nome = nome;
	}

	public String getNome() {// Apenas Retorna o Nome(Variavel)
		return nome;
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
	public int hashCode() {
		return Objects.hash(Disciplinas, cpf, cpfMae, cpfPai, dataMatricula, dataNascimento, emailMae, emailPai, idade,
				nome, nomeEscola, nomeMae, nomePai, residencia, rg, rgMae, rgPai, serieEscolar, telMae, telPai);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(Disciplinas, other.Disciplinas) && Objects.equals(cpf, other.cpf)
				&& Objects.equals(cpfMae, other.cpfMae) && Objects.equals(cpfPai, other.cpfPai)
				&& Objects.equals(dataMatricula, other.dataMatricula)
				&& Objects.equals(dataNascimento, other.dataNascimento) && Objects.equals(emailMae, other.emailMae)
				&& Objects.equals(emailPai, other.emailPai) && idade == other.idade && Objects.equals(nome, other.nome)
				&& Objects.equals(nomeEscola, other.nomeEscola) && Objects.equals(nomeMae, other.nomeMae)
				&& Objects.equals(nomePai, other.nomePai) && Objects.equals(residencia, other.residencia)
				&& Objects.equals(rg, other.rg) && Objects.equals(rgMae, other.rgMae)
				&& Objects.equals(rgPai, other.rgPai) && Objects.equals(serieEscolar, other.serieEscolar)
				&& Objects.equals(telMae, other.telMae) && Objects.equals(telPai, other.telPai);
	}
//	---------------------------- /*HastCode e Equals*/ ----------------------------

	
//	---------------------------- /*ToString*/ ---------------------------
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", cpf=" + cpf + ", rg=" + rg + ", dataNascimento="
				+ dataNascimento + ", dataMatricula=" + dataMatricula + ", serieEscolar=" + serieEscolar
				+ ", nomeEscola=" + nomeEscola + ", residencia=" + residencia + ", Disciplina=" + Disciplinas
				+ ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", telMae=" + telMae + ", telPai=" + telPai
				+ ", emailMae=" + emailMae + ", emailPai=" + emailPai + ", cpfMae=" + cpfMae + ", rgMae=" + rgMae
				+ ", cpfPai=" + cpfPai + ", rgPai=" + rgPai + "]";
	}
//	---------------------------- /*ToString*/ ---------------------------

}
