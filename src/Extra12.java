
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
public class Extra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont1 = 0, cont2 = 0, cont3 = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    if (i == 3) {
                        System.out.print("E");
                    } else {
                        System.out.print(i);
                    }
                    System.out.print("-");
                    if (j == 3) {
                        System.out.print("E");
                    } else {
                        System.out.print(j);
                    }
                    System.out.print("-");
                    if (k == 3) {
                        System.out.print("E");
                    } else {
                        System.out.print(k);
                    }
                    System.out.println("");
                }

            }
        }

        System.out.println("");
    }
}
