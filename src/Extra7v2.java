
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
public class Extra7v2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String rta = "s";
        double suma = 0;
        int max = 0, alt, min = 0, cont = 0;
        do {
            if (cont == 0) {
                System.out.println("Desea ingresar un numero? S/N");
                rta = leer.next();
            } else {
                System.out.println("Desea ingresar otro numero? S/N");
                rta = leer.next();
            }
            if ("n".equals(rta)) {
                break;
            }

            System.out.println("Ingrese");
            alt = leer.nextInt();
            if (alt > 0) {
                suma += alt;
                if ("s".equals(rta)) {
                    cont++;
                }
                if (alt < min || cont == 0) {
                    min = alt;
                }
                if (alt > max) {
                    max = alt;
                }
            } else {
                System.out.println("Ingrese un numero positivo");
            }
        } while ("s".equals(rta));
        System.out.println("El promedio total es : " + suma / cont);
        System.out.println("El maximo es : " + max);
        System.out.println("El minimox es : " + min);
    }

}
