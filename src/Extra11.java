
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
public class Extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero para calcular la cantidad de digitos");
        int num=leer.nextInt(),cont=1;
        while (num>=10) {
            num/=10;
            cont++;
        }
        System.out.println(cont);
    }
    
}
