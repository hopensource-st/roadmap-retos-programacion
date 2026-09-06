/*
 * Crea una función que reciba dos parámetros de tipo cadena de texto y retorne un número.
 * - La función imprime todos los números del 1 al 100. Teniendo en cuenta que:
 *   - Si el número es múltiplo de 3, muestra la cadena de texto del primer parámetro.
 *   - Si el número es múltiplo de 5, muestra la cadena de texto del segundo parámetro.
 *   - Si el número es múltiplo de 3 y de 5, muestra las dos cadenas de texto concatenadas.
 *   - La función retorna el número de veces que se ha impreso el número en lugar de los textos. --> Entiendo que cualquiera de los textos, A, B o ambos encadenados
*/

public class hopensource02 {

    // Atributos de la clase
    private static String stringA = "String A";
    private static String stringB = "String B";

    // Funcion main para ejecutar
    public static void main (String[] args) {

        int resultadoConteo = conteoStrings(stringA, stringB);
        
        System.out.println("El resultado del conteo de strings es: " +  resultadoConteo);
    }

    /*conteoString (String a, String b)
        DEVOLVER conteo agrupado de textos
    */
    public static int conteoStrings (String a, String b) {

        int conteo = 1;
        int conteoString = 0;

        while (conteo <= 100) {
            if (conteo % 3 == 0 && conteo % 5 == 0 ) {
                System.out.println(a + " " + b);
                conteo += 1;
                conteoString +=1;
            } else if (conteo % 3 == 0) {
                System.out.println(a);
                conteo += 1;
                conteoString += 1;
            } else if (conteo % 5 == 0) {
                System.out.println(b);
                conteo += 1;
                conteoString +=1;
            } else {
                System.out.println(conteo);
                conteo += 1;
            }
        }
        return conteoString;
    }

}
