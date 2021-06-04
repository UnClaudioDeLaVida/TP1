/*Ejercicio 6: Escribe un programa que calcule la suma de todos los números múltiplos de 5
comprendidos entre dos enteros positivos leídos por teclado*/
package ejercicio6;

import java.util.Scanner;

public class Punto6 {

    public static void main(String[] args) {
        final int CANTNUM = 2;
        int numerosElegidos[] = new int[CANTNUM];
        ingresarVerificar(numerosElegidos, CANTNUM);
        System.out.println("La suma entre los múltiplos de 5 comprendidos entre "+ numerosElegidos[0] + " y " + numerosElegidos[1] + " da " + mostrarSumaEntreMultiplosDe5(numerosElegidos));
    }

    public static void ingresarVerificar(int[] numerosAElegir, int totalDeNumeros) {
        Scanner ingresoTeclado = new Scanner(System.in);
        for (int i = 0; i < totalDeNumeros; i++) {
            do {
                System.out.println("Ingrese un entero positivo:");
                numerosAElegir[i] = ingresoTeclado.nextInt();
                if (numerosAElegir[i] < 1) {
                    System.out.println("El número no debe ser negativo. Intentá nuevamente: ");
                    numerosAElegir[i] = ingresoTeclado.nextInt();
                }
            } while (numerosAElegir[i] < 1);
        }
    }

    public static int mostrarSumaEntreMultiplosDe5(int[] numerosElegidos) {
        int sumoMultiplos = 0;
        if (numerosElegidos[0] < numerosElegidos[1]) {
            for (int i = numerosElegidos[0]; i <= numerosElegidos[1]; i++) {
                if (i % 5 == 0) {
                    sumoMultiplos += i;
                }
            }
        } else {
            for (int i = numerosElegidos[1]; i <= numerosElegidos[0]; i++) {
                if (i % 5 == 0) {
                    sumoMultiplos += i;
                }
            }
        }
        return sumoMultiplos;
    }
}
