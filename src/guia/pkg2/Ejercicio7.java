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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            // TODO code application logic here
        Scanner leer =new Scanner(System.in);
        String palabra;
        int correcto=0, incorrecto=0;   
        boolean control=false;
        while(!control){
            System.out.println("Ingrese palabras comenzadas en X y terminadas en O cuando termine cologue &&&&&");
            palabra=leer.nextLine();
            if ("x".equals(palabra.substring(0,1))&& "o".equals(palabra.substring(palabra.length()-1,palabra.length()))){
                correcto++;
            }else{
                incorrecto++;
            }
            if ("&&&&&".equals(palabra)){
                break;
            }
        }
        System.out.println("La cantidad de afirmaciones correctas es : " + correcto );
        System.out.println("La cantidad de palabras incorrectas es : " + incorrecto);
    }
}
