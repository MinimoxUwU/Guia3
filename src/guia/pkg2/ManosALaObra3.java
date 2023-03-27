/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia.pkg2;

import java.util.Scanner;

/**
 *
 * @author Juanfra
 */
public class ManosALaObra3 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
         System.out.println("Ingrese una nota");
         int nota=leer.nextInt();
         while (nota<0 || nota>10){
         System.out.println("Nota Incorrecta ingrese otra");
         nota=leer.nextInt();
         }
    }
}
