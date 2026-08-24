import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class hopensource01 {

/* Crea un programa que imprima por consola todos los números comprendidos
 * entre 10 y 55 (incluidos), pares, y que no son ni el 16 ni múltiplos de 3. */

    public static void main  (String[] args) {
        List<Integer> miListaFinal = new ArrayList<>();

        List<Integer> miListaCompleta = crearListaNumeros(10, 55);

        // System.out.println(miListaCompleta);

        int numeroInicial = Collections.min(miListaCompleta);
        int numeroFinal = Collections.max(miListaCompleta);
        int numeroActual = numeroInicial;

        while (numeroActual <= numeroFinal) {
            // las condiciones
            if (numeroActual != 16 && !esMultiploDeTres(numeroActual) && esPar(numeroActual)) {
                miListaFinal.add(numeroActual);
                numeroActual += 1;
            } else {
                numeroActual += 1;
            }
        }

        System.out.println(miListaFinal);
        
    }

    //  Método para generar una lista de números entre dos numeros dados
    public static List<Integer> crearListaNumeros (int numInicial, int numFinal) {
        // Instanciamos  la lista vacía
        List<Integer> listaNumeros = new ArrayList<>();
        // Cerramos el inicio de la lista en nuestro numInicial
        int num = numInicial;

        // Poblamos la lista vacía desde el nímero inicial hasta el número final con un bucle while
        while (num <= numFinal) { // Mientras el numero sea menor o igual que nuestro numFinal fijado
            listaNumeros.add(num); // añadimos el numero a la lista
            num += 1; // y avanzamos un numero más
        }
        return listaNumeros;
    }

    // Metodo para seleccionar pares
    public static boolean esPar (int numero) {
        //return numero % 2 == 0;
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
        // Metodo para seleccionar multiplos de tres
    public static boolean esMultiploDeTres (int numero) {
        return numero % 3 == 0; //versión más limpia
        /* 
        if (numero % 3 == 0) {
            return true;
        } else {
            return false;
        }
        */
    }
    
}
