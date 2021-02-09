/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package num7;

import java.util.Scanner;

/**
 *
 * @author ivan
 */
public class Num7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Permita calcular el área y perímetro de un rectángulo.

        int base, altura;
        double area, perimetro;

        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESA LA BASE DEL TRIANGULO");
        base = entrada.nextInt();

        System.out.println("INGRESA LA ALTURA DEL TRIANGULO");
        altura = entrada.nextInt();

        area = base * altura;
        perimetro = base + altura;

        System.out.println("EL AREA ES         :" + area + "\nEL PERIMETRO ES    :" + perimetro);

    }

}
