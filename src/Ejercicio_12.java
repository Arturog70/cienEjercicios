import java.util.Scanner;

public class Ejercicio_12 {

   public static void main (String[]args){

      int arr[] = new int[5];
      Scanner sc = new Scanner(System.in);
      for(int i = 0; i< arr.length; i++){
         System.out.println("Introduzca un Numero");
         arr[i]= sc.nextInt();
      }
      System.out.println("Los Numero en Orden Inverso son: ");
      int j= 4;
      while(j>=0)
      {
         System.out.println("|" + arr[j]+ "|\n");
         j--;
      }
   }
}
