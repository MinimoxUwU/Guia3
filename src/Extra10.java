
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
public class Extra10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 = (int) (Math.random()*10+0),num2 = (int) (Math.random()*10+0),secreto=num1*num2;
        System.out.println("Adivine el resultado de la multiplicacion entre dos numeros aleatorios entre 0 y 10");
        int rta=leer.nextInt();
        while (rta!=secreto) {
            System.out.println("Incorrecto Ingrese otro numero");
            rta=leer.nextInt();
        }
        System.out.println("Correcto!");
    }
    
}
