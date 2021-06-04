/*Ejercicio 7: Escribe el programa para un juego que consista en averiguar un número. El programa
nos indicará cada vez si el número introducido es mayor o menor que la constante almacenada que
tendremos que averiguar. Cuando se descubre el numero mostrara un mensaje de felicitación.*/

package ejercicio7;

import java.util.Scanner;

public class Punto7 {

    public static void main(String[] args) {
        final int NUMEROPARAADIVINAR = 373;
        jugarAdivinaNumero(NUMEROPARAADIVINAR);
    }

    public static void jugarAdivinaNumero(int incognita) {
        Scanner ingresoTeclado = new Scanner(System.in);
        System.out.println("Ahora tenés que adivinar un número");
        int intentarAdivinar;
        do {
            System.out.println("¿Qué número creés que es?");
            intentarAdivinar = ingresoTeclado.nextInt();
            if (intentarAdivinar < incognita) {
                System.out.println("NO. El número es mayor. Seguí intentando...");
            } else if (intentarAdivinar > incognita) {
                System.out.println("NO. El número es menor. Seguí intentando...");
            } else {
                System.out.println("CORRECTO! Adivinaste");
            }
        } while (intentarAdivinar != incognita);
    }//Cierra método jugarAdivinaNumero()
}//Cierra clase Punto7
