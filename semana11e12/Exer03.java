package semana11e12;
import java.util.Scanner;
import java.util.Arrays;

/*
 * Exercício 3. Escreva um trecho Java que leia 10 valores double do teclado e armazene-os num array d.
 */

public class Exer03 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double nums[] = new double[10];

        double num = 0;
        System.out.println("Informe números para armazenar no array: ");
        for(int i = 0; i < nums.length;i++){
            System.out.print((i+1)+ "º: ");
            num = sc.nextDouble();
            sc.nextLine();
            nums[i] = num; 
        }

        System.out.println(Arrays.toString(nums));

        sc.close();
    }
}
