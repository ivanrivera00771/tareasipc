
package num10;

import java.util.Scanner;
public class Num10 {

    
    public static void main(String[] args) {
      
       int num, i;
       
       Scanner entrada = new Scanner(System.in);
       System.out.println("INGRESE EL NUMERO A MULTIPLICAR ");
       num= entrada.nextInt();
       
        for (i = 1; i <= 10; i++) {
            System.out.println(i+ "x" +num+ "="+i*num);
            
        }
   
        
    }
    
}
