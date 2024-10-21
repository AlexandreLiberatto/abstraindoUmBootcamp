package abstraindo_um_bootcamp;

public class Cursos extends Conteudo {

    //Atributo
    private int cargaHoraria;

    public Cursos(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }



    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }



    @Override
    public double calcularXp(double xp_padrao) {
        double total_xp = 0;
        for(int i = 0; i <= cargaHoraria.length; i++){
           total_xp += xp_padrao;
        }
        return total_xp;
    }

    

}
