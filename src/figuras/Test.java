package figuras;

/**
 * La clase Test tiene el método main que prueba la clase Circunferencia.
 */
public class Test {
    /**
     * El método principal que crea Circunferencia y verifica si son iguales.
     *
     * @param args Argumentos de línea de comandos no utilizados qquí
     */
    public static void main(String[] args) {
        // el radio y el color
        Circunferencia c1 = new Circunferencia(5.5, "Rojo");
        Circunferencia c2 = new Circunferencia(10.1, "Azul");
        Circunferencia c3 = new Circunferencia(10.9, "Azul");

        // compueba si las circunferencias son iguales
        if (c2.esIgual(c3, false)) { // El orden de los parámetros ha cambiado
            System.out.println("c2 y c3: iguales sin considerar decimales");
        }

        if (c2.esIgual(c3, true)) { // El orden de los parámetros ha cambiado
            System.out.println("c2 y c3: iguales considerando decimales");
        }
    }
}
