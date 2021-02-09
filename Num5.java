package num5;

import java.util.Scanner;

public class Num5 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcion = 1;
        double compra, Subtotal=0, Descuento, Total=0;
        

        while (opcion != 2) {
            System.out.println("DIGITE EL PRECIO DE LA COMPRA");
            compra = entrada.nextDouble();

            if (compra < 0) {
                System.out.println("EL VALOR DE LA COMPRA ES INCORRECTO");
            }
            Subtotal = Subtotal + compra;

            if (Subtotal < 500) {
                Descuento = Subtotal * 10 / 100;
                Total = Subtotal - Descuento;
            }
            if (Subtotal >= 500) {
                Descuento = Subtotal * 15 / 100;
                Total = Subtotal - Descuento;
            }

            System.out.println("1.SEGUIR AGREGANDO PRODUCTOS \n2. PAGAR COMPRA ");
            opcion = entrada.nextInt();
        }

        if (opcion == 2) {
            System.out.println("El total a Pagar es: Q." + Total);
        }

        

    }

}
