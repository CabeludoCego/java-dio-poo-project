import java.time.LocalDate;

import dio.desafio.Bootcamp;
import dio.desafio.Conteudo;
import dio.desafio.Curso;
import dio.desafio.Dev;
import dio.desafio.Mentoria;

public class Main {
	public static void main(String[] args) throws Exception {
			System.out.println("Hello, World!");

			Curso curso1 = new Curso();
			curso1.setTitulo("Curso de Java básico");
			curso1.setDescricao("Curso introdutorio a java");
			curso1.setCargaHoraria(20);

			Curso curso2 = new Curso();
			curso2.setTitulo("Curso de PHP básico");
			curso2.setDescricao("Curso introdutorio a php");
			curso2.setCargaHoraria(16);

			System.out.println(curso1);

			Mentoria mentoria1 = new Mentoria();
			mentoria1.setTitulo("Mentoria de Spring");
			mentoria1.setDescricao("Bem legal");
			mentoria1.setData(LocalDate.now());

			// // ----- Polimorfismo ------
			// Conteudo conteudo1 = new Curso();
			// // Tudo de Conteudo está em curso. 
			// // Mas nem tudo de curso, está em conteudo.
			// // + Conteudo é abstrato.
			// conteudo1.setTitulo("Aula experimental");
			// conteudo1.setDescricao("Aula feita por um trainee");
			// // De modo que conteudo não tem atributos únicos de curso, como setCargaHoraria
		
			Bootcamp bootcamp1 = new Bootcamp();
			bootcamp1.setNome("Java developer");
			bootcamp1.setDescricao("Bootcamp de java");
			bootcamp1.getConteudos().add(curso1);
			bootcamp1.getConteudos().add(curso2);
			bootcamp1.getConteudos().add(mentoria1);

			Dev dev_junior = new Dev();
			Dev dev_estag = new Dev();

			dev_junior.setNome("Rick");
			dev_estag.setNome("Morty");
			
			dev_junior.InscreverBootcamp(bootcamp1);
			dev_estag.InscreverBootcamp(bootcamp1);

			System.out.println("Conteudos que estagiário vai ver: " + dev_estag.getConteudosInscritos());

			dev_junior.progredir();
			dev_junior.progredir();
			dev_estag.progredir();

			System.out.println("Aulas que dev junior já viu:" + dev_junior.getConteudosConcluidos());

			System.out.println("Xp do junior:" + dev_junior.calcularTotalXp());
			
			System.out.println("Xp do estag:" + dev_estag.calcularTotalXp());
			
		}
}

