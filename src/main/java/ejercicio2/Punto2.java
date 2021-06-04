/*Ejercicio 2: Escribe un programa que tome un año introducido por el usuario y diga si es bisiesto o no.
Recuerda que los años múltiplos de 4 son bisiestos, excepto aquellos que son múltiplos de 100 y no lo son
de 400. Es decir, el año 2000 sí es bisiesto, pero no lo son el 1990 ni el 2100.*/
package ejercicio2;

import java.util.Scanner;

public class Punto2 {

    public static void main(String[] args) {
        int anioAIngresar = 0;
        anioAIngresar = ingresarVerificar();
        if (verificarBisiesto(anioAIngresar)) {
            System.out.println("El año " + anioAIngresar + " es bisiesto");
        } else {
            System.out.println("El año " + anioAIngresar + " no es bisiesto");
        }

//        System.out.println("Ingrese el año en cuestión para saber si es bisiesto:");
//        anioIngresado = ingresoTeclado.nextInt();
//        
//        do {
//            System.out.println("Ingrese el año en cuestión para saber si es bisiesto:");
//            anioIngresado = ingresoTeclado.nextInt();
//            if (anioIngresado > 0) {
//                if (anioIngresado % 400 == 0) {
//                    System.out.println(anioIngresado + " es año bisiesto!");
//                } else if (anioIngresado % 4 == 0) {
//                    if (anioIngresado % 100 == 0) {
//                        System.out.println(anioIngresado + " no es año bisiesto!");
//                    } else {
//                        System.out.println(anioIngresado + " es año bisiesto!");
//                    }
//                } else {
//                    System.out.println(anioIngresado + " no es año bisiesto!");
//                }
//            } else {
//                System.out.println("El año debe ser un número positivo!!");
//            }
//        } while (anioIngresado < 0);
    }//CIERRA MAIN()

    public static int ingresarVerificar() {
        int anioAVerificar;
        Scanner ingresoTeclado = new Scanner(System.in);
        do {
            System.out.println("Ingrese el año en cuestión para saber si es bisiesto:");
            anioAVerificar = ingresoTeclado.nextInt();
            if (anioAVerificar < 1) {
                System.out.println("El año debe ser un número positivo. Intentá nuevamente: ");
                anioAVerificar = ingresoTeclado.nextInt();
            }
        } while (anioAVerificar < 1);
        return anioAVerificar;
    }

    public static boolean verificarBisiesto(int anioAChequear) {
        if (anioAChequear % 400 == 0) {
            return true;
        } else {
            if (anioAChequear % 4 == 0) {
                if (anioAChequear % 100 == 0) {
                    return false;
                } else {
                    return true;
                }
            } else
                return false;
        }
    }
}//CIERRA CLASE PUNTO2
