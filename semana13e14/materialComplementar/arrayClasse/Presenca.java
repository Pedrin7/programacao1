import java.text.DecimalFormat;

public class Presenca {
    private boolean[] presenca; // Array para armazenar as informações de presença
    private Pessoa[] alunos; // Array de objetos Pessoa

    public Presenca(Pessoa[] alunos) {
        this.alunos = alunos;
        this.presenca = new boolean[alunos.length]; // Inicializa o array de presença com o mesmo tamanho do array de alunos
    }

    public boolean[] getPresenca() {
        return presenca;
    }

    public void setPresenca(boolean[] presenca) {
        this.presenca = presenca;
    }

    public void marcarPresenca(int indice) {
        if (indice >= 0 && indice < alunos.length) { // Verifica se o índice fornecido é válido
            presenca[indice] = true; // Marca a presença do aluno no índice especificado como true
            System.out.println("Presença marcada para o aluno " + alunos[indice].getNome());
        } else {
            System.out.println("Índice inválido!");
        }
    }

    public void gerarPresencaAleatoria() {
        for (int i = 0; i < presenca.length; i++) {
            presenca[i] = Math.random() < 0.5; // Gera aleatoriamente true ou false
        }
    }

    public void imprimirPresenca(DecimalFormat df) {
        for (int i = 0; i < alunos.length; i++) {
            System.out.println("Posição: " + i);
            if (alunos[i] != null) {
                System.out.println("Aluno: " + alunos[i].getNome());
                System.out.println("Idade: " + alunos[i].getIdade());
                System.out.println("Peso: " + df.format(alunos[i].getPeso()));
                System.out.println("Altura: " + df.format(alunos[i].getAltura()));

                if (presenca[i]) {
                    System.out.println("Presença: Presente");
                } else {
                    System.out.println("Presença: Ausente");
                }
            } else {
                System.out.println("Aluno não presente");
            }
            System.out.println();
        }
    }
}


    
