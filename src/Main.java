import br.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Java");
        mentoria.setDescricao("Muito bom");
        mentoria.setData(LocalDate.now());

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setDescricao("Bom");
        curso1.setCargaHoraria(8);


        Curso curso2 = new Curso();
        curso2.setTitulo("C++");
        curso2.setDescricao("Bom");
        curso2.setCargaHoraria(10);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("descricao Bootcamp Java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCarlos = new Dev();
        devCarlos.setNome("carlos");
        devCarlos.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Carlos"+devCarlos.getConteudosInscritos());
        devCarlos.progredir();
        devCarlos.progredir();
        System.out.println("--");
        System.out.println("Conteudos inscritos Carlos"+devCarlos.getConteudosInscritos());
        System.out.println("Conteudos concluidos Carlos"+devCarlos.getConteudosConcluidos());
        System.out.println("XP:"+devCarlos.calcularTotalXP());



        System.out.println("-------------");
        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos Joao"+devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();

        System.out.println("--");
        System.out.println("Conteudos inscritos Joao"+devJoao.getConteudosInscritos());
        System.out.println("Conteudos concluidos Joao"+devCarlos.getConteudosConcluidos());
        System.out.println("XP:"+devJoao.calcularTotalXP());


    }
}
