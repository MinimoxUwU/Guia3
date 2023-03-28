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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese dos numeros:");
        int num1=leer.nextInt(), num2=leer.nextInt();
        String rta="n";
        int res;
        while ("n".equals(rta)){
            System.out.println("MENU");
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");
        int opc=leer.nextInt();
        switch (opc){
            case 1:
                res=num1+num2;
                System.out.println(res);
            break;
            case 2:
                res=num1-num2;
                System.out.println(res);
                break;
            case 3:
                res=num1*num2;
                System.out.println(res);
            case 4:
                res=num1/num2;
                System.out.println(res);
            case 5:
                System.out.println("Seguro que desea salir?");
                rta=leer.next();      
        }
        }
    }
    
}
