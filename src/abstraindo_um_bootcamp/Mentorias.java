package abstraindo_um_bootcamp;

public class Mentorias extends Conteudo {

    //Atributo
    private LocalDate data;


    @Override
    public double calcularXp(double xp_padrao) {
        double total_xp = 0;
        for(int i = 0; i <= cargaHoraria.length; i++){
           total_xp += xp_padrao;
        }
        return total_xp;
    }


    public LocalDate getData() {
        return data;
    }


    public void setData(LocalDate data) {
        this.data = data;
    }

    

}
