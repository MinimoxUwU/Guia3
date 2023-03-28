
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
public class Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cuatro numeros: ");
        int a=leer.nextInt(),b=leer.nextInt(),c=leer.nextInt(),d=leer.nextInt();
        System.out.println("a = " + a+ " b = " + b + " c = " + c + " d - " + d);
        int aux=a;
        a=d;d=b;b=c;c=aux;
        System.out.println("a = " + a+" b = " + b + " c = " + c+ " d - " + d);
    }
    
}
