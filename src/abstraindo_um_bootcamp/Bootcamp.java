package abstraindo_um_bootcamp;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Bootcamp {

    private String nome;
    private String descricao;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private Set<Conteudo> conteudos = new HashSet<>();
    private Set<Dev> devsInscritos = new HashSet<>();

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = LocalDate.now();
        this.dataFim = dataInicio.plusDays(45); // Bootcamp com duração padrão de 45 dias
    }

    public void adicionarConteudo(Conteudo conteudo) {
        conteudos.add(conteudo);
    }

    public void listarConteudos() {
        System.out.println("Conteúdos do Bootcamp:");
        for (Conteudo c : conteudos) {
            System.out.println("- " + c.getTitulo());
        }
    }

    public void adicionarDev(Dev dev) {
        devsInscritos.add(dev);
    }

    public void listarDevs() {
        System.out.println("Devs inscritos no Bootcamp:");
        for (Dev dev : devsInscritos) {
            System.out.println("- " + dev.getNome());
        }
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public LocalDate getDataInicio() { return dataInicio; }
    public LocalDate getDataFim() { return dataFim; }

    public Set<Conteudo> getConteudos() { return conteudos; }
    public Set<Dev> getDevsInscritos() { return devsInscritos; }
}
