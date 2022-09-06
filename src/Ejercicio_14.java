import java.util.Scanner;
/*
Crearemos dos arrays, "a" y "b", y almacenaremos 10 números en cada uno.
Posteriormente, en un tercer arreglo "c", guardaremos los números del arreglo "a" y el arreglo "b",
en este orden: El primero de a, el primero de b, el segundo de a, el segundo de b,
el tercero de a, el tercero de b, etc.
 */
public class Ejercicio_14 {
    public static void main (String[]args)
    {
        int a[]=new int[10];
        int b[]=new int[10];
        int c[]=new int[20];
        int i,j;
        Scanner sc= new Scanner(System.in);

        System.out.println("Introduce datos en el array 'a' ");
        for (i= 0; i<a.length; i++)
        {
            System.out.println("Posicion " + (i+1) + ":");
            a[i]= sc.nextInt();
        }
        System.out.println("Introduce datos en el array 'b' ");
        for (i= 0; i<b.length; i++)
        {
            System.out.println("Posicion " + (i+1) + ":");
            b[i]= sc.nextInt();
        }
        System.out.println("pasamos los numeros al arreglo 'c" );
        j=0;
        for(i= 0;i<10; i++)
        {
        c[j]=a[i];
        System.out.println(c[j]);
        j++;
        c[j]=b[i];
        System.out.println(c[j]);
        j++;
        }
    }
}
