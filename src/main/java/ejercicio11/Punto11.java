/*Ejercicio 11
Escribe una aplicación que reciba como entrada un entero que contenga sólo dígitos 0 y 1 (es decir,
un entero binario), y que imprima su equivalente decimal. [Sugerencia: use los operadores residuo y
división para elegir los dígitos del número binario uno a la vez, de derecha a izquierda. En el
sistema numérico binario, el dígito más a la derecha tiene un valor posicional de 1, el siguiente
dígito a la izquierda tiene un valor posicional de 2, luego 4, luego 8, etcétera. El equivalente
decimal del número binario 1101 es 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8 = 13].*/
package ejercicio11;

import java.util.Scanner;

public class Punto11 {

    public static void main(String[] args) {
        long numeroIngresado;
        do{
        numeroIngresado = ingresaNumero();
        } while (buscaErrores(numeroIngresado) == true);
        System.out.println(numeroIngresado + " a decimal: " + pasarADecimal(numeroIngresado));
    }

    public static long ingresaNumero() {
        Scanner ingresoTeclado = new Scanner(System.in);
        System.out.println("Ingrese el número a pasar de binario a decimal");
        long numeroIngresado = ingresoTeclado.nextLong();
        return numeroIngresado;
    }
    
    public static boolean buscaErrores (long numeroElegido) {
        boolean hayErrores = false;
        do {
            if ((numeroElegido % 10 != 0)&&(numeroElegido % 10 != 1)){
                hayErrores = true;
            }
            numeroElegido /=10;
        } while((numeroElegido!=0)&&(numeroElegido!=1));
        if (hayErrores)
            System.out.println("El número solo debe contener 0 y 1!");
        return hayErrores;
    }
    
    public static int pasarADecimal (long numeroEnBinario){
        int sumaParcial = 0;
        int multiplicadorBinario = 1;
        while(numeroEnBinario>0){
            sumaParcial+=(int)((numeroEnBinario%10)*multiplicadorBinario);
            numeroEnBinario/=10;
            multiplicadorBinario*=2;
        }
        return sumaParcial;
    }
}
