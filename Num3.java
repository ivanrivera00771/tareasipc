/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package num3;

import java.util.Scanner;

public class Num3 {

    public static void main(String[] args) {
        //Solicitar 5 notas de un estudiante y calcule su promedio

        int nota1, nota2, nota3, nota4, nota5;
        double promedio;

        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESA LA PRIMER NOTA");
        nota1 = entrada.nextInt();

        System.out.println("INGRESA LA SEGUNDA NOTA");
        nota2 = entrada.nextInt();

        System.out.println("INGRESA LA TERCER NOTA");
        nota3 = entrada.nextInt();

        System.out.println("INGRESA LA CUARTA NOTA");
        nota4 = entrada.nextInt();

        System.out.println("INGRESA LA QUINTA NOTA");
        nota5 = entrada.nextInt();

        promedio = (nota1 + nota2 + nota3 + nota4 + nota5)/5;

        System.out.println("EL PROMEDIO ES : " + promedio);

    }

}
