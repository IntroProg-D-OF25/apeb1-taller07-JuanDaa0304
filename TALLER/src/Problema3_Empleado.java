import java.util.Scanner;

/**
 * Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados.
 * Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo del día trabajo.
 * Calcular el valor a cancelar por la empresa para cada empleado. Presentar un reporte como el siguiente:
 * Nombre 1	10	$2.5	$25
 * Nombre 2	11	$2	$22
 * Nombre 3	9	$3	$27
 * Nombre 4	5	$4	$20
 * Nombre 5	12	$2	$24
 * @author Juan Vargas
 */
public class Problema3_Empleado {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String Empleado;
        int numDias;
        double CostoTotal ,CostoTrabajo, contador =1;
        while (contador<=5){
            System.out.println("Dame nombre: ");
            Empleado = tcl.next();
            System.out.println("Dame numero de dias trabajados: ");
            numDias = tcl.nextInt();
            System.out.println("Dame el costo del dia del trabajo");
            CostoTrabajo = tcl.nextDouble();
            CostoTotal = numDias * CostoTrabajo ;
            System.out.println("El valor a cancelar por empleado es:" + CostoTotal);
            contador++;
            
        }
                
    }
}
/**
 * run:
 * Dame nombre: 
 * Nombre1
 * Dame numero de dias trabajados: 
 * 10
 * Dame el costo del dia del trabajo
 * 2,5
 * El valor a cancelar por empleado es:25.0
 * Dame nombre: 
 * nombre2
 * Dame numero de dias trabajados: 
 * 11
 * Dame el costo del dia del trabajo
 * 2
 * El valor a cancelar por empleado es:22.0
 * Dame nombre: 
 * Nombre3
 * Dame numero de dias trabajados: 
 * 9
 * Dame el costo del dia del trabajo
 * 3
 * El valor a cancelar por empleado es:27.0
 * Dame nombre: 
 * Nombre4
 * Dame numero de dias trabajados: 
 * 5
 * Dame el costo del dia del trabajo
 * 4
 * El valor a cancelar por empleado es:20.0
 * Dame nombre: 
 * Nombre5
 * Dame numero de dias trabajados: 
 * 12
 * Dame el costo del dia del trabajo
 * 2
 * El valor a cancelar por empleado es:24.0
 * BUILD SUCCESSFUL (total time: 1 minute 14 seconds)
 */