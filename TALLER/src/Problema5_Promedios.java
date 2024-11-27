/***
 * Generar un programa Java que permita ingresar 4 estudiantes; 
 * por cada uno de ellos ingresar el nombre del estudiante, el promedio de ciclo.
 * Presentar el siguiente reporte
 * Estudiante 1	10	Aprobado
 * Estudiante 2	6.9	Reprobado
 * Estudiante 3	7	Aprobado
 * Estudiante 4	5	Reprobado
 * Atención; con base al valor del promedio, usted debe asignar en cada registro el tipo Aprobado o Reprobado.
 * @author Juan Vargas
 */
import java.util.Scanner;
public class Problema5_Promedios {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombreEst, estado;
        double promedio, contador= 1;
        while (contador <=4){
            System.out.print("Dame nombre y promedio: ");
            nombreEst = tcl.next();
            promedio = tcl.nextDouble();
            estado = (promedio >= 7) ? "Aprobado" : "Reprobado"; //ahorra el tiempo de hacer if y el else
            System.out.println("Nombre\tPromedio\tEstado");
            System.out.println(nombreEst + "\t" + promedio + "\t" + estado);
            contador++;            
        }
    }
}
/**
 * Dame nombre y promedio: Estudiante1
 * 10
 * Nombre	Promedio	Estado
 * Estudiante1	10.0	      Aprobado
 * Dame nombre y promedio: Estudiante2
 * 6,9
 * Nombre	Promedio	Estado
 * Estudiante2	6.9	      Reprobado
 * Dame nombre y promedio: Estudiante3
 * 7
 * Nombre	Promedio	Estado
 * Estudiante3	7.0	      Aprobado
 * Dame nombre y promedio: Estudiante4
 * 5
 * Nombre	Promedio	Estado
 * Estudiante4	5.0	      Reprobado
 * BUILD SUCCESSFUL (total time: 1 minute 42 seconds)
 */