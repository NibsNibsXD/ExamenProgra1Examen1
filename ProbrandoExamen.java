/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probrandoexamen;

import java.util.Scanner;

/**
 *
 * @author Jorge Aguirre
 */
public class ProbrandoExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String historial = "";

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Ejercicios String: ");
            System.out.println("2. Respuestas a preguntas+ ");
            System.out.println("3. Mostrar historial del menú ");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    historial += "Ejercicios String - ";
                    ejerciciosString(scanner);  //Ejercicio 1
                    break;
                case 2:
                    historial += "Respuestas a preguntas - ";
                    respuestasPreguntas(); // Ejercicio 2
                    break;
                case 3:
                    historial += "Mostrar historial del menu - ";
                    System.out.println(historial); // Aqui mostramos el historial
                    break;
                case 4:
                    System.out.println("Saliendo"); //fin del programa
                    return;
                default:
                    System.out.println("No es valida esa opcion.");
            }
        }
    }

    public static void ejerciciosString(Scanner scanner) {
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.next();

        if (cadena.length() >= 8) {
            if (cadena.length() % 2 == 0) { //con esto solo lo ejecutaremos si la palabra es par identificandolo usando un length y usando el modulo, si la respuesta es 0, es par
                String primeraMitad = cadena.substring(0, cadena.length() / 2);
                String segundaMitad = cadena.substring(cadena.length() / 2);
                StringBuilder cadenaResult = new StringBuilder();

                for (int i = 0; i < primeraMitad.length(); i++) {
                    cadenaResult.append(primeraMitad.charAt(i)); //seleccionando letra por letra cambiandolo con el valor cambiante de i del for
                    cadenaResult.append("-");
                    cadenaResult.append(segundaMitad.charAt(i)); 
                }

                System.out.println("Cadena resultante: " + cadenaResult.toString());
            } else {
                String primeraMitad = cadena.substring(0, cadena.length() / 2);    //Enre 2 ya que estamos busncando la mitad, la midad del valor de tamaño nos dara cuantas debemos toamr
                String segundaMitad = cadena.substring(cadena.length() / 2);
                System.out.println("Cadena resultante: " + segundaMitad + primeraMitad);
            }
        } else {
            System.out.println("La cadena debe tener al menos 8 caracteres.");
        }
    }

    public static void respuestasPreguntas() { //expicacion de los loops y metodos de string
        System.out.println("a. Describa el funcionamiento de los ciclos while y do-while y for:");
        System.out.println("   * El ciclo while se utiliza para repetir un bloque de código mientras nuestra comparacion cree un verdadero.");
        System.out.println("   * El ciclo do-while seria exacatamente lo mismo al while, solo con la diferencia que este se corre al menos una vez a pesar de que la variable no se cumple.");
        System.out.println("   * El ciclo for es silimar a un while, en este podemos hacer un numero de repeticiones, que terminen hasta un parametro de comparacion es cumplido");
        
        
        System.out.println("b. Describa el funcionamiento de .charAt(), indexOf() y .length():");
        System.out.println("   * El funcuanamineto del .ChartAt() se puede utilizar para buscar una letra en especifico en el string dado");
        System.out.println("   * Fuanamiento del indexOf() se puede utilizar para buscar donde se encuentra exactamente el char dado en el string");
        System.out.println("   *  El funcunamiento de .length()  Este es un metodo qeu es capaz de decirte que longitud tiene un string, osea cuantos characteres tiene el string entregado");

        System.out.println("c. Mencione 2 tipos de datos primitivos de Java y su uso:");
        System.out.println("   * int: se utiliza para almacenar números enteros.");
        System.out.println("   * boolean: se utiliza para almacenar valores de verdad (true/false).");
    }
}
