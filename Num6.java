/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package num6;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Num6 {

    public static void main(String[] args) {

        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE UN NUMERO");
        num = entrada.nextInt();

        if (num % 2 == 0) {
            System.out.println("EL INGRESADO ES PAR");
        } else {
            System.out.println("EL NUMERO INGRESADO ES IMPAR");

        }

    }

}
