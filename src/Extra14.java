
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
public class Extra14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de familias a analizar");
        int cantfam=leer.nextInt(),canthijos,edadmayor,edadmenor,edad;
        for (int i = 0; i < cantfam; i++) {
            edadmayor=0;
            edadmenor=0;
            System.out.println("Ingrese la cantidad de hijos de la familia "+ (i+1));
            canthijos=leer.nextInt();
            for (int j = 0; j < canthijos; j++) {
                System.out.println("Ingese la edad del hijo "+ (j+1));
                edad=leer.nextInt();
                if (j==0||edad<edadmenor) {
                    edadmenor=edad;
                }
                if (edad>edadmayor){
                    edadmayor=edad;
                }
            }
            System.out.println("La media de la edad de los hijos de la familia es : "+((edadmenor+edadmayor)/2));
        }
    }
    
}
