import java.util.Scanner;

public class Ejercicio_17 {

    public static void main (String []args)
    {
        int arr[]= new int[10];
        int num, pos_num, j;

        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce los 5 numeros(Ordenados de manera creciente )");
        for( int i=0; i<5; i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Ingrese un numero enetero");
        num= sc.nextInt();
        pos_num=0;
        j=0;
        while (arr [j]<num && j<=4)
        {
            pos_num++;
            j++;
        }
        for(int i=4; i>= pos_num; i--)
        {
            arr[i+1]= arr[i];
        }
        arr[pos_num]=num;
        System.out.println("Nuevo arreglo acomodado: ");
        for(int i=0; i<6; i++){
            System.out.println(arr[i]);
        }

    }
}
