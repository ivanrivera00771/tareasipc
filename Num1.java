/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package num1;

import java.util.Scanner;

public class Num1 {

   
    public static void main(String[] args) {
       
         int numero;
        System.out.println("DIGITE UN NUMERO DEL 1 AL 10");
        Scanner entrada= new Scanner(System.in);
        numero = entrada.nextInt();

        switch(numero){
            case 1: System.out.println("I");
                    break;
            case 2: System.out.println("II");
                    break;
            case 3: System.out.println("III");
                    break;
            case 4: System.out.println("IV");
                    break;
            case 5: System.out.println("V");
                    break;
            case 6: System.out.println("VI");
                    break;
            case 7: System.out.println("VII");
                    break;
            case 8: System.out.println("VIII");
                    break;
            case 9: System.out.println ("XI");
                    break;
            case 10: System.out.println("X");

            default: System.out.println("NO CORRESPONDE AL RANGO");
                    break;


        }
        
    }
    
}
