/*Ejercicio 1: Escribe un programa que tome 3 números enteros introducidos por el usuario
mediante el teclado y determine cuántos de dichos números son diferentes, el promedio, la suma
de todos, el producto del mayor por el menor y si el número restante es divisible por 3.*/
package ejercicio1;

import java.util.Scanner;

public class Punto1 {

    public static void main(String[] args) {
        final int NUMEROSAINGRESAR = 3;
        int[] numerosIngresados = new int[NUMEROSAINGRESAR];
        ingresoNumeros(numerosIngresados, NUMEROSAINGRESAR);
        mostrarNumeros(numerosIngresados, NUMEROSAINGRESAR);
        System.out.println("Hay " + cuantosDiferentes (numerosIngresados) + " números diferentes!");
        System.out.println("El promedio nos da " + calculoPromedio (numerosIngresados, NUMEROSAINGRESAR));
        System.out.println("La suma total de los números nos da " + sumaNumeros(numerosIngresados, NUMEROSAINGRESAR));
        mayorPorMenor(numerosIngresados, NUMEROSAINGRESAR);
        divisiblePor3(numerosIngresados);
    }
    
    public static void ingresoNumeros(int [] guardaNumeros, int totalNumeros){
        Scanner ingresoTeclado = new Scanner(System.in);
        for (int i = 0; i < totalNumeros; i++) {
            System.out.println("Ingrese el " + (i + 1) + "° número:");
            guardaNumeros[i] = ingresoTeclado.nextInt();
        }
    }
    
    public static void mostrarNumeros(int [] muestroNumeros, int totalNumeros){
        for (int i = 0; i < totalNumeros; i++) {
            System.out.println((i + 1) + ": " + muestroNumeros[i]);
        }
    }
    
    public static int cuantosDiferentes(int [] comparoNumeros){
        int cuentaDiferentes = 0;
        if (comparoNumeros[0] != comparoNumeros[1]) {
            cuentaDiferentes++;
        }
        if (comparoNumeros[2] != comparoNumeros[0]) {
            cuentaDiferentes++;
        }
        if (comparoNumeros[1] != comparoNumeros[2]) {
            cuentaDiferentes++;
        }
        return cuentaDiferentes;
    }
    
    public static float calculoPromedio(int [] numerosIngresados, int totalNumeros){
        float promedio = 0;
        int sumaNumeros = 0;
        for (int i = 0; i < totalNumeros; i++) {
            sumaNumeros+= numerosIngresados[i];
        }
        promedio = (float)sumaNumeros / totalNumeros;
        return promedio;
    }
    
    public static int sumaNumeros (int [] numerosIngresados, int totalNumeros){
        int sumaTotal = 0;
        for (int i = 0; i < totalNumeros; i++) {
            sumaTotal+= numerosIngresados[i];
        }
        return sumaTotal;
    }
    
    public static void mayorPorMenor (int [] numerosIngresados, int totalNumeros){
        for (int i = 0; i < totalNumeros-1; i++) {
            for (int j = i + 1; j < totalNumeros; j++) {
                int aux;
                if (numerosIngresados[i] > numerosIngresados[j]) {
                    aux = numerosIngresados[i];
                    numerosIngresados[i] = numerosIngresados[j];
                    numerosIngresados[j] = aux;
                }
            }
        }
        System.out.println("El producto entre el menor " + numerosIngresados[0] + " y el mayor " + numerosIngresados[totalNumeros-1] + " da " + numerosIngresados[totalNumeros-1]*numerosIngresados[0]);
    }
    
    public static void divisiblePor3 (int [] numerosIngresados){
        System.out.print("El número restante es " + numerosIngresados[1] + ".");
        if (numerosIngresados[1] % 3 == 0)
            System.out.print(" Es divisible por 3");
        else
            System.out.print(" No es divisible 3");
    }
}//CIERRA CLASE PUNTO1
