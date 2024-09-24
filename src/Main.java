import java.time.LocalDate;
// import java.util.ArrayList;
// import java.util.List;

// import br.com.desafio.dominio.Conteudo;
import br.com.desafio.dominio.Curso;
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

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);


    }
}
