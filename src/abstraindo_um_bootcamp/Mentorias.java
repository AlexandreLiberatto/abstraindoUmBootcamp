package abstraindo_um_bootcamp;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class Mentorias extends Conteudo {

    private LocalDate data;

    public Mentorias(String titulo, String descricao, LocalDate data) {
        setTitulo(titulo);
        setDescricao(descricao);
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20.0; // XP fixo adicional para mentorias
    }

    // Getters e Setters
    public LocalDate getData() { return data; }
    public void setData(LocalDate data) { this.data = data; }
}
