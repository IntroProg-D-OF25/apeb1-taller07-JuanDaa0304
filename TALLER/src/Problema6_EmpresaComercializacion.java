/**
 * Una empresa de comercialización de computadoras realiza el proceso de venta haciendo un descuento por tipo de cliente:
 * Si es cliente tipo 1 hay un descuento del 10% Si es cliente tipo 2 hay un descuento del 20%
 * En caso que sea otro tipo de cliente, no hay descuento.
 * Generar un proceso que permita ingresar 7 ventas: por cada venta preguntar los siguiente datos:
 * Nombre del cliente
 * Costo de la computadora (solo se vende una computadora por transacción)
 * Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra computadora con precio $100
 * @author Juan Vargas
 */

import java.util.Scanner;
public class Problema6_EmpresaComercializacion {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String Cliente;
        double costoComputadora, descuento=0, precioFinal=0;
        int contador=0, tipoCliente;
        while (contador <7) {
            System.out.println("Dame nombre del cliente: ");
            Cliente = tcl.next();
            System.out.println("Dame el costo de la computadora: ");
            costoComputadora = tcl.nextDouble();
            System.out.println("Dime el tipo de cliente(1,2 o 3): ");
            tipoCliente = tcl.nextInt();
            contador++;
            switch (tipoCliente){
                case 1:
                    descuento = costoComputadora * 0.10;
                    precioFinal = costoComputadora - descuento;
                    System.out.println("Cliente tipo 1 aplica 10% descuento y con precio final de: "+precioFinal);
                    break;
                case 2:                  
                    descuento = costoComputadora * 0.20;
                    precioFinal = costoComputadora - descuento;
                    System.out.println("Cliente tipo 2 aplica 20% descuento y con precio final de :"+precioFinal);
                    break;
                default:
                    System.out.println("Otro tipo de cliente computadora con precio:" + costoComputadora);
                    break;
        
            }
            
        }
    }
}
/**
 * Dame nombre del cliente: 
 * Juan
 * Dame el costo de la computadora: 
 * 100
 * Dime el tipo de cliente(1,2 o 3): 
 * 1
 * Cliente tipo 1 aplica 10% descuento y con precio final de: 90.0
 * Dame nombre del cliente: 
 * Maria
 * Dame el costo de la computadora: 
 * 250
 * Dime el tipo de cliente(1,2 o 3): 
 * 2
 * Cliente tipo 2 aplica 20% descuento y con precio final de :200.0
 * Dame nombre del cliente: 
 * Jose
 * Dame el costo de la computadora: 
 * 150
 * Dime el tipo de cliente(1,2 o 3): 
 * 3
 * Otro tipo de cliente computadora con precio:150.0
 * Dame nombre del cliente: 
 * Mateo
 * Dame el costo de la computadora: 
 * 550
 * Dime el tipo de cliente(1,2 o 3): 
 * 2
 * Cliente tipo 2 aplica 20% descuento y con precio final de :440.0
 * Dame nombre del cliente: 
 * Gabriel
 * Dame el costo de la computadora: 
 * 225
 * Dime el tipo de cliente(1,2 o 3): 
 * 1
 * Cliente tipo 1 aplica 10% descuento y con precio final de: 202.5
 * Dame nombre del cliente: 
 * Cristian
 * Dame el costo de la computadora: 
 * 555
 * Dime el tipo de cliente(1,2 o 3): 
 * 2
 * Cliente tipo 2 aplica 20% descuento y con precio final de :444.0
 * Dame nombre del cliente: 
 * Pedro
 * Dame el costo de la computadora: 
 * 699
 * Dime el tipo de cliente(1,2 o 3): 
 * 2
 * Cliente tipo 2 aplica 20% descuento y con precio final de :559.2
 * BUILD SUCCESSFUL (total time: 2 minutes 21 seconds)
 */