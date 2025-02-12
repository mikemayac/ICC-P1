import java.util.Scanner;

/**
 * La clase {@code Conversion} implementa un programa para convertir una cantidad de kilos a libras.
 * <p>
 * Este programa solicita al usuario una cantidad en kilos y, utilizando la constante de conversión,
 * calcula el equivalente en libras. La conversión se realiza con la fórmula:
 * <pre>
 *     kilosAlibras = kilos * LIBRA
 * </pre>
 * donde <code>LIBRA</code> es la cantidad de libras equivalente a 1 kilogramo (2.20462).
 * </p>
 *
 * @author Joel Miguel Maya Castrejón
 * @version 1.0
 */
public class Conversion {

    /**
     * Punto de entrada del programa.
     * <p>
     * Este método solicita al usuario que introduzca la cantidad de kilos a convertir, realiza la conversión
     * a libras y muestra el resultado formateado en la consola.
     * </p>
     *
     */
    public static void main(String[] args) {
        final double LIBRA = 2.20462;
        double kilos;
        double kilosAlibras;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa conversor de kilos a libras.");
        System.out.print("Introduce en número la cantidad de kilos: ");
        kilos = scanner.nextDouble();
        kilosAlibras = kilos * LIBRA;
        System.out.println(kilos + " kilos a libras son " + kilosAlibras + " libras.");
    }
}
