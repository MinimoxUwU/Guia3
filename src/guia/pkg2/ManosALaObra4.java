package guia.pkg2;

import java.util.Scanner;

/**
 *
 * @author Juanfra
 */
public class ManosALaObra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        int cont=0;
        int result=0;
        do{
            System.out.println("Ingrese un numero:");
            num=leer.nextInt();
            cont++;
            if(num>0){
            result=(result+num);
            }
        }while (num!=0||cont==20);
        if (num==0){
            System.out.println("Se encontro un cero");
        }
            System.out.println("La suma de sus numeros es :" + result);
        
    }
    
}
