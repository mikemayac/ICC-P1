import java.util.Scanner;

/**
 * La clase {@code CuadradoInscrito} calcula el perímetro de un cuadrado inscrito en otro cuadrado.
 * <p>
 * El programa solicita al usuario la longitud de un lado del cuadrado exterior y, a partir de esta medida,
 * calcula el lado del cuadrado inscrito. La figura inscrita se obtiene al conectar los puntos medios de cada lado
 * del cuadrado exterior. La fórmula utilizada para calcular el lado del cuadrado inscrito es:
 * <pre>
 *     ladoCuadradoInscrito = √((ladoCuadrado/2)² + (ladoCuadrado/2)²)
 * </pre>
 * y el perímetro se obtiene multiplicando el lado del cuadrado inscrito por 4:
 * <pre>
 *     perimetroCuadradoInscrito = 4 * ladoCuadradoInscrito
 * </pre>
 * </p>
 *
 * @author Joel Miguel Maya Castrejón
 * @version 1.0
 */
public class CuadradoInscrito {

    /**
     * Punto de entrada del programa.
     * <p>
     * Este método solicita al usuario que ingrese el lado del cuadrado exterior, calcula el lado del cuadrado
     * inscrito utilizando la relación geométrica entre ambas figuras, y finalmente muestra el perímetro del
     * cuadrado inscrito formateado con tres decimales.
     * </p>
     *.
     */
    public static void main(String[] args) {
        double ladoCuadrado;
        double ladoCuadradoInscrito;
        double mitadLadoCuadrado;
        double perimetroCuadradoInscrito;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa que encuentra el perímetro del cuadrado inscrito a un cuadrado del cuál conocemos " +
                "solo uno de sus lados l.");

        System.out.print("Ingrese el lado del cuadrado: ");
        ladoCuadrado = scanner.nextDouble();

        mitadLadoCuadrado = ladoCuadrado / 2;
        ladoCuadradoInscrito = Math.sqrt(Math.pow(mitadLadoCuadrado, 2) + Math.pow(mitadLadoCuadrado, 2));
        perimetroCuadradoInscrito = ladoCuadradoInscrito * 4;

        System.out.println("El perímetro del cuadrado inscrito es: " + String.format("%.3f", perimetroCuadradoInscrito));
    }
}
