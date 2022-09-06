import java.util.Scanner;

public class Ejercicio_18 {
    /*
    El programa nos pedirá el número de piezas, y el precio por pieza.
    Si se compraron 100 o más piezas, se aplicará un descuento del 20%.
    Crearemos un método que nos diga cuánto será el total a pagar.
     */
    public static void main (String[] args)
    {
        int num_piezas=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Cantidad de piezas");
        num_piezas = sc.nextInt();
        System.out.println("precio por piezas");
        double precio = sc.nextDouble();
        double pagoTotal= calcularPago(num_piezas,precio);
        System.out.println("El pago total es: " + pagoTotal);
    }
    public static double calcularPago(int piezas, double precio)
    {
        double pagoTotal=0;
        if ( piezas>= 100)
        {
            pagoTotal= (precio*piezas)-(precio*0.20* piezas);
        }
        else
        {
            pagoTotal= precio*piezas;
        }
        return pagoTotal;
    }
}
