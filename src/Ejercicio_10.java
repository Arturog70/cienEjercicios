import javax.swing.JOptionPane;

public class Ejercicio_10 {

    public static void main( String [] args)
    {
         int cantidadDeSueldos= 0;
         int sueldo = 0, sueldoMaximo= 0;
         boolean primerSueldo= false;

         cantidadDeSueldos= Integer.parseInt(JOptionPane.showInputDialog("¿Cuantos Sueldos Capturara?"));

         for(int i= 1 ; i <= cantidadDeSueldos; i++)
         {
          sueldo = Integer.parseInt(JOptionPane.showInputDialog("Introduce el sueldo" + (i)));
          if (primerSueldo== false)
          {
              sueldoMaximo= sueldo;
              primerSueldo= true;
          }
          if (sueldo> sueldoMaximo)sueldoMaximo=sueldo;
          }
           JOptionPane.showMessageDialog(null,"El sueldo mayor es: " + sueldoMaximo);
    }
}
