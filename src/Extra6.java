
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
public class Extra6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas:");
        int pers = leer.nextInt(), cantchi = 0;
        double promchi = 0, promtot = 0;
        for (int i = 0; i < pers; i++) {
            System.out.println("Ingrese estatura de la persona " + (i + 1));
            double estat = leer.nextDouble();
            if (estat <= 1.6) {
                promchi += estat;
                cantchi++;
            }
            promtot += estat;
        }
        promtot /= pers;
        promchi /= cantchi;
        System.out.println("El promedio gral es de : " + promtot);
        System.out.println("El promedio de los menores de 1.60 es : " + promchi);
    }
}
