import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria de java");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("bootcamp java developer");
        bootcamp.setDescricao("descricao bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos concluídos: " + devCamila.getConteudosConcluidos());
        System.out.println("---");
        System.out.println("Conteúdos inscritos: " + devCamila.getConteudosInscritos());
        System.out.println("XP: " + devCamila.calcularXp());


        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteúdos concluídos: " + devJoao.getConteudosConcluidos());
        System.out.println("---");
        System.out.println("Conteúdos inscritos: " + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularXp());

    }
}