import java.util.Scanner;

public class Ejercicio_5 {
/*
Usando un ciclo while, haremos este programa.
Se nos pedirán una indeterminada cantidad de números,
con la condición que sólo sean positivos.
Y el programa sumará esos números, y obtendrá su promedio
 */
    public static void main (String [] args){

        int num = 0, sum= 0, cantidadDeNumeros = 0;
        double media= 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero positivo");
        num= sc.nextInt();
        while (num>0){
            sum= sum+ num;
            cantidadDeNumeros++;
            System.out.println("introduzca otro numero");
            num= sc.nextInt();
        }             if (media==0){
                System.out.println("no se puede sumar");
            }
            else{
                media= suma/cantidadDeNumeros;
            System.out.println("");
            }
    }
}
