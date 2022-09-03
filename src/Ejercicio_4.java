
import java.util.Scanner;
public class Ejercicio_4 {
    /*
    Crea un programa que este pidiendo numeros enteros
    cuando un cero sea introducido, finaliza la capturas de datos
    Suma los numeros y mostrar la suma en pantalla
     */
    public static void main (  String [] args) {
        int num= 0, suma= 0;
        Scanner sc= new Scanner(System.in);
        do {
        System.out.println("introduce un numero: ");
        num = sc.nextInt();
        suma = suma + num;
        } while (num!= 0 );
        System.out.println("la suma de todos los números es: " + suma);
    }
}
