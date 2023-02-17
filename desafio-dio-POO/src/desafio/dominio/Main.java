package desafio.dominio;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Curso curso1 = new Curso();
		Mentoria mentoria1 = new Mentoria();
		Conteudo conteudo = new Curso();
		
		curso1.setTitulo("Curso Java");
		curso1.setDescricao(" POO");
		curso1.setCargaHoraria(12);
		
		mentoria1.setTitulo("Conseguindo o primeiro emprego");
		mentoria1.setDescricao("Mentoria sobre o caminho da primeira vaga");
		mentoria1.setData(LocalDate.now());
		
		conteudo.setTitulo("Java Avançado");
		conteudo.setTitulo("Curso de Java avançado");
		
		
		
		System.out.println(curso1);
		
	}
}
