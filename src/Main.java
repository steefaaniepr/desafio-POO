import java.time.LocalDate;
// import java.util.ArrayList;
// import java.util.List;

import br.com.desafio.dominio.Bootcamp;
// import br.com.desafio.dominio.Conteudo;
import br.com.desafio.dominio.Curso;
import br.com.desafio.dominio.Dev;
import br.com.desafio.dominio.Mentoria;

public class Main {
    
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição Curso Js");
        curso2.setCargaHoraria(4);

        // Conteudo conteudo = new Curso();
        // List<String> palavras = new ArrayList<>();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição de Mentoria");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer ");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devStefanie = new Dev();
        devStefanie.setNome("Stefanie");
        devStefanie.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Stefanie" + devStefanie.getConteudosIscritos());
        devStefanie.progredir();
        System.out.println("Conteudos Inscritos Stefanie" + devStefanie.getConteudosIscritos());
        System.out.println("Conteudos Concluidos Stefanie" + devStefanie.getConteudosConcluidos());

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosIscritos());
        devCamila.progredir();
        System.out.println("Conteudos Inscritos Camila" + devCamila.getConteudosIscritos());
        System.out.println("Conteudos Concluidos Camila" + devCamila.getConteudosConcluidos());


    


    }
}
