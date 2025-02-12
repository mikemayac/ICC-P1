import java.util.Scanner;

/**
 * La clase {@code Circulo} implementa un programa que calcula el área y el perímetro
 * de un círculo a partir de su diámetro.
 * <p>
 * El programa solicita al usuario que ingrese el valor del diámetro del círculo y, utilizando
 * la constante {@code PI} de la clase {@link Math}, realiza los cálculos correspondientes:
 * <ul>
 *     <li><b>Área</b>: Se calcula utilizando la fórmula:
 *         <code>area = PI * (diametro / 2)^2</code>.</li>
 *     <li><b>Perímetro</b>: Se calcula mediante la fórmula:
 *         <code>perimetro = PI * diametro</code>.</li>
 * </ul>
 * Los resultados se muestran formateados con dos decimales.
 * </p>
 *
 * @author Joel Miguel Maya Castrejón
 * @version 1.0
 */
public class Circulo {

    /**
     * Punto de entrada del programa.
     * <p>
     * Este método solicita al usuario el valor del diámetro del círculo, calcula el área y el
     * perímetro usando las fórmulas descritas, y muestra los resultados por pantalla.
     * </p>
     *
     */
    public static void main(String[] args) {
        final double PI = Math.PI;
        double diametro;
        double area;
        double perimetro;

        System.out.println("Programa para encontrar el área y perímetro de un círculo en base a su diámetro.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el valor de diámetro del círculo: ");
        diametro = scanner.nextDouble();

        System.out.println("Cálculo del área del círculo: ");
        // Cálculo del área utilizando la fórmula: area = PI * (diametro/2)^2
        area = PI * Math.pow((diametro / 2), 2);
        System.out.println("El área es: " + String.format("%.2f", area));

        System.out.println("Cálculo del perímetro: ");
        // Cálculo del perímetro utilizando la fórmula: perimetro = PI * diametro
        perimetro = PI * diametro;
        System.out.println("El perímetro es: " + String.format("%.2f", perimetro));
    }
}
