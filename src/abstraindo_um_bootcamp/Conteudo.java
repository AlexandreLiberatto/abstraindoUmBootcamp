package abstraindo_um_bootcamp;

abstract class Conteudo {

    //Atributos
    private String titulo;
    private String descricao;
    final double xp_padrao;


    public Conteudo(String titulo, String descricao, double xp_padrao){
        this.titulo = titulo;
        this.descricao = descricao;
        this.xp_padrao = xp_padrao;
    }

    public abstract double calcularXp(double xp_padrao){
        
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public double getXp_padrao() {
        return xp_padrao;
    }

    

}
