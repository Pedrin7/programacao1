import java.util.Scanner;

public class Teste {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int opcao = 0;

        Banana b1 = new Banana("Terra", 19.90, "Verde");
        Melancia m1 = new Melancia("Melancia gigante", 39, 9.90, true);
        Pessoa p1;

        System.out.println("Informe a opção");
        System.out.println("1 - Aluno");
        System.out.println("2 - Programador");
        opcao = sc.nextInt();
        sc.nextLine();

        if(opcao == 1) {
            p1 = new Aluno("Pedro", 23, 8.8);
            Aluno a = (Aluno) p1;
            System.out.println("A nota do aluno é: " +a.getNota());
        }else if (opcao == 2) {
            p1 = new Programador("Pedro", 23, "Java");
            Programador prog1 = (Programador) p1;
            System.out.println("A linguagem preferida do programador é: " +prog1.getLinguagemPreferida());
        }else{
            p1 = null;
        }
        sc.close();
    }
}
