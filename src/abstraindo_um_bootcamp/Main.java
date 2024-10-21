package abstraindo_um_bootcamp;

package abstraindo_um_bootcamp;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
public class Main {
    public static void main(String[] args) {
        Cursos cursoJava = new Cursos("Java Básico", "Descrição do curso Java", 8);
        Mentorias mentoriaJava = new Mentorias("Mentoria Java", "Descrição da mentoria", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição do bootcamp");
        bootcamp.adicionarConteudo(cursoJava);
        bootcamp.adicionarConteudo(mentoriaJava);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("Conteúdos Concluídos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP Total: " + devJoao.calcularTotalXp());
    }
}
