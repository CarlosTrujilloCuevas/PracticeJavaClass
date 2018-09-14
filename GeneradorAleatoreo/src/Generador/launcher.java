package Generador;

import Generador.Armas.Arco;
import Generador.Armas.ArmaPadre;
import Generador.Armas.Espada;
import Generador.Armas.Hacha;
import Generador.Armas.Shuriken;
import java.util.ArrayList;
import java.util.Scanner;

public class launcher {

    static ArrayList<ArmaPadre> nuevaArma = new ArrayList();
    static ArmaPadre ordenador1;
    static ArmaPadre ordenador2;
    static ArmaPadre aux;
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion, eleccion;
        do {
            System.out.println("Actualmente tienes " + nuevaArma.size() + " armas disponibles en tu inventario.");
            System.out.println(" 1 - Crear un arma nueva ?");
            System.out.println(" 2 - Revisar entre las que tengo.");
            System.out.println(" 3 - Revisar todas las armas en inventario");
            System.out.println(" 4 - Eliminar un arma de mi inventario");
            System.out.println(" 5 - Ordenar por Nivel de poder");
            System.out.println(" 6 - Salir");
            System.out.print("----------Ingresar opcion : ");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    creador();
                    break;
                case 2:
                    System.out.print("Tienes " + nuevaArma.size() + " armas en tu inventario ingresa un numero entre 1 y " + nuevaArma.size() + " : ");
                    do {
                        eleccion = entrada.nextInt();
                        if (eleccion < 1 || eleccion > nuevaArma.size()) {
                            System.out.println("No hay un arma en la pocision ingesada");
                        }
                    } while (eleccion < 1 || eleccion > nuevaArma.size());
                    mostrarArmas((eleccion - 1), opcion);
                    break;
                case 3:
                    if (!nuevaArma.isEmpty()) {
                        mostrarArmas(opcion, opcion);
                    } else {
                        System.out.println("No hay armas en tu inventario aun. Crea una ! ");
                    }
                    break;
                case 4:
                    if (!nuevaArma.isEmpty()) {
                        System.out.print("Tienes " + nuevaArma.size() + " armas en tu inventario ingresa un numero entre 1 y " + nuevaArma.size() + " : ");
                        eleccion = entrada.nextInt();
                        mostrarArmas((eleccion - 1), opcion);
                    } else {
                        System.out.println("No hay nada que borrar en tu inventario");
                    }
                    break;
                case 5:
                    ordenarArreglo(nuevaArma.size());
            }

        } while (true);

    }

    public static void ordenarArreglo(int a) {

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                ordenador1 = nuevaArma.get(i);
                ordenador2 = nuevaArma.get(j);
                if (ordenador2.getDamage() > ordenador1.getDamage()) {
                    nuevaArma.set(i, ordenador2);
                    nuevaArma.set((j), ordenador1);
                }
                System.out.println(ordenador1.getDamage() < ordenador2.getDamage());

            }
        }
    }

    public static void mostrarArmas(int index, int opcion) {
        String respuesta;

        if (opcion == 2) {
            ArmaPadre arma = nuevaArma.get(index);
            System.out.println(arma.toString());
        } else if (opcion == 3) {
            System.out.println("\t====INVENTARIO====\n");
            for (ArmaPadre mostrarArmas : nuevaArma) {
                System.out.println(mostrarArmas.toString());
                System.out.println("\n- - - - - - - - - - - - -");
            }
        } else if (opcion == 4) {
            System.out.println("\t====BORRANDO====\n");
            ArmaPadre arma = nuevaArma.get(index);
            System.out.println(arma.toString());
            System.out.print("\n----------- Deseas borrar este elemento??[si/no] : ");
            respuesta = entrada.next();
            if (("si").equals(respuesta)) {
                System.out.println("Elemento eliminado . . . ");
                nuevaArma.remove(index);
            } else {
                System.out.println("Eliminacion de elemento abortado  !!");
            }
        }
    }

    public static void creador() {
        int randomWeapon = createRandomNumber(4) + 1;
        switch (randomWeapon) {
            case 1:
                Arco arco = new Arco(createName(), "NewWeapon", createRandomAttribute(), randomDamage(randomWeapon), randomRange(randomWeapon), "Arco Elfico");
                nuevaArma.add(arco);
                System.out.println("Un arco fue creado");
                break;
            case 2:
                Espada espada = new Espada(createName(), "NewWeapon", createRandomAttribute(), randomDamage(randomWeapon), "Espada Mandoble", randomMult(randomWeapon));
                nuevaArma.add(espada);
                System.out.println("Una espada fue creada");
                break;
            case 3:
                Hacha hacha = new Hacha(createName(), "NewWeapon", createRandomAttribute(), randomDamage(randomWeapon), "HachaCabrona", randomMult(randomWeapon), randomMult(randomWeapon));
                nuevaArma.add(hacha);
                System.out.println("Un Hacha fue creada");
                break;
            case 4:
                Shuriken shuriken = new Shuriken(createName(), "NewWeapon", createRandomAttribute(), randomDamage(randomWeapon), "FuumaShuriken", randomRange(randomWeapon), randomMult(randomWeapon));
                nuevaArma.add(shuriken);
                System.out.println("Un shuriken fue creado");
                break;
        }
    }

    public static String createName() {
        String[] randomNames = {"Gladius", "Kinslayer", "Lifedrinker", "Treacherys Carver", "Fierce Carver", "Fortunes Gold Etcher", "Vowed Iron Spellblade", "Nightbane", "Cunning of the Banished", "Knightfall", "Etcher of the Harvest", "Faithkeeper", "Annihilation of Pride"};
        int randomNum = createRandomNumber(randomNames.length);
        return randomNames[randomNum];
    }

    public static int createRandomNumber(int a) {
        int generate = (int) (Math.random() * a);
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
