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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese una palabra que empiece con : a ");
        String frase=leer.nextLine();
        if ("a".equals(frase.substring(0,1))){
            System.out.println("Correcto");
    }else {
            System.out.println("Incorrecto");
        }
    }
    
}
