import java.util.Scanner;
/*
Rellenaremos dos arreglos, A y B, con 12 números enteros cada uno.
Y pondremos en un tercer arreglo C esos números, pero de manera especial:
3 números de A, luego 3 números de B. Luego, otros 3 números de A,
luego otros 3 números de B... etc.
 */
public class Ejercicio_15 {

    public static void main( String[]args)
    {
     int A[] = new int [5];
     int B[] = new int [5];
     int C[] = new int [10];

        Scanner sc= new Scanner(System.in);
        System.out.println("ingresa los numeros del arreglo 'A' ");
        for(int i= 0; i<5; i++)
        {
            System.out.println("Ingresa el numero " + (i+ 1));
            A[i]= sc.nextInt();
        }
        System.out.println("ingresa los numeros del arreglo 'B' ");
        for(int i= 0; i<5; i++)
        {
            System.out.println("Ingresa el numero " + (i+ 1));
            B[i]= sc.nextInt();
        }
        int i= 0;
        int j= 0;
        while (i<5)
        {
            for(int k =0; k<2; k++)
            {
                C[j]= A[i+k];
                j++;
            }
            for(int k =0; k<2; k++)
            {
                C[j]= B[i+k];
                j++;
            }
            i+=3;
        }
        System.out.println("Arreglo 'C' ");
        for( j=0; j<10; j++)
        {
            System.out.println(C[j]);
        }
    }
}
