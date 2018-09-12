package Generador.Armas;

public class Hacha extends ArmaCuerpoACuerpo {

    Double velocidad_portador;

    public Hacha(String name, String leyend, String attribute, Double damage, String type, Double multiplify, Double velocidad_portador) {
        super(multiplify);
        this.type = type;
        this.attribute = attribute;
        this.leyend = leyend;
        this.damage = damage;
        this.name = name;
        this.velocidad_portador = velocidad_portador;
    }

    @Override
    public String toString() {
        String dato = "Arma : " + this.type + "   -   " + this.name + "\nHistoria : " + this.leyend + "\nAtributo : " + this.attribute + "\nDamage : " + this.damage * this.multiplify + "\nVelocida : -" + this.velocidad_portador;
        return dato;
    }
}
