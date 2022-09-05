

class Ejercicio_6 {
    public class Coercion_6 {
        /*
        En este programa, se multiplicarán los primeros
        10 números impares, usando un ciclo for.
        Los valores son 1, 3, 5, 7, 9 11,13,15,17 y 19.
         */
        public void main(String[] args){
            long productosImpares= 1;
            for( int i = 1; i < 20; i+=2){
                productosImpares= productosImpares*i;
            }
            System.out.println("el producto de multipicar los primeros " +
                    "10 numeros impares son" + " " +productosImpares);
        }
    }

}