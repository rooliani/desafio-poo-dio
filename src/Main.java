import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRogeria = new Dev();
        devRogeria.setNome("Rogéria");
        devRogeria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Rogéria:" + devRogeria.getConteudosInscritos());

        devRogeria.progredir();
        devRogeria.progredir();
        System.out.println("--------");
        System.out.println("Conteúdos Concluídos Rogéria:" + devRogeria.getConteudosConcluidos());
        System.out.println("Conteúdos Inscritos Rogéria:" + devRogeria.getConteudosInscritos());
        System.out.println("XP:" + devRogeria.calcularTotalXp());

        System.out.println("--------------------------------------------------------------");

        Dev devJoão = new Dev();
        devJoão.setNome("João");
        devJoão.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoão.getConteudosInscritos());

        devJoão.progredir();
        devJoão.progredir();
        devJoão.progredir();
        System.out.println("--------");
        System.out.println("Conteúdos Inscritos Rogéria:" + devRogeria.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos João:" + devJoão.getConteudosConcluidos());
        System.out.println("XP:" + devJoão.calcularTotalXp());
    }
}
