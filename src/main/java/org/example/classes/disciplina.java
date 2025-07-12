package org.example.classes;

import java.util.Objects;


public class disciplina {
	// Nota do Aluno
		private String disciplina;
		private Double nota;
	// Nota do Aluno
		
//		---------------------------- /*Setters é Getters*/ ----------------------------
		public String getDisciplina() {
			return disciplina;
		}

		public void setDisciplina(String disciplina) {
			this.disciplina = disciplina;
		}

		public Double getNota() {
			return nota;
		}

		public void setNota(Double nota) {
			this.nota = nota;
		}
//		---------------------------- /*Setters é Getters*/ ----------------------------
		
//		---------------------------- /*HastCode e Equals*/ ----------------------------
		@Override
		public int hashCode() {
			return Objects.hash(disciplina, nota);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			disciplina other = (disciplina) obj;
			return Objects.equals(disciplina, other.disciplina) && Objects.equals(nota, other.nota);
		}
//		---------------------------- /*HastCode e Equals*/ ----------------------------

		
//		---------------------------- /*ToString*/ ---------------------------
		@Override
		public String toString() {
			return "disciplina [disciplina=" + disciplina + ", nota=" + nota + "]";
		}
//		---------------------------- /*ToString*/ ---------------------------

}
