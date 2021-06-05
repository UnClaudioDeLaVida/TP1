/*Ejercicio 10
Escribe una aplicación que determine el sueldo bruto para cada uno de cinco empleados. La
empresa paga la cuota normal en las primeras 40 horas de trabajo de cada empleado, y cuota y
media en todas las horas trabajadas que excedan de 40. Usted recibe una lista de los empleados de
la empresa, el número de horas que trabajó cada uno la semana pasada y la tarifa por horas de cada
empleado. Su programa debe recibir como entrada esta información para cada empleado, debe
determinar y mostrar el sueldo bruto de cada trabajador.*/
package ejercicio10;

public class Punto10 {

    public static void main(String[] args) {
        final int[][] LISTAHORASYSUELDO = {{42, 3500}, {28, 4000}, {50, 4200}, {33, 6000}, {25, 7000}};
        final String[] NOMBRES = new String[]{"Pe Pe", "Ti To", "Lo Lo", "Ro Lo", "Cho Lo"};
        final int CANTIDADDEEMPLEADOS = 5, BONIFICARSEGUNHORAS = 40, BONOPORHORAEXTRA = 150;
        int sueldoBruto[] = new int[CANTIDADDEEMPLEADOS];
        calcularSueldoBruto(LISTAHORASYSUELDO, sueldoBruto, CANTIDADDEEMPLEADOS, BONIFICARSEGUNHORAS, BONOPORHORAEXTRA);
        mostrarSueldoBruto(CANTIDADDEEMPLEADOS, NOMBRES, LISTAHORASYSUELDO, sueldoBruto);
    }
    
    public static void calcularSueldoBruto(int[][] datosEmpleados, int[] sueldoBrutoEmpleados, int numeroDeEmpleados, int horasParaPlus, int plusPorHorasExtras){
        for (int i = 0; i < numeroDeEmpleados; i++) {
            if (datosEmpleados[i][0] < horasParaPlus)
                sueldoBrutoEmpleados[i] = datosEmpleados[i][0] * datosEmpleados[i][1];
            else
                sueldoBrutoEmpleados[i] = (horasParaPlus * datosEmpleados[i][1]) + ((datosEmpleados[i][0] - horasParaPlus) * datosEmpleados[i][1] * plusPorHorasExtras / 100);
        }
    }
    
    public static void mostrarSueldoBruto(int numeroEmpleados, String[] nombres, int[][] datosEmpleados, int[] sueldoBruto) {
        for (int i = 0; i < numeroEmpleados; i++) {
            System.out.println("Empleado " + (i + 1) + ": " + nombres[i] + "." + " Horas trabajadas: " + datosEmpleados[i][0] + ". Sueldo por hora: " + datosEmpleados[i][1] + " Sueldo Bruto: " + sueldoBruto[i]);
        }
    }
}