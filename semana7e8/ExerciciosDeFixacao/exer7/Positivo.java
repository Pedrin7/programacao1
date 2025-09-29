package semana7e8.ExerciciosDeFixacao.exer7;
import java.util.Scanner;

public class Positivo {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um valor inteiro: ");
        int val = sc.nextInt();

        if (val <= 0) {
            System.out.println("Valor não é válido!");
            while (val <= 0 ) {
                System.out.println("----------------");
                System.out.println("Informe outro valor inteiro");
                val = sc.nextInt();                
            }
        }
        sc.close();
    }
}
