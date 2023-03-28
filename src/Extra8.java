
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
public class Extra8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int par=0,impar=0,cont=0,numero;
        boolean verda=true;
        while(verda){
            System.out.println("Ingrese un numero:(Para terminar cargue un multiplo de 5)");
            numero=leer.nextInt();
            if (numero%5==0){
                break;
            }else if(numero%2==0){
                par++;
            }else{
                impar++;
            }
            cont++;
        }
        System.out.println("La cantidad de numeros impares es : " + impar);
        System.out.println("La cantidad de numeros pares es : " + par);
        System.out.println("El total de numeros ingresados es : " + cont);
    }
    
}
