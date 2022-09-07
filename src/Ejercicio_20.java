public class Ejercicio_20 {

    /*
    Crearemos un arreglo de 6 posiciones, que contendrá valores entre 1 y 100,
    aleatoriamente, para eso se usará el método random, de la clase Math.
    Posteriormente, ese arreglo será pasado al método, y ese método
    al final nos devolverá cuál es el mayor del arreglo
     */
   public static void main ( String[] args){
       int max;
       int t []= new int[6];
       System.out.println(" Imprime un nuemero ramdom del 1 al 100:");

       System.out.println(" Los numeros Aleatorios son: ");
       for( int i= 0; i< t.length; i++)
        {
            t[i]=(int)(Math.random() * 100+1 );
            System.out.println(t[i]);
       }
       max= Ejercicio_20seg.numeroMaximo(t);
       System.out.println("El numero Mayor es "+ max);


   }
}
