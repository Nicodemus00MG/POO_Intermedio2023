package POO_Intermedio;

import java.util.ArrayList;

public class colecciones {

    // atributos

    // crear un programa que segun un numero ingresado por teclado va a retornar el
    // dia de la semana que representa dicho numero
    // ! numero =1 , lunes ;2 =martes ... 7 = domingo

    private static ArrayList<String> diasSemana = new ArrayList<String>();

    // constructores

    // metodos

    public static void main(String args[]) {

        llenarColeccion();
        System.out.println(evaluar(1));

    }

    private static void llenarColeccion() {
        diasSemana.add("lunes");
        diasSemana.add("martes");
        diasSemana.add("miercoles");
        diasSemana.add("jueves");
        diasSemana.add("viernes");
        diasSemana.add("sábado");
        diasSemana.add("domingo");
    }

    private static String evaluar(int numero) {

        String resul = "";

        // ! .get(index) -> nos devuelve el valor en funcion del indice

        // ! .indexOf(valor) -> nos devulve el indice en funcion del valor que
        // ingresamos como parametro

        switch (numero) {

            case 1:
                resul = diasSemana.get(0);
                break;
            case 2:
                resul = diasSemana.get(1);
                break;
            case 3:
                resul = diasSemana.get(2);
                break;
            case 4:
                resul = diasSemana.get(3);
                break;
            case 5:
                resul = diasSemana.get(4);
                break;
            case 6:
                resul = diasSemana.get(5);
                break;
            case 7:
                resul = diasSemana.get(6);
                break;
            default:
            resul="dia no existente";
            break;
        }

        return resul;

    }

}
