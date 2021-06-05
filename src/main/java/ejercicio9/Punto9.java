/*Ejercicio 9
Escribe una aplicación que reciba del usuario el radio de un círculo como un entero, y que imprima
el diámetro de la circunferencia y el área del círculo mediante el uso del valor de punto flotante
3.14159 para PI. También puede utilizar la constante predefinida Math.PI para el valor. Esta
constante es más precisa que el valor 3.14159. La clase Math se define en el paquete java.lang. Las
clases en este paquete se importan de manera automática, por lo que no necesita importar la clase
Math mediante la instrucción import para usarla. Use las siguientes fórmulas (r es el radio):
diámetro = 2 r
circunferencia = 2 * PI * r
área = PI * r 2*/

package ejercicio9;

import java.util.Scanner;

public class Punto9 {

    public static void main(String[] args) {
        int radioCirculo = ingresarYVerificarRadio();
        System.out.println("El radio es " + radioCirculo);
        System.out.println("El diámetro es " + diametroCirculo(radioCirculo));
        System.out.println("La circunferencia es " + circunferenciaCirculo(radioCirculo));
        System.out.println("El área es " + areaCirculo(radioCirculo));
    }

    public static int ingresarYVerificarRadio() {
        int radio;
        Scanner ingresoTeclado = new Scanner(System.in);
        do {
            System.out.println("¿Cuánto mide el radio?");
            radio = ingresoTeclado.nextInt();
            if (radio < 1) {
                System.out.println("El radio debe ser un número positivo!");
            }
        } while (radio < 1);
        return radio;
    }
    
    public static int diametroCirculo(int radio) {
        return radio*2;
    }
    
    public static double circunferenciaCirculo (int radio) {
        return (double)radio * 2 * Math.PI;
    }
    
    public static double areaCirculo (int radio) {
        return (double)radio * (double)radio * Math.PI;
    }
}
