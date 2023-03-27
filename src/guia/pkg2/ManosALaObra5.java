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
public class ManosALaObra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entre 1 y 20: ");
        int num=leer.nextInt();
        String fin="";
        if (num<20&&num>0){
        for (int i=0;i<num;i++){
            fin=fin+"*";
        }
        System.out.println(num + fin);
        }
        else{
            System.out.println("Numero no valido");
        }
    }
    
}
