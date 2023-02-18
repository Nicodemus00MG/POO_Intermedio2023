package POO_Intermedio;

import java.util.ArrayList;
import java.util.Scanner;

public class coleccionesObjetos {

    // ! atributos

    private static ArrayList<ConsolaVideojuego> consolas;
    // ! constructores

    // !metodos

    public static void main(String args[]) {

        consolas = new ArrayList<ConsolaVideojuego>();

        agregarConsolas();
        System.out.println(consolas.get(0).mostrarInfo());

    }

    private static void agregarConsolas() {

        String marca;
        double espacioAlmacenamiento;
        String tipoProcesador;
        String color;

        System.out.print("Ingresar marca: ");
        marca = new Scanner(System.in).next();

        System.out.print("\nIngresar espacionAlmacenamiento: ");
        espacioAlmacenamiento = new Scanner(System.in).nextDouble();
        System.out.print("\nTipo Procesador: ");
        tipoProcesador = new Scanner(System.in).next();

        System.out.println("\nColor: ");
        color = new Scanner(System.in).next();

        consolas.add(new ConsolaVideojuego(marca, espacioAlmacenamiento, tipoProcesador, color));
    }

}
