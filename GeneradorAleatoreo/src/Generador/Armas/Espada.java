package Generador.Armas;

public class Espada extends ArmaCuerpoACuerpo {

    public Espada(String name, String leyend, String attribute, Double damage, String type, Double multiplify) {
        super(multiplify);
        this.type = type;
        this.attribute = attribute;
        this.leyend = leyend;
        this.damage = damage;
        this.name = name;
    }

    @Override
    public String toString() {
        String dato = "Arma : " + this.type + "   -   " + this.name + "\nHistoria : " + this.leyend + "\nAtributo : " + this.attribute + "\nDamage : " + this.damage * this.multiplify;
        return dato;
    }
}
