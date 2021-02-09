/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package num2;

import java.util.Scanner;

public class Num2 {

    public static void main(String[] args) {
        //Solicitar un tiempo (en segundos) y distancia (en metros) y en base a ello calcule la velocidad del objeto. Una vez mostrador el resultado preguntar al usuario si quiere mostrar la velocidad usando Km/hora.

        int distancia, tiempo, opcion;
        double velocidad, kmh;

        Scanner entrada = new Scanner(System.in);
        System.out.println("INGRESE LA DISTANCIA");
        distancia = entrada.nextInt();
        System.out.println("INGRESE EL TIEMPO");
        tiempo = entrada.nextInt();

        velocidad = distancia / tiempo;
        kmh = (velocidad * 360) / 1000;
        System.out.println("LA VELOCIDAD ES :" + velocidad + "m/s");
        System.out.println("PRESIONA 1 SI QUIERES CAMBIAR LA UNIDAD DE MEDIDA DE LA VELOCIDAD A KILOMETROS, DE LO CONTRARIO PRESIONA 2");
        opcion = entrada.nextInt();
        if (opcion == 1) {
            System.out.println("LA VELOCIDAD ES  :" + kmh + " km/h");
        } else {
            System.out.println("LA VELOCIDAD ES  :" + velocidad + " m/s");
        }
    }

}
