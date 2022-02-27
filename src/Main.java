import br.dio.desafio.dominio.Conteudo;
import br.dio.desafio.dominio.Curso;
import br.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){

        Mentoria ment = new Mentoria();
        ment.setTitulo("Java");
        ment.setDescricao("Muito bom");
        ment.setData(LocalDate.now());

        Curso curso1 = new Curso();
        curso1.setTitulo("Java");
        curso1.setTitulo("Pessimo");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("C++");
        curso2.setTitulo("Bom");
        curso2.setCargaHoraria(10);
        System.out.println(curso2);
        System.out.println(ment);
    }
}
