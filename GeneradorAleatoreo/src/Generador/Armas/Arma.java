package Generador.Armas;

public abstract class Arma {

    String type;
    String name;
    String leyend;
    String attribute;
    Double damage;

    public String ataque() {
        return "Esta arma ataca ";
    }
}
