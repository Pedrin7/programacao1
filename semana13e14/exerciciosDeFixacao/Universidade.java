package semana13e14.exerciciosDeFixacao;

public class Universidade {
// --- Atributos ---
    private String nome;
    private int numeroDeAlunos;

    // --- Construtor ---
    public Universidade(String nome, int numeroDeAlunos) {
        this.nome = nome;
        this.numeroDeAlunos = numeroDeAlunos;
    }

    // --- Métodos de Acesso (Getters e Setters) ---

    // Nome
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Número de Alunos
    public int getNumeroDeAlunos() {
        return this.numeroDeAlunos;
    }
    public void setNumeroDeAlunos(int numeroDeAlunos) {
        this.numeroDeAlunos = numeroDeAlunos;
    }

    public void imprimeUniversidade(Universidade[] u){
        for(int i = 0; i < u.length; i++){
            System.out.println("Universidade: " +(i + 1)+ "º");
            System.out.println("------------------------");
            System.out.println("Título: " +u[i].getNome());
            System.out.println("Número de alunos: " +u[i].getNumeroDeAlunos());
            System.out.println("------------------------");
        }
    }

    public Universidade maisAlunos(Universidade[] u){
        int maiorQtdAlunos = u[0].getNumeroDeAlunos();
        Universidade uMaiorQtdAlunos = u[0];

        for(int i = 1; i <u.length; i++){
            if (u[i].getNumeroDeAlunos() > maiorQtdAlunos) {
                maiorQtdAlunos = u[i].getNumeroDeAlunos();
                uMaiorQtdAlunos = u[i];
            }
        }

        return uMaiorQtdAlunos;
    }
}
