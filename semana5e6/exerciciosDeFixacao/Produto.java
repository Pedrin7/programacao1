// Exercício 4. Crie uma classe chamada Produto, que possui um nome, um valor, uma descrição (tipo String) e uma quantidade em estoque.

public class Produto{
    public String nome;
    public Float valor;
    public String descricao;
    public Integer quantidade;

    public Produto(){
        
    }

    public Produto(String nome, Float valor, String descricao, Integer quantidade){
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.quantidade = quantidade;

    }
}