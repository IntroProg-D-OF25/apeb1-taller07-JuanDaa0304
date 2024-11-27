/**
 * Generar e imprimir la siguiente serie:
 * sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 * @author Juan Vargas
 */
import java.util.Scanner;
public class Problema7_SerieNum {
        public static void main(String[] args) {
        int contador = 1, limite;
        Scanner tcl = new Scanner(System.in);
        System.out.print("Dame limite: ");
        limite = tcl.nextInt();
        while (contador <= limite) {  
            if ((contador%2)== 1) {
                System.out.print("-(1/"+contador+")");                
            }
            else
                System.out.print("+(1/"+contador+")");
            contador++;
        }
    }
}
/*
 * run:
Dame limite: 10
-(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
*/
    