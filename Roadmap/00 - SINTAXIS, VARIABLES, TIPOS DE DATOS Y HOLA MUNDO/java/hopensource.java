// https://www.java.com/es/

// En java, para comentar en una sola línea se utilizan las dos barras //

/*
Pero si queremos escribir comentarios multilínea tenemos esta otra opción
sin necesidad de estar escribiendo la doble barrita repetidamente.
*/

public class hopensource {
    
    // crear una variable 
    int variable = 1;

    // crear una constante
    final int VAR_CONSTANTE = 2;   // No termino de entender la diferencia entre "final" vs. "static".
    static int VAR_STATIC = 5; // Quiero ver si se comportan diferente

    // crear una variable diferente para cada tipo de dato 
    int varInt = 234;
    float varFloat = 12.15f;
    double varDouble = 256.342;
    static String varString = "Hola mundo"; // necesita que sea estático para poder llamaro en el main --> En realidad string no es un primitivo en java
    boolean varBool = true;
    byte varByte = 124; // 8 bits
    short varShort = 13454; // 16 bits
    long varLong = 165L;
    char varChar = '.'; // Un solo caracter 

    public static void main (String[] args) {

        String varStringNoEstatica = "¡Hola, Java!";
        System.out.println(varString);
        System.out.println(varStringNoEstatica);
        // System.out.println(VAR_CONSTANTE); --> Aqui la diferencia, la final no me deja usarla en el main
        System.out.println(varStringNoEstatica.getClass()); // Método para identificar tipo de dato 
        System.out.println(varStringNoEstatica.getClass().getSimpleName()); // Nombre del tipo de dato simplificado

    }
    
}
