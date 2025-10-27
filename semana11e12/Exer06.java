package semana11e12;
import java.util.Arrays;
/*
 * Exercício 6. Escreva um método que recebe um array de inteiros a e devolve um array de boolean onde, 
 * cada posição indique true se o elemento da posição correspondente de a é positivo e false caso seja negativo ou zero.
 */

public class Exer06 {
    public static boolean[] exer05(int[] array){
        boolean[] arrayBoolean = new boolean[array.length];
        for(int i = 0; i < array.length; i++){
            if (array[i] > 0) {
                arrayBoolean[i] = true;
            }else{
                arrayBoolean[i] = false;
            }
        }

        return arrayBoolean;
    }

    public static void main(String[] args){
        int[] array = {5,10 ,-3, 5, -22};
        System.out.println(Arrays.toString(exer05(array)));
    }
}
