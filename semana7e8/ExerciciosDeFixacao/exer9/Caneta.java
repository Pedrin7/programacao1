package semana7e8.ExerciciosDeFixacao.exer9;

public class Caneta {
    public String marca;
    public Cor cor;

    public Caneta(){
        this.cor = new Cor();
    }

    public Caneta(String marca, Cor cor){
        this.marca = marca;
        this.cor = cor;
    }
    
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public Cor getCor(){
        return cor;
    }

    public void setCor(Cor cor){
        this.cor = cor;
    }

    public String imprimeMarca(){
        return "Marca da caneta: " +getMarca() + "\nCor da caneta: " +cor.imprime();
    }
}
