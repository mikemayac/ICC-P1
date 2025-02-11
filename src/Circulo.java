import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {
        final double PI = Math.PI;
        double diametro;
        double area;
        double perimetro;

        System.out.println("Programa para encontrar el area y perimetró de un círculo en base a su diámetro.");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduzca el valor de diametro del círculo: ");
        diametro = scanner.nextDouble();

        System.out.println("Calculo de área del círculo: ");

        area = PI * Math.pow((diametro/2),2);

        System.out.println("El área es: " + String.format("%.2f", area) );

        System.out.println("Calculo del perímetro: ");

        perimetro = PI * diametro;

        System.out.println("El perimetro es: " + String.format("%.2f", perimetro) );


    }
}
