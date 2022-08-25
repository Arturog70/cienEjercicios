import java.util.Scanner;

/**
 *Crearemos un arreglo de 30 posiciones, para almacenar las 30 ventas del mes.
 * Y al final el programa mostrará en pantalla cuáles
 * y en total cuántas superan la cantidad de $2000.
 */
public class Ejercicio_1 {

    public static void main(String[] args) {
        double ventas[] = new double[10];
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las 10 ventas del mes");

        for (int i = 0; i < ventas.length; i++) {

            System.out.println("Venta numero " + (i + 1));
            ventas[i] = sc.nextDouble();
        }
        int k =0;
        int total = 0;
        System.out.println("Ventas iguales o mayores a $2000");
        while( k< 10 )
        {
            if (ventas[k]>=2000){
                System.out.println("$ " + ventas [k]);
                total++;
            }
            k++;
        }
        System.out.println("el total de ventas mayores a $2000" + total);


    }
}

