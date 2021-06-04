/*Ejercicio 4: Escribe un programa que escriba todos los divisores de un número n entero
positivo introducido por el usuario.*/
package ejercicio4;

import java.util.Scanner;

public class Punto4 {

    public static void main(String[] args) {
        int susDivisores;
        susDivisores = ingresarVerificar();
        mostrarDivisores(susDivisores);
    }

    public static int ingresarVerificar() {
        int numeroAVerificar;
        Scanner ingresoTeclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese un entero positivo para mostrar sus divisores:");
            numeroAVerificar = ingresoTeclado.nextInt();
            if (numeroAVerificar < 1) {
                System.out.println("El número no debe ser negativo. Intentá nuevamente: ");
                numeroAVerificar = ingresoTeclado.nextInt();
            }
        } while (numeroAVerificar < 1);
        return numeroAVerificar;
    }

    public static void mostrarDivisores(int numeroIngresado) {
        System.out.println("Sus divisores son los siguientes:");
        /*empiezo desde 1 para evitar dividir por 0. Considero la posibilidad de
        tomar al número ingresado como divisor de si mismo, por eso <= en vez de <*/
        for (int i = 1; i <= numeroIngresado; i++) {
            if (numeroIngresado % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
