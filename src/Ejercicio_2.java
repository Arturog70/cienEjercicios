import java.util.Scanner;
/*
Saber cuál es el mayor de un arreglo.
 */
public class Ejercicio_2 {
    public static void main (String [] args) {

        int array[] = new int[5]; // declaramos el tamaño del array
        int mayor = array[0];
        Scanner sc = new Scanner(System.in);// mandamos llamar el Scanner para pedir datos al usuario
        System.out.println("ingresa los 5 numeros: "); // Solicitamos datos al usuario por medio de un String
        for (int i = 0; i < array.length; i++) { // hacemos un ciclo force

            array[i] = sc.nextInt();

            if (array[i] > mayor) {
                mayor = array[i];
            }
        }

        System.out.println("el numero mayor es "+ mayor);
    }

}
