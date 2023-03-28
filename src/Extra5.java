
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Juanfra
 */
public class Extra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un tipo de socio");
        String tipo=leer.next().toUpperCase();
        System.out.println("Ingrese el monto");
        double mont=leer.nextDouble();
        switch (tipo) {
            case "A":
                System.out.println("El monto sin descuento es: " + mont*0.5);
                break;
            case "B":
                System.out.println("El monto sin descuento es: " + mont*0.65);
                break;
            case "C":
                System.out.println("No tiene ningun descuento y el total a pagar es: " + mont);
                break;
            default:
                System.out.println("Tipo de socio invalido");
        }
    }
    
}
