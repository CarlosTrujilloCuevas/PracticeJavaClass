package Generador.Armas;

public class ArmaCuerpoACuerpo extends ArmaPadre {

    Double multiplify;

    public ArmaCuerpoACuerpo(Double multiplify) {
        this.multiplify = multiplify;
    }

    @Override
    public String ataque() {
        String atk = "Esta arma ataca cuerpo a cuerpo";
        return atk;
    }
}
