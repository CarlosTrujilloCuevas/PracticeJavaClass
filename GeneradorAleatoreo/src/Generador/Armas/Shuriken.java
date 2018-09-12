package Generador.Armas;

public class Shuriken extends Arma_Rango {

    Double velocidad_portador;

    public Shuriken(String name, String leyend, String attribute, Double damage, String type, Double range, Double velocidad_portador) {
        super(range);
        this.type = type;
        this.attribute = attribute;
        this.leyend = leyend;
        this.damage = damage;
        this.name = name;
        this.velocidad_portador = velocidad_portador;
    }

    @Override
    public String toString() {
        String dato = "Arma : " + this.type + "   -   " + this.name + "\nHistoria : " + this.leyend + "\nAtributo : " + this.attribute + "\nDamage : " + this.damage + "  -  Range : " + this.range + "\nVelocidad : +" + this.velocidad_portador;
        return dato;
    }
}
