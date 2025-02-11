import java.util.Scanner;

public class CuadradoInscrito {
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
        mitadLadoCuadrado = ladoCuadrado/2;
        ladoCuadradoInscrito = Math.sqrt(Math.pow(mitadLadoCuadrado, 2) + Math.pow(mitadLadoCuadrado, 2));
        perimetroCuadradoInscrito = ladoCuadradoInscrito * 4;

        System.out.println("El perímetro del cuadrado inscrito es: " + String.format("%.3f", perimetroCuadradoInscrito));
    }
}
