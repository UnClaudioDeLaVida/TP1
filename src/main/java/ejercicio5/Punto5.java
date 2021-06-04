/*Ejercicio 5
Escribe un programa que escriba la tabla de multiplicar de cualquier número entero dado por el
usuario, entre 1 y 10.*/

package ejercicio5;

import java.util.Scanner;

public class Punto5 {

    public static void main(String[] args) {
        int tablaElegida;
        tablaElegida = ingresarVerificar();
        mostrarTabla(tablaElegida);
    }

    public static int ingresarVerificar() {
        int numeroAVerificar;
        Scanner ingresoTeclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese un número del 1 al 10 para ver sus tablas:");
            numeroAVerificar = ingresoTeclado.nextInt();
            if ((numeroAVerificar < 1) || (numeroAVerificar > 10)) {
                System.out.println("El número debe estar entre 1 y 10. Intentá nuevamente: ");
                numeroAVerificar = ingresoTeclado.nextInt();
            }
        } while ((numeroAVerificar < 1) || (numeroAVerificar > 10));
        return numeroAVerificar;
    }

    public static void mostrarTabla(int tablaDel) {
        for (int i = 1; i <= 10; i++)
            System.out.println(tablaDel + " x " + i + " = " + tablaDel * i);
    }
}
