import java.util.Scanner;

public class Ejercicio_19 {

    /*
    Programa que calcule el costo del estacionamiento en un parking.
    Las primeras 3 horas se cobrarán a 20 pesos.
    Las siguientes después de las 3 horas, a 15 pesos.
    Hasta llegar al tope de 250 pesos, para 24 horas.
    Si se permanece aparcado por más de un día, se cobrarán 250 pesos por día.
    Y 15 pesos las horas siguientes. Se le pedirá al usuario ingresar
    la cantidad de horas, y debe obtener el precio. Usar métodos.
     */
    public static void main (String[] args) {
        int numHoras = 0;
        double precioTotal = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Cantidad de Horas: ");
        numHoras = sc.nextInt();
        precioTotal = calcularPrecio(numHoras);
        System.out.println("Total a Pagar " + precioTotal);
    }
    public static double calcularPrecio(int horas)
    {
        double precio, preciResto;
        int restHoras;
            int dias;
            if( horas<= 24)
            {
                if (horas <=3)
                {
                precio= horas*15;
                }
                else
                {
                precio=((3*20)+ (horas-3) *15);
                if(precio>=250)
                {
                precio= 250;
                }
            }
        }
            else
            {
                dias= horas/ 24;
                restHoras= horas%24;
                System.out.println("Tu coche estuvo aparcado " + dias +"dias" +", y  "+ restHoras+ "horas" );
                preciResto= restHoras*15;
                if (preciResto>=250)
                {
                    preciResto= 250;
                }
                precio=dias* 250+ preciResto;
            }
            return precio;

        }
    }

