import java.text.DecimalFormat;
import java.util.Random;

public class Principal {
    public static void main(String[] args) {
        String[] nomes = {
            "João", "Maria", "Pedro", "Ana", "José", "Carla", "Miguel", "Sofia", "Lucas", "Laura",
            "Gustavo", "Beatriz", "Rafael", "Isabela", "Samuel", "Lara", "Daniel", "Letícia", "Bruno",
            "Fernanda", "Gabriel", "Mariana", "Vitor", "Julia", "Diego"
        };

        Pessoa[] alunos = new Pessoa[25]; // Criação do array de alunos

        Random random = new Random();
        DecimalFormat df = new DecimalFormat("0.00"); // Formato para duas casas decimais

        for (int i = 0; i < alunos.length; i++) {
            String nome = nomes[random.nextInt(nomes.length)];
            int idade = random.nextInt(20) + 18; // Idades entre 18 e 37 anos
            double peso = random.nextDouble() * 50 + 50; // Pesos entre 50 e 100 kg
            double altura = random.nextDouble() * 0.5 + 1.5; // Alturas entre 1.5 e 2.0 metros

            alunos[i] = new Pessoa(nome, idade, peso, altura);
        }

        Presenca registroPresenca = new Presenca(alunos);
        registroPresenca.gerarPresencaAleatoria();
        registroPresenca.imprimirPresenca(df);
    }
}







