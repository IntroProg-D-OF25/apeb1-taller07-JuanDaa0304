/**
 * Realizar un programa Java que permita presentar en pantalla la siguiente secuencia:
 * 5/10, 10/12, 15/14, 20/16, 25/18, 30/20
 * @author Juan Vargas
 */
import java.util.Scanner;
public class Problema2_SerieNumero {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int primerNum=5,segundoNum=10, contador = 0;
        while (contador < 6) {
            System.out.println(primerNum +"/" + (segundoNum) + ",");
            primerNum += 5;
            segundoNum += 2;
            contador ++;
        }
    }
}
/**
 * run:
 * 5/10,
 * 10/12,
 * 15/14,
 * 20/16,
 * 25/18,
 * 30/20,  
 */