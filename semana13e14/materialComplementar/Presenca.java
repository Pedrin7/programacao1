package semana13e14.materialComplementar;
import java.text.DecimalFormat;

public class Presenca {
    private boolean[] presenca;
    private Pessoa[] alunos;

    public Presenca(Pessoa[] alunos){
        this.alunos = alunos;
        this.presenca = new boolean[alunos.length];
    }

    public boolean[] getPresenca(){return presenca;}
    public void setPresenca(boolean[] presenca){this.presenca = presenca;}

    public void marcarPresenca(int indice){
        if (indice >= 0 && indice < alunos.length) {
            presenca[indice] = true;
            // confirmando a presença do aluno no indice informado
        }else{
            System.out.println("Índice inválido!");
        }
    }

    public void gerarPresencaAleatoria(){
        for(int i = 0; i < presenca.length; i++){
            presenca[i] = Math.random() < 0.5;
        }
    }

    public void imprimirPresenca(DecimalFormat df){
        for(int i = 0; i < alunos.length; i++){
            System.out.println("Posição: "+i);
            if (alunos[i] != null) {
                if (presenca[i] == true) {
                    System.out.println("Nome: "+alunos[i].getNome()+"\nIdade: "+alunos[i].getIdade()+
                        "\nPeso: "+alunos[i].getPeso()+"kg\nAltura: "+alunos[i].getAltura()+"\nPresente: aluno presente!");
                }else{
                    System.out.println("Nome: "+alunos[i].getNome()+"\nIdade: "+alunos[i].getIdade()+
                        "\nPeso: "+alunos[i].getPeso()+"kg\nAltura: "+alunos[i].getAltura()+"\nPresente: aluno ausente!");
                }
            }else{
                System.out.println("Nenhum aluno presente!");
            }
        }
    }
}
