package num9;

import java.util.Scanner;

public class Num9 {

    public static void main(String[] args) {
        //Permita calcular la potencia x de un número entero positivo.

        double x, y;
        double RESULTADO;

        Scanner entrada = new Scanner(System.in);
        System.out.println("DIGITA UN NUMERO QUE SEA ENTERO");
        x = entrada.nextInt();

        System.out.println("DIGITA LA POTENCIA ");
        y = entrada.nextInt();
        
           
            //Verificar que el numero ingresado sea entero
    
        if (x < 0) {
            System.out.println("EL NUMERO INGRESADO NO ES POSITIVO");

        } else {
           
            System.out.println("LA POTENCIA ES : " + Math.pow(x, y));
        }
    }

}
