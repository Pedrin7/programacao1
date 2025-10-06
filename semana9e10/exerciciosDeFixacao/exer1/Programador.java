public class Programador extends Pessoa{
    
    private String linguagemPreferida;

    public Programador(String nome, int idade, String linguagemPreferida){
        super(nome, idade);
        this.linguagemPreferida = linguagemPreferida;
    }

    public void setLinguagemPreferida(String linguagemPreferida){this.linguagemPreferida = linguagemPreferida;}
    public String getLinguagemPreferida(){return linguagemPreferida;}

    public void imprimeDados(){
        System.out.println("Nome do programador: " +getNome()+ "\nIdade: " +getIdade()+ 
            "\nLinguagem preferida: " + getLinguagemPreferida());
    } 
}
