import java.util.Scanner;
/*
Desplazar una posición a los elementos de un array.
 */
public class Ejercico_16 {
    public static void main (String [] args)
    {
        int x [] = new int [10]; // s declara un array con 10 posiciones
        int ultimo;
        Scanner sc= new Scanner(System.in);// se manda la llamar a la clase Scanner

        for(int i=0; i<10; i++)// se declara un ciclo force para introducir los datos
        {
            System.out.println("introduce un numero entero: ");
            x[i]= sc.nextInt(); // se almacenan las variables capturadas por el Scanner
        }
        ultimo=x[9];
        for ( int i =8; i>=0; i--)// ciclo Fore para decremento
        {
            x[i + 1] = x[i];
        }
        x[0]= ultimo;
        System.out.println("Mostrar Arreglo con desplazando la posicion: ");
        for (int i= 0; i<10; i++)
        {
            System.out.println(x[i]);
        }


    }
}
