/*Ejercicio 8: Escribe un programa que ingrese un número entero positivo N y luego N números enteros
e imprima la suma de los números que se encuentran entre el mayor de los N números leídos y el menor
de los N números leídos.*/

package ejercicio8;

import java.util.Scanner;

public class Punto8 {

    public static void main(String[] args) {
        int listaDeNumeros [] = new int [20];
        int cuantosNumeros, numeroMinimo, numeroMaximo;
        cuantosNumeros = ingresarYVerificar();
        elegirLosNumeros(listaDeNumeros, cuantosNumeros);
        numeroMinimo = buscarMinimo(listaDeNumeros, cuantosNumeros);
        numeroMaximo = buscarMaximo(listaDeNumeros, cuantosNumeros);
        sumaEntreMinYMax(numeroMinimo, numeroMaximo);
    }

    public static int ingresarYVerificar() {
        Scanner ingresoTeclado = new Scanner(System.in);
        int numerosAElegir;
        do {
            System.out.println("¿Cuántos números vas a ingresar?");
            numerosAElegir = ingresoTeclado.nextInt();
            if (numerosAElegir < 1) {
                System.out.println("El número debe ser positivo. Intentá nuevamente: ");
                numerosAElegir = ingresoTeclado.nextInt();
            }
        } while (numerosAElegir < 1);
        return numerosAElegir;
    }
    
    public static void elegirLosNumeros(int [] listaDeNumeros, int cantidadDeNumeros){
        Scanner ingresoTeclado = new Scanner(System.in);
        for (int i = 0; i < cantidadDeNumeros; i++) {
            System.out.println("Ingresá el " + (i + 1) + "° número:");
            listaDeNumeros[i] = ingresoTeclado.nextInt();
        }
    }
    
    public static int buscarMinimo(int [] listaDeNumeros, int cantidadDeNumeros){
        int minimoActual = 0;
        for (int i = 0; i < cantidadDeNumeros; i++) {
            if (i==0)
                minimoActual = listaDeNumeros[i];
            else if (listaDeNumeros[i] < minimoActual){
                minimoActual = listaDeNumeros[i];
            }
        }
        return minimoActual;
    }
    
    public static int buscarMaximo(int [] listaDeNumeros, int cantidadDeNumeros){
        int maximoActual = 0;
        for (int i = 0; i < cantidadDeNumeros; i++) {
            if (i==0)
                maximoActual = listaDeNumeros[i];
            else if (listaDeNumeros[i] > maximoActual){
                maximoActual = listaDeNumeros[i];
            }
        }
        return maximoActual;
    }
    
    //No se suponen incluídos los extremos, o sea, no incluyo en la suma ni el mínimo ni el máximo.
    //Si hubieran que incluirlos, inicializo el for en numeroMinimo y para la cond. de corte cambio < por <=
    public static void sumaEntreMinYMax (int numeroMinimo, int numeroMaximo){
        int sumaNumeros=0;
        for (int i = numeroMinimo+1; i < numeroMaximo; i++) {
            sumaNumeros+=i;
        }
        System.out.println("La suma entre los números que hay entre " + numeroMinimo + " y " + numeroMaximo + " sin incluirlos da " + sumaNumeros);
    }
    
    /*Otra forma loca que se me ocurrió, sin incluir los extremos. Si hubiera que incluirlos
    la cuenta sería ((numeroMinimo + numeroMaximo) * (numeroMaximo - numeroMinimo + 1) / 2)*/
    
    public static void sumaEntreMinYMax2 (int numeroMinimo, int numeroMaximo){
        System.out.println("La suma entre los números que hay entre " + numeroMinimo + " y " + numeroMaximo + " sin incluirlos da " + ((numeroMinimo + numeroMaximo) * (numeroMaximo - numeroMinimo - 1) / 2));
    }
}
