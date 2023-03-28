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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamano del cuadrado");
        int tam=leer.nextInt();
        for (int i = 0; i < tam; i++) {
            for (int j = 0; j < tam; j++) {
                    if (i==0||i==tam-1) {
                    System.out.print("*");
                }else if (j==0||j==tam-1) {
                        System.out.print("*");
                }else{
                        System.out.print(" ");
                }
    
            }
                System.out.println("");
            }
            
        }
              
    }
    

