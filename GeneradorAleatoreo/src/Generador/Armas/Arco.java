package Generador.Armas;

public class Arco extends Arma_Rango {

    public Arco(String name, String leyend, String attribute, Double damage, Double range, String type) {
        super(range);
        this.type = type;
        this.name = name;
        this.leyend = leyend;
        this.attribute = attribute;
        this.damage = damage;
    }

    @Override
    public String toString() {
        String dato = "Arma : " + this.type + "   -   " + this.name + "\nHistoria : " + this.leyend + "\nAtributo : " + this.attribute + "\nDamage : " + this.damage + "  -  Range : " + this.range;
        return dato;
    }
}
