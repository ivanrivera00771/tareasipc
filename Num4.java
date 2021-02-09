package num4;

import java.util.Scanner;

public class Num4 {

    public static void main(String[] args) {
        // Solicitar la edad del usuario y determinar si es infante (0-15 años), adolecente(16-20), adulto (21-55), adulto mayor (más de 55).
        int edad;

        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE SU EDAD");
        edad = entrada.nextInt();

        if (edad <= 15) {
            System.out.println("INFANTE");
        } else if (edad <= 21) {
            System.out.println("ADOLESCENTE ");
        } else if (edad <= 55) {
            System.out.println("ADULTO");

        } else if (edad > 55) {
            System.out.println("ADULTO MAYOR");

        }

    }

}
