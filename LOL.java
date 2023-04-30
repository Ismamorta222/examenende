package RECUPERACION;
import java.util.Scanner;
/**
 * 
 * @author ismael
 *
 */
public class LOL {
	/**
	 * 
	 * @param args main method lol
	 */
   public static void main(String[] args) {
	   /**
	    * main method  lol
	    */
	   /**
	    * 
	    */
      Scanner sc = new Scanner(System.in);
      int i = 1;
      while (i <= 10) {
    	  /**
    	   * bucle while
    	   */
         System.out.print("Ingrese un número: ");
         int num = sc.nextInt();
         if (num > 10) {
        	 /**
        	  * bucle if para losnumeros mayores que 10 
        	  */
            System.out.println("El número ingresado es mayor que 10");
         } else {
        	 /**
        	  * para los numeros menores o iguales que 10
        	  */
            System.out.println("El número ingresado es menor o igual que 10");
         }
         i++;
      }
   }
}
