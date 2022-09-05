import java.util.Scanner;

public class Ejercicio_7 {

    /*
    Capturaremos 10 números enteros, y el programa al final nos dirá
    de esos 10 números, cuál es el promedio de los positivos,
    cuál fue de los negativos, y la cantidad de ceros ingresados.
     */
    public static void main (String [] args){
        int num= 0, cantidadNegativo = 0, cantidadPositivo= 0;
        int sumaNegativos=0, sumaPositivos=0, catidadCeros=0;
        double promedioPositivo= 0, promedioNegativo=0;
        int k =0;

        Scanner teclado= new Scanner(System.in);

        while ( k<10) {
            System.out.println("Introduce un numero: ");
            num = teclado.nextInt();
            if (num == 0) catidadCeros++;
            else if (num > 0) {
                cantidadPositivo++;
                sumaPositivos = sumaPositivos + num;
            } else {
                cantidadNegativo++;
                sumaNegativos = sumaNegativos + num;
            }
            k++;
        }
                if(cantidadPositivo==0) System.out.println(" No se puede realizar el promedio");
                else {
                    promedioPositivo= sumaPositivos/cantidadPositivo;
                    System.out.println(" El promedio de los positivos es:" + promedioPositivo);
                }
                if (cantidadNegativo==0) System.out.println(" No se puede realizar el promedio");
                else {
                    promedioNegativo= sumaNegativos/ cantidadNegativo;
                    System.out.println("el promedio de los negativos es:  " + promedioNegativo);
                }
            System.out.println("La cantidad e ceros es: " + catidadCeros);
    }
}
