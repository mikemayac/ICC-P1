import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        final double LIBRA = 2.20462;
        double kilos;
        double kilosAlibras;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Programa conversor de kilos a libras.");
        System.out.print("Introduce en número la cantidad de kilos: ");
        kilos = scanner.nextDouble();
        kilosAlibras = kilos * LIBRA;
        System.out.println(kilos + " kilos a libras son " + kilosAlibras + "libras.");

    }
}
