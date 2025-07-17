package org.example.Interface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;

import org.example.classes.subClass.Aluno;


import javax.swing.JTextField;
import javax.swing.JButton;

public class Index {
	Aluno dados = new Aluno();
	
	private JFrame frame;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JTextField txtResidencia;
	private JTextField txtCpf;
	private JTextField txtRg;
	private JTextField txtSerieEscolar;
	private JTextField txtDataNascimento;
	private JTextField txtNomeEscolar;
	private JTextField txtDataMatricula;
	private JTextField txtResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index window = new Index();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Index() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 300, 428);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("-------- Status Aluno --------");
		lblNewLabel.setBounds(40, 11, 194, 21);
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 15));
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome:");
		lblNewLabel_1.setFont(new Font("Georgia", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(50, 43, 51, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Idade:");
		lblNewLabel_1_1.setFont(new Font("Georgia", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(50, 82, 51, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Nome Escolar:");
		lblNewLabel_1_2.setFont(new Font("Georgia", Font.PLAIN, 15));
		lblNewLabel_1_2.setBounds(20, 232, 99, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("CPF:");
		lblNewLabel_1_3.setFont(new Font("Georgia", Font.PLAIN, 15));
		lblNewLabel_1_3.setBounds(50, 132, 51, 14);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("RG:");
		lblNewLabel_1_4.setFont(new Font("Georgia", Font.PLAIN, 15));
		lblNewLabel_1_4.setBounds(50, 157, 51, 14);
		frame.getContentPane().add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Data Nascimento:");
		lblNewLabel_1_5.setFont(new Font("Georgia", Font.PLAIN, 15));
		lblNewLabel_1_5.setBounds(10, 207, 127, 14);
		frame.getContentPane().add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Data Matricula:");
		lblNewLabel_1_6.setFont(new Font("Georgia", Font.PLAIN, 15));
		lblNewLabel_1_6.setBounds(10, 261, 127, 14);
		frame.getContentPane().add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Serie Escolar:");
		lblNewLabel_1_7.setFont(new Font("Georgia", Font.PLAIN, 15));
		lblNewLabel_1_7.setBounds(40, 182, 117, 14);
		frame.getContentPane().add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Residencia:");
		lblNewLabel_1_8.setFont(new Font("Georgia", Font.PLAIN, 15));
		lblNewLabel_1_8.setBounds(40, 107, 97, 14);
		frame.getContentPane().add(lblNewLabel_1_8);
		
		JLabel lblNewLabel_1_9 = new JLabel("Resultado:");
		lblNewLabel_1_9.setFont(new Font("Georgia", Font.PLAIN, 15));
		lblNewLabel_1_9.setBounds(20, 286, 83, 14);
		frame.getContentPane().add(lblNewLabel_1_9);
		
		txtNome = new JTextField(dados.getNomeEscola());
		txtNome.setEnabled(false);
		txtNome.setEditable(false);
		txtNome.setBounds(100, 41, 134, 20);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setEnabled(false);
		txtIdade.setEditable(false);
		txtIdade.setColumns(10);
		txtIdade.setBounds(100, 80, 134, 20);
		frame.getContentPane().add(txtIdade);
		
		txtResidencia = new JTextField();
		txtResidencia.setEnabled(false);
		txtResidencia.setEditable(false);
		txtResidencia.setColumns(10);
		txtResidencia.setBounds(121, 105, 134, 20);
		frame.getContentPane().add(txtResidencia);
		
		txtCpf = new JTextField();
		txtCpf.setEnabled(false);
		txtCpf.setEditable(false);
		txtCpf.setColumns(10);
		txtCpf.setBounds(100, 132, 134, 20);
		frame.getContentPane().add(txtCpf);
		
		txtRg = new JTextField();
		txtRg.setEnabled(false);
		txtRg.setEditable(false);
		txtRg.setColumns(10);
		txtRg.setBounds(100, 157, 134, 20);
		frame.getContentPane().add(txtRg);
		
		txtSerieEscolar = new JTextField();
		txtSerieEscolar.setEnabled(false);
		txtSerieEscolar.setEditable(false);
		txtSerieEscolar.setColumns(10);
		txtSerieEscolar.setBounds(140, 180, 134, 20);
		frame.getContentPane().add(txtSerieEscolar);
		
		txtDataNascimento = new JTextField();
		txtDataNascimento.setEnabled(false);
		txtDataNascimento.setEditable(false);
		txtDataNascimento.setColumns(10);
		txtDataNascimento.setBounds(140, 205, 134, 20);
		frame.getContentPane().add(txtDataNascimento);
		
		txtNomeEscolar = new JTextField();
		txtNomeEscolar.setEnabled(false);
		txtNomeEscolar.setEditable(false);
		txtNomeEscolar.setColumns(10);
		txtNomeEscolar.setBounds(121, 230, 134, 20);
		frame.getContentPane().add(txtNomeEscolar);
		
		txtDataMatricula = new JTextField();
		txtDataMatricula.setEnabled(false);
		txtDataMatricula.setEditable(false);
		txtDataMatricula.setColumns(10);
		txtDataMatricula.setBounds(121, 257, 134, 20);
		frame.getContentPane().add(txtDataMatricula);
		
		txtResultado = new JTextField();
		txtResultado.setEnabled(false);
		txtResultado.setEditable(false);
		txtResultado.setColumns(10);
		txtResultado.setBounds(100, 284, 134, 20);
		frame.getContentPane().add(txtResultado);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setFont(new Font("Serif", Font.BOLD, 15));
		btnFechar.setBounds(75, 343, 135, 23);
		frame.getContentPane().add(btnFechar);
	}
}
