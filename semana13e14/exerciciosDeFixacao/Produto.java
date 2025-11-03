package semana13e14.exerciciosDeFixacao;

public class Produto {
    // --- Atributos ---
    private double preco;

    // --- Construtor ---
    public Produto(double preco) {
        this.preco = preco;
    }

    // --- Métodos de Acesso (Getters e Setters) ---

    // Preço
    public double getPreco() {
        return this.preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public Produto produtoMaisBarato(Produto[] arrayP){
        double precoMaisBaixo = arrayP[0].getPreco();
        Produto produtoComPrecoMaisBaixo = arrayP[0];
        for(int i = 1; i < arrayP.length; i++){
            if (arrayP[i].getPreco() < precoMaisBaixo) {
                precoMaisBaixo = arrayP[i].getPreco();
                produtoComPrecoMaisBaixo = arrayP[i];
                
            }
        }
        return produtoComPrecoMaisBaixo;
    }
}
