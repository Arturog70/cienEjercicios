import javax.swing.*;

public class Ejercicio_11 {

    public static void main(String[]args){

        int calificacion =0;
        String numeroDecontrol= " ";
        boolean reprobado = false;
        for( int i=0;  i<5; i++)
        {
         numeroDecontrol= JOptionPane.showInputDialog("Ingrese el numero de control");
         calificacion= Integer.parseInt(JOptionPane.showInputDialog("Introduce la calificacion "));
         if(calificacion<6) reprobado= true;
         if (reprobado==true)
         {
             JOptionPane.showMessageDialog(null, "El Alumno " + " "+numeroDecontrol +" "+ "ha reprovado");
         }
         else
         {
             JOptionPane.showMessageDialog(null, "El alumno " +""  +numeroDecontrol +" "+ "No ha reprovado");
         }
        }
    }
}
