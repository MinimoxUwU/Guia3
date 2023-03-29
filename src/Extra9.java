
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
public class Extra9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros para dividir");
        int num1=leer.nextInt(),num2=leer.nextInt(),resto,cont=1;
        resto=num1-num2;
        boolean cond=true;
        while (cond==true){
            resto-=num2;
            cont++;
            if (resto<num2) {
                break;
            }
        }
        System.out.println("El cociente es :"+ cont);
    }
    
}
