package Generador.Armas;

public class Arma_Rango extends ArmaPadre {

    Double range;

    public Arma_Rango(Double range) {
        this.range = range;
    }

    @Override
    public String ataque() {
        String atk = "Esta arma ataca a rango !";
        return atk;
    }
}
