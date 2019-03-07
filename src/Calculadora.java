
/**
 * Esta clase define dos métodos que nos permiten calcular el valor absoluto de un número pasado por parámetros
 * y la raíz cuadrada de un número
 *
 * @version: 08/03/2019
 * @author davidjimenez
 */
public class Calculadora {

    /**
     * Método que devuelve el valor absoluto de un número
     *
     * @param num El parámetro num es de tipo double y es el número del que
     * devolveremos el valor absoluto
     * @return el valor absoluto del número pasado por parámetros
     */
    public static double valorAbsoluto(double num) {
        if (num < 0) {
            num = (num * -1);

        }

        return num;

    }  // Cierre del método

    /**
     * Método que devuelve la raíz cuadrada de un número
     *
     * @param num El parámetro num es de tipo double
     * @return la raíz cuadrada del número pasado por parámetros
     */
    public static double raizCuadrada(double num) {

        return Math.sqrt(num);

    }  //Cierre del método
}
