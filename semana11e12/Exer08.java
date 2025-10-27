package semana11e12;
import java.util.Scanner;
import java.util.Arrays;
/*
 * Exercício 8. Faça um método que devolve um array de números inteiros lidos do teclado. 
 * O tamanho do array também deve ser solicitado pelo teclado ao usuário.
 */

public class Exer08 {
    public static int[] informe(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o tamnho do array: ");
        int tamanho = sc.nextInt();
        sc.nextLine();
        System.out.println("---------------------------");

        int[] array = new int[tamanho];

        for(int i = 0; i < array.length; i++){
            System.out.println("Informe um número inteiro para adicionar no array: ");
            int num = sc.nextInt();
            sc.nextLine();
            array[i] = num;
        }

        sc.close();
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void main(String[] args){
        informe();

    }
}
