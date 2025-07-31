package org.example.Executavel;

import org.example.classes.subClass.*;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Escola {
	public static List<Aluno> alunos = new ArrayList<Aluno>();

	public static void main(String[] args) {
		for(int i = 1; i <= 2; i++){
			Aluno1();
		}
//			boolean listaAlunos = false;// coloquei so pra não ficar entrando nessa função
//			if(listaAlunos == true) {
//
//				System.out.println("Aluno = " + aluno.getNome());
//
//				for (disciplina disc : aluno.getDisciplinas()) {
//					System.out.println("Materia = " + disc.getDisciplina() + " | " + "Nota = " + disc.getNota());
//				}
//				System.out.println("media final = " + aluno.getStatus() + " | " + "media = " + aluno.getMediaAl());
//				System.out.println("----------------------------------------------------");
//			}
	}
	// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------


	public static void Aluno1() {
		Aluno aluno = new Aluno();
		
		//	--------- /*Entrada de Dados do Aluno*/ ---------
		String nome = JOptionPane.showInputDialog("Nome Completo: ");
//			String idade = JOptionPane.showInputDialog("Idade: "); // convertido em INT dentro do SetIdade
//			String cpf = JOptionPane.showInputDialog("CPF: ");
//			String rg = JOptionPane.showInputDialog("RG:  ");
//			String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento: ");
//			String dataMatricula = JOptionPane.showInputDialog("Data da Matricula: ");
//			String serieEscolar = JOptionPane.showInputDialog("Serie Escolar: ");
//			String nomeEscola = JOptionPane.showInputDialog("Informe o Nome da escola: ");
//			String residencia = JOptionPane.showInputDialog("Local da Residencia: ");
		//	--------- /*Entrada de Dados do Aluno*/ ---------		
		int idade = 22;
		if(Integer.valueOf(idade) <=17){ // caso for menor de Idade Vai entrar Nessa condição
		//	--------- /*Entrada de Dados País do Aluno*/ ---------
		String nomeMae = JOptionPane.showInputDialog("Informe o Nome da Mãe: ");
		String nomePai = JOptionPane.showInputDialog("Informe o Nome do Pai: ");
		String telMae = JOptionPane.showInputDialog("Informe o Telefone da Mãe: "); // Converção in Double dentro do Setter
		String telPai = JOptionPane.showInputDialog("Informe o Telefone do Pai: "); // Converção in Double dentro do Setter
		String emailMae = JOptionPane.showInputDialog("Informe o E-mail da Mãe: ");
		String emailPai = JOptionPane.showInputDialog("Informe o E-mail do Pai: ");
		String cpfMae = JOptionPane.showInputDialog("CPF da Mãe: ");
		String rgMae = JOptionPane.showInputDialog("RG da Mãe: ");
		String cpfPai = JOptionPane.showInputDialog("CPF do Pai: ");
		String rgPai = JOptionPane.showInputDialog("RG do Pai: ");
		//	--------- /*Entrada de Dados País do Aluno*/ ---------

		//	--------- /*Dados Do Pais do Aluno*/ ---------
		aluno.setNomeMae(nomeMae);
		aluno.setNomePai(nomePai);
		aluno.setTelMae(Double.valueOf(telMae));
		aluno.setTelPai(Double.valueOf(telPai));
		aluno.setEmailMae(emailMae);
		aluno.setEmailPai(emailPai);
		aluno.setCpfMae(cpfMae);
		aluno.setRgMae(rgMae);
		aluno.setCpfPai(cpfPai);
		aluno.setRgPai(rgPai);
		//	--------- /*Dados Do Pais do Aluno*/ ---------
		}
		
		//	--------- /*Entrada de Dados da Nota*/ ---------
		for(int i = 1; i <= 2; i++){
			disciplina disciplina = new disciplina();

			String nomeDisciplina = JOptionPane.showInputDialog("Digite o Nome da Disciplina "+i+": ");
			String notaDisciplina = JOptionPane.showInputDialog("Digite a Nota da Disciplina "+i+": ");
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			aluno.getDisciplinas().add(disciplina);
		}
		while(true){
//			System.out.println("------------------------------------------------------------");
//			for(disciplina listDisciplina : aluno.getDisciplinas()){
//				System.out.println(listDisciplina);
//			}

			int escolhaRemover = JOptionPane.showConfirmDialog(null,"Deseja remover Alguma dessas Disciplina?");

			if(escolhaRemover == 0){
				String removeDisciplina = JOptionPane.showInputDialog("Qual disciplina deseja remover? | 1 | 2 | 3 | 4 | : ");
				aluno.getDisciplinas().remove(Integer.valueOf(removeDisciplina).intValue() - 1);
			}else{
				break;
			}

		}
		//	--------- /*Entrada de Dados da Nota*/ ---------
		
	//	--------- /*Dados Do Aluno*/ ---------
		aluno.setNome(nome);
//			aluno.setIdade(Integer.valueOf(idade));
//			aluno.setNomeEscola(nomeEscola);
//			aluno.setCpf(cpf);
//			aluno.setRg(rg);
//			aluno.setDataNascimento(dataNascimento);
//			aluno.setDataMatricula(dataMatricula);
//			aluno.setSerieEscolar(serieEscolar);
//			aluno.setResidencia(residencia);
	//	--------- /*Dados Do Aluno*/ ---------

		alunos.add(aluno);
//
//		System.out.println("----------Status Aluno----------");
//		System.out.println("Nome: "+ aluno.getNome());
//		System.out.println("Idade: "+ aluno.getIdade());
//		System.out.println("Nome Escola: "+ aluno.getNomeEscola());
//		System.out.println("CPF: "+ aluno.getCpf());
//		System.out.println("RG: "+ aluno.getRg());
//		System.out.println("Data Nascimento: "+ aluno.getDataNascimento());
//		System.out.println("Data Matricula: "+ aluno.getDataMatricula());
//		System.out.println("Serie Escolar: "+ aluno.getSerieEscolar());
//		System.out.println("Residencia: "+ aluno.getResidencia());
//		System.out.println("Média: "+ aluno.getMediaAl());
//		System.out.println("Resultado: "+ (aluno.getStatus() ? "Aprovado" : "Reprovado"));
//		System.out.println("");
//		for(disciplina listDisciplina : aluno.getDisciplinas()){
//			System.out.println(listDisciplina);
//		}
//		System.out.println("------------------------------------------------------------");

	}
}