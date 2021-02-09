/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package num8;

import java.util.Scanner;

public class Num8 {

    public static void main(String[] args) {

        //Permita el ingreso de dos números enteros y muestre cual es el numero mayor y menor.
        int num1;
        int num2;

        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRSE EL PRIMER NUMERO");
        num1 = entrada.nextInt();
        System.out.println("INGRESE EL SEGUNDO NUMERO");
        num2 = entrada.nextInt();

        if (num1 > num2) {
            System.out.println("EL PRIMER NUMERO ES MAYOR AL SEGUNDO");
        } else  if (num1==num2){
            System.out.println("EL SEGUNDO NUMERO ES IGUAL AL PRIEMRO");
        } else if (num1<num2){
            System.out.println("EL SEGUNDO NUMERO ES MENOR AL PRIEMRO ");
        }

    }

}
