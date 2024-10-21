package abstraindo_um_bootcamp;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;
public abstract class Conteudo {

    private String titulo;
    private String descricao;
    protected static final double XP_PADRAO = 10.0;

    public abstract double calcularXp();

    // Getters e Setters
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
}
