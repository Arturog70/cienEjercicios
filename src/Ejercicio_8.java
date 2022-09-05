import java.util.Scanner;

public class Ejercicio_8 {

    /*
    El programa es para gestionar facturas de una empresa azucarera,
    que se encarga de la venta por kilos; la factura pedirá el código del producto,
    la cantidad de kilos, el precio por cada kilo, y el importe de esa factura.
    Además, por cada 5 facturas, nos dirá cuál de ellas sobrepasó la cantidad de $1000,
    y nos dará la facturación total de esas 5 facturas.
     */
    public static void main (String [] args){

        String codigo= " ";
        int kilos =0;
        float precio=0, importeFactura=0, facturaTotal= 0;
        int contador =0;
        int totalKilos= 0;
        Scanner sc= new Scanner(System.in);

        for(int i= 1; i <=5; i++)
        {

            System.out.println("Facturacion n° " + i );
            System.out.println(" Codigo del producto: ");
            codigo = sc. next();
            System.out.println("cantidad de Kilos: ");
            kilos= sc.nextInt();
            System.out.println("Precio: ");
            precio= sc.nextFloat();
            importeFactura= kilos*precio;
            facturaTotal= importeFactura + facturaTotal;

            if (importeFactura>= 1000)
            {
                contador++;
            }
            totalKilos= kilos+totalKilos;
        }
        System.out.println("detalles de la venta: ");
        System.out.println("Facturacion Total: $" + facturaTotal);
        System.out.println("Total de kilos vendidos: " + totalKilos);
    }
}
