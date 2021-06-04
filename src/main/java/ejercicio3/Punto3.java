/*Ejercicio 3: Escribe un programa que calcule el factorial de n donde n es un número entero mayor
o igual que cero dado por el usuario.*/

package ejercicio3;

import java.util.Scanner;

public class Punto3 {

    public static void main(String[] args) {
        int factorialACalcular;
        factorialACalcular = ingresarVerificar();
        System.out.println("El factorial de " + factorialACalcular + " es " + calcularFactorial(factorialACalcular));
    }

    public static int ingresarVerificar() {
        int numeroAVerificar;
        Scanner ingresoTeclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese el número para calcular su factorial:");
            numeroAVerificar = ingresoTeclado.nextInt();
            if (numeroAVerificar < 0) {
                System.out.println("El número no debe ser negativo. Intentá nuevamente: ");
                numeroAVerificar = ingresoTeclado.nextInt();
            }
        } while (numeroAVerificar < 0);
        return numeroAVerificar;
    }

    public static long calcularFactorial(int numeroIngresado) {
        if (numeroIngresado <= 1) {
            return 1;
        } else {
            return (numeroIngresado * calcularFactorial(numeroIngresado - 1));
        }
    }
}//CIERRA CLASE PUNTO3