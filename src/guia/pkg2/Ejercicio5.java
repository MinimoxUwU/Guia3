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
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese el limite positivo");
        int lim=leer.nextInt();
        int suma=0;
        while (suma<lim){
            System.out.println("Ingrese un numero");
            suma=suma+leer.nextInt();
                    }
        System.out.println("Usted supero el limite");
                    }
    }
    

