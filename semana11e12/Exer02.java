package semana11e12;
import java.util.Random;
import java.util.Arrays;
/*
 * Exercício 2. Escreva um trecho Java que exiba os valores de um array a double numa mesma linha. 
 */

public class Exer02 {
    public static void main(String[] args){
        double array[] = new double[10];
        Random sorteadorDouble = new Random();

        for(int i = 0; i < array.length; i++){
            double doubleAleatorio = sorteadorDouble.nextDouble();

            array[i] = doubleAleatorio;
        }

        System.out.println(Arrays.toString(array));

    }
}
