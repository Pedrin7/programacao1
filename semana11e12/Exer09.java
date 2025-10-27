package semana11e12;
import java.util.Arrays;
/*
 * Exercício 9. Crie um método que recebe um array de inteiros 
 * positivos e substitui seus elementos de valor ímpar por -1 e os pares por +1.
 */

public class Exer09 {
    public static int[] troca(int[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0){
                array[i] = -1;
            }else if(array[i] % 2 == 0){
                array[i] = 1;
            }
        }
        return array;
    }

    public static void main(String[] args){
        int[] arrayParaTeste = {5, 8, 1, 30, 7, 2, 100, 19, 44};
        System.out.println(Arrays.toString(troca
        (arrayParaTeste)));
    }
}
