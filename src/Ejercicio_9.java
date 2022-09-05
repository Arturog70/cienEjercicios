import java.util.Scanner;

public class Ejercicio_9 {
    /*
    El programa nos pedirá 6 calificaciones a introducir, y
    al final nos dirá cuántos alumnos aprobaron,
    cuántos tuvieron calificación de "excelencia", y cuántos reprobaron.
     */

    public static void main (String [] args)
    {
        int aprobar = 0;
        int reprovado =0;
        int exelente = 0;
        float califacion = 0;
        int i= 1;
        Scanner sc = new Scanner(System.in);
        while (i <=6 )
        {
            System.out.println("Introduce la calificacion del 0 al 10");
            califacion = sc.nextFloat();
            if (califacion==9 || califacion==10){
              exelente++;
        }
            else if (califacion>=6)
            {
                aprobar++;
            }
            else
                reprovado++;
            i++;
        }
        System.out.println("Cantidad de alumnos aprovados; " + aprobar);
        System.out.println("Cantidad de alumnos reprovados: " + reprovado);
        System.out.println("Cantidad de alumnos exelentes: " + exelente);
    }

}
