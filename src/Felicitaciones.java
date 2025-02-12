/**
 * La clase {@code Felicitaciones} construye e imprime un mensaje de felicitación utilizando
 * códigos ASCII para representar cada carácter.
 * <p>
 * En este programa se evita el uso de literales de cadena directamente, generando cada carácter
 * a partir de su valor numérico mediante la conversión <code>(char)</code>. De esta forma se construyen
 * varias líneas que, en conjunto, muestran el siguiente mensaje:
 * </p>
 * <pre>
 * Muchas felicidades Joel!!
 * En la facultad estamos que no cabemos de gusto y orgullo por que están aprendiendo
 * a programar en Java con orientación a objetos.
 * De verdad "Muchas felicidades!!"
 * Un abarazo :)
 * </pre>
 *
 * @author Joel Miguel Maya Castrejón
 * @version 1.0
 */
public class Felicitaciones {

    /**
     * Punto de entrada del programa.
     * <p>
     * Este método construye cada línea del mensaje de felicitación concatenando caracteres
     * obtenidos a partir de sus respectivos códigos ASCII, y los imprime en la consola.
     * </p>
     *
     */
    public static void main(String[] args) {
        // Imprime la primera línea: "Muchas felicidades Joel!!"
        System.out.println(
                ""
                        + (char)77   // M
                        + (char)117  // u
                        + (char)99   // c
                        + (char)104  // h
                        + (char)97   // a
                        + (char)115  // s
                        + (char)32   // espacio
                        + (char)102  // f
                        + (char)101  // e
                        + (char)108  // l
                        + (char)105  // i
                        + (char)99   // c
                        + (char)105  // i
                        + (char)100  // d
                        + (char)97   // a
                        + (char)100  // d
                        + (char)101  // e
                        + (char)115  // s
                        + (char)32   // espacio
                        + (char)74   // J
                        + (char)111  // o
                        + (char)101  // e
                        + (char)108  // l
                        + (char)33   // !
                        + (char)33   // !
        );

        // Imprime la segunda línea:
        // "En la facultad estamos que no cabemos de gusto y orgullo por que están aprendiendo"
        System.out.println(
                ""
                        + (char)69   // E
                        + (char)110  // n
                        + (char)32   // espacio
                        + (char)108  // l
                        + (char)97   // a
                        + (char)32   // espacio
                        + (char)102  // f
                        + (char)97   // a
                        + (char)99   // c
                        + (char)117  // u
                        + (char)108  // l
                        + (char)116  // t
                        + (char)97   // a
                        + (char)100  // d
                        + (char)32   // espacio
                        + (char)101  // e
                        + (char)115  // s
                        + (char)116  // t
                        + (char)97   // a
                        + (char)109  // m
                        + (char)111  // o
                        + (char)115  // s
                        + (char)32   // espacio
                        + (char)113  // q
                        + (char)117  // u
                        + (char)101  // e
                        + (char)32   // espacio
                        + (char)110  // n
                        + (char)111  // o
                        + (char)32   // espacio
                        + (char)99   // c
                        + (char)97   // a
                        + (char)98   // b
                        + (char)101  // e
                        + (char)109  // m
                        + (char)111  // o
                        + (char)115  // s
                        + (char)32   // espacio
                        + (char)100  // d
                        + (char)101  // e
                        + (char)32   // espacio
                        + (char)103  // g
                        + (char)117  // u
                        + (char)115  // s
                        + (char)116  // t
                        + (char)111  // o
                        + (char)32   // espacio
                        + (char)121  // y
                        + (char)32   // espacio
                        + (char)111  // o
                        + (char)114  // r
                        + (char)103  // g
                        + (char)117  // u
                        + (char)108  // l
                        + (char)108  // l
                        + (char)111  // o
                        + (char)32   // espacio
                        + (char)112  // p
                        + (char)111  // o
                        + (char)114  // r
                        + (char)32   // espacio
                        + (char)113  // q
                        + (char)117  // u
                        + (char)101  // e
                        + (char)32   // espacio
                        + (char)101  // e
                        + (char)115  // s
                        + (char)116  // t
                        + (char)225  // á (en ISO-8859-1)
                        + (char)110  // n
                        + (char)32   // espacio
                        + (char)97   // a
                        + (char)112  // p
                        + (char)114  // r
                        + (char)101  // e
                        + (char)110  // n
                        + (char)100  // d
                        + (char)105  // i
                        + (char)101  // e
                        + (char)110  // n
                        + (char)100  // d
                        + (char)111  // o
        );

        // Imprime la tercera línea:
        // "a programar en Java con orientación a objetos."
        System.out.println(
                ""
                        + (char)97   // a
                        + (char)32   // espacio
                        + (char)112  // p
                        + (char)114  // r
                        + (char)111  // o
                        + (char)103  // g
                        + (char)114  // r
                        + (char)97   // a
                        + (char)109  // m
                        + (char)97   // a
                        + (char)114  // r
                        + (char)32   // espacio
                        + (char)101  // e
                        + (char)110  // n
                        + (char)32   // espacio
                        + (char)74   // J
                        + (char)97   // a
                        + (char)118  // v
                        + (char)97   // a
                        + (char)32   // espacio
                        + (char)99   // c
                        + (char)111  // o
                        + (char)110  // n
                        + (char)32   // espacio
                        + (char)111  // o
                        + (char)114  // r
                        + (char)105  // i
                        + (char)101  // e
                        + (char)110  // n
                        + (char)116  // t
                        + (char)97   // a
                        + (char)99  // c
                        + (char)105  // i
                        + (char)243  // ó (en ISO-8859-1)
                        + (char)110  // n
                        + (char)32   // espacio
                        + (char)97   // a
                        + (char)32   // espacio
                        + (char)111  // o
                        + (char)98  // b
                        + (char)106  // j
                        + (char)101  // e
                        + (char)116  // t
                        + (char)111  // o
                        + (char)115  // s
                        + (char)46   // .
        );

        // Imprime la cuarta línea:
        // "De verdad "Muchas felicidades!!""
        System.out.println(
                ""
                        + (char)68   // D
                        + (char)101  // e
                        + (char)32   // espacio
                        + (char)118  // v
                        + (char)101  // e
                        + (char)114  // r
                        + (char)100  // d
                        + (char)97   // a
                        + (char)100  // d
                        + (char)32   // espacio
                        + (char)34   // " (comilla doble)
                        + (char)77   // M
                        + (char)117  // u
                        + (char)99   // c
                        + (char)104  // h
                        + (char)97   // a
                        + (char)115  // s
                        + (char)32   // espacio
                        + (char)102  // f
                        + (char)101  // e
                        + (char)108  // l
                        + (char)105  // i
                        + (char)99   // c
                        + (char)105  // i
                        + (char)100  // d
                        + (char)97   // a
                        + (char)100  // d
                        + (char)101  // e
                        + (char)115  // s
                        + (char)33   // !
                        + (char)33   // !
                        + (char)34   // " (comilla doble)
        );

        // Imprime la quinta línea:
        // "Un abarazo :)"
        System.out.println(
                ""
                        + (char)85   // U
                        + (char)110  // n
                        + (char)32   // espacio
                        + (char)97   // a
                        + (char)98   // b
                        + (char)97   // a
                        + (char)114  // r
                        + (char)97   // a
                        + (char)122  // z
                        + (char)111  // o
                        + (char)32   // espacio
                        + (char)58   // :
                        + (char)41   // )
        );
    }
}
