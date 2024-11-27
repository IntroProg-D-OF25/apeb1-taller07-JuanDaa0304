/**
 * Generar una solución que permita ingresar jugadores de fútbol; por cada jugador se debe solicitar:
 * Nombre el jugador
 * Posición en el campo de juego
 * Edad
 * Estatura
 * El ciclo de ingreso de información deberá terminar cuando el usuario lo decida. Se debe imprimir el siguiente reporte (usar una cadena de acumulación):

 * Listado de Jugadores
 * 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
 * 2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
 * 3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
 * 4. Ángel Mena -Delantero-, edad 32, estatura 1.75
 * 5. Michael Estrada -Delantero-, edad 27, estatura 1.93
 * Promedio de edades:  26.8
 * Promedio de estaturas: 1.87
 * @author Juan Vargas
 */
import java.util.Scanner;
public class Problema4_Jugadores_de_futbol {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String NombreJug, posicion;
        int contador=0;
        double estatura, edad, promEdades = 0, promEstat=0,SumEdades=0, SumEstat=0;
        while (contador < 5){
            System.out.println("Dame Nombre del jugador: ");
            NombreJug = tcl.next();
            System.out.println("Dame su posicion en el campo del juego: ");
            posicion = tcl.next();
            System.out.println("Dame su edad: ");
            edad = tcl.nextDouble();
            System.out.println("Dame su estatura: ");
            estatura = tcl.nextDouble();
            SumEdades+= edad;
            SumEstat+= estatura;
            contador++;
        }
        promEdades = SumEdades / contador;
        promEstat = SumEstat / contador;
        System.out.println("El promedio de las edades es:"+promEdades);
        System.out.println("El promedio de estaturas es:"+promEstat);
    }
}
/**
 * run:
 * Dame Nombre del jugador: 
 * Alexander_Dominguez
 * Dame su posicion en el campo del juego: 
 * Arquero
 * Dame su edad: 
 * 32
 * Dame su estatura: 
 * 1,95
 * Dame Nombre del jugador: 
 * Xavier_Arreaga
 * Dame su posicion en el campo del juego: 
 * Defensa
 * Dame su edad: 
 * 24
 * Dame su estatura: 
 * 1,85
 * Dame Nombre del jugador: 
 * Moises_Caicedo
 * Dame su posicion en el campo del juego: 
 * Mediocentro
 * Dame su edad: 
 * 19
 * Dame su estatura: 
 * 1,88
 * Dame Nombre del jugador: 
 * Angel_Mena
 * Dame su posicion en el campo del juego: 
 * Delantero
 * Dame su edad: 
 * 32
 * Dame su estatura: 
 * 1,75
 * Dame Nombre del jugador: 
 * Michael_Estrada
 * Dame su posicion en el campo del juego: 
 * Delantero
 * Dame su edad: 
 * 27
 * Dame su estatura: 
 * 1,93
 * El promedio de las edades es:26.8
 * El promedio de estaturas es:1.8719999999999999
 * BUILD SUCCESSFUL (total time: 2 minutes 29 seconds)
 */