import java.util.Scanner;

public class Ejercicio_13 {
    /* Guarada 10 numeros en un arreglo, y al final, mostramos en pantalla
    el siguinete orden: primero el primero, el untimo, el segundo, el penultimo...
     */
    public static void main ( String [] args){
        int j = 0;
        int arr []= new int[10];

        Scanner sc= new Scanner(System.in);
        for ( j = 0; j< arr.length; j++)
        {
            System.out.println("introduce un numero" + (j+1));
            arr[j]=sc.nextInt();
        }
        System.out.println("Imprime los numeros");

        for( j= 0; j< 10; j++)
        {
            System.out.println(arr[j]);
            System.out.println(arr[9-j]);
        }

    }
}
