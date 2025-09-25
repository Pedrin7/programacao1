// Exercício 2. Crie uma classe chamada Computador, que possui 4 atributos, sendo eles a marca, a velocidade, 
// o ano de fabricação e um atributo que indica se o computador é novo.

public class Computador {

    public String marca;
    public Float velocidade;
    public Integer ano;
    public boolean novo;

    public Computador(){
        
    }

    public Computador(String marca, Float velocidade, Integer ano, boolean novo){
        this.marca = marca;
        this.velocidade = velocidade;
        this.ano = ano;
        this.novo = novo;
    }

}
