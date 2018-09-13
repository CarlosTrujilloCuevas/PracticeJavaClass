package Generador;

import Generador.Armas.Arco;
import Generador.Armas.Espada;
import Generador.Armas.Hacha;
import Generador.Armas.Shuriken;
import java.util.Scanner;

public class launcher {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int creacion;
        do {
            System.out.println("Deceas seguir creando armas??[1-si/2-no]");
            creacion = entrada.nextInt();
            int randomWeapon = createRandomNumber(4);
            switch (randomWeapon) {
                case 1:
                    Arco arco = new Arco(createName(), "NewWeapon", createRandomAttribute(), randomDamage(randomWeapon), randomRange(randomWeapon), "Arco Elfico");
                    System.out.println(arco.toString());
                    System.out.println(arco.ataque());
                    break;
                case 2:
                    Espada espada = new Espada(createName(), "NewWeapon", createRandomAttribute(), randomDamage(randomWeapon), "Espada Mandoble", randomMult(randomWeapon));
                    System.out.println(espada.toString());
                    System.out.println(espada.ataque());
                    break;
                case 3:
                    Hacha hacha = new Hacha(createName(), "NewWeapon", createRandomAttribute(), randomDamage(randomWeapon), "HachaCabrona", randomMult(randomWeapon), randomMult(randomWeapon));
                    System.out.println(hacha.toString());
                    System.out.println(hacha.ataque());
                    break;
                case 4:
                    Shuriken shuriken = new Shuriken(createName(), "NewWeapon", createRandomAttribute(), randomDamage(randomWeapon), "FuumaShuriken", randomRange(randomWeapon), randomMult(randomWeapon));
                    System.out.println(shuriken.toString());
                    System.out.println(shuriken.ataque());
                    break;
            }
        } while (creacion != 0);
    }

    public static String createName() {
        String[] randomNames = {"Gladius", "Kinslayer", "Lifedrinker", "Treacherys Carver", "Fierce Carver", "Fortunes Gold Etcher", "Vowed Iron Spellblade", "Nightbane", "Cunning of the Banished", "Knightfall", "Etcher of the Harvest", "Faithkeeper", "Annihilation of Pride"};
        int randomNum = createRandomNumber(randomNames.length);
        return randomNames[randomNum];
    }

    public static int createRandomNumber(int a) {
        int generate = (int) (Math.random() * a) + 1;
        return generate;
    }

    public static String createRandomAttribute() {
        String[] randomAttribute = {"Poison", "Dark", "Light", "Aqua", "Fire", "Earth", "Wind", "Ice", "Ghost", "Dragon", "Electric", "Metal"};
        int randomNum = createRandomNumber(randomAttribute.length);
        return randomAttribute[randomNum];
    }

    public static Double randomDamage(int weapon) {
        double damage = 0;
        switch (weapon) {
            case 1:
                damage = (Math.random() * 10000) + 5000;
                break;
            case 2:
                damage = (Math.random() * 10000) + 6000;
                break;
            case 3:
                damage = (Math.random() * 15000) + 7000;
                break;
            case 4:
                damage = (Math.random() * 8000) + 4000;
                break;
        }
        return damage;
    }

    public static Double randomRange(int weapon) {
        double range = 0;
        switch (weapon) {
            case 1:
                range = (Math.random() * 100) + 50;
                break;
            case 4:
                range = (Math.random() * 70) + 40;
                break;
        }

        return range;
    }

    public static Double randomMult(int weapon) {
        double mult = 0;
        switch (weapon) {
            case 2:
                mult = Math.random() + 1;
                break;
            case 3:
                mult = (Math.random() * 2) + 1;
                break;
            case 4:
                mult = (Math.random() * 3) + 1;
        }
        return mult;
    }

    public static String leyend() {
        String[] leyends = {""};
        return null;
    }
}
