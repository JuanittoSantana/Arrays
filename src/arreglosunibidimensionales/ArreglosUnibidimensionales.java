/*
Ejemplo en el manejo de arreglos unibidimensional
 */
package arreglosunibidimensionales;

public class ArreglosUnibidimensionales {

    public static void main(String[] args) {

        //Arreglos declarado para 4 posiciones con valores emitidos
        // de forma directa
        int edad[] = {45, 29, 11, 67};

        for (int i = 0; i < edad.length; i++) {
            System.out.println("Valor " + edad[i]);

        }
        /*
        Arreglo declara para 5 posiciones de tipo String dándole sus valores de forma directa pero en forma separada
         */
        String nombre[] = new String[5];
        
        //Indices del 0 al 4 y son 5 elementos 
        nombre[0] = "José";
        nombre[1] = "María";
        nombre[2] = "Pedro";
        nombre[3] = "Joel";
        nombre[4] = "Francisco";
        
        for(int i = 0; i <nombre.length; i++){
            System.out.println("Nombre "+nombre[i]);
            
        }

    }

}
