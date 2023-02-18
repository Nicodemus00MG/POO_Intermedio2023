package POO_Intermedio;

import java.util.HashMap;

public class diccionarios {

    // !atributos
    private static HashMap<Integer, String> diasSemana = new HashMap<Integer, String>();
    private static HashMap<Integer,ConsolaVideojuego> consolas=new HashMap<Integer,ConsolaVideojuego>();

    // !constructores

    // !metodos

    public static void main(String args[]) {

        // * diccion
        diasSemana.put(1, "lunes");
        diasSemana.put(2, "martes");
        diasSemana.put(3, "miercoles");
        diasSemana.put(200, "jueves");

        System.out.println(diasSemana);

        System.out.println(diasSemana.get(1));

        diasSemana.remove(2);
        System.out.println(diasSemana);

        //! imprime solo llaves del dicccionario
        for (int i : diasSemana.keySet()) {
            System.out.println(i);
        }

        System.out.println("\n");
        for (String i : diasSemana.values()) {
            System.out.println(i);
        }


        System.out.println("\n");

        consolas.put(1, new ConsolaVideojuego("sony_playstation",2.4,"Ryzen5","blanca"));
        consolas.put(2, new ConsolaVideojuego("microsoft_xbox_series_x",4.8,"Ryzen9","negra"));
        for (ConsolaVideojuego i : consolas.values()) {
            System.out.println(i.mostrarInfo());
        }

    }



}
