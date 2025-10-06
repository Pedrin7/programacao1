public class Melancia extends Fruta{

    private double precoAdicional;
    private boolean ehEpoca;

    public Melancia(String nome, double preco, double precoAdicional, boolean ehEpoca){
        super(nome, preco);
        this.precoAdicional = precoAdicional;
        this.ehEpoca = ehEpoca;
    }

    public void setPrecoAdicional(double precoAdicional){this.precoAdicional = precoAdicional;}
    public double getPrecoAdicional(){return precoAdicional;}

    public void setEhEpoca(boolean ehEpoca){this.ehEpoca = ehEpoca;}
    public boolean isEhEpoca(){return ehEpoca;}

    public double calculaPrecoFinal(double imposto){

        double precoTotal = getPreco() + getPrecoAdicional();

        if(isEhEpoca()) {
            return precoTotal;
        }else{
            return precoTotal + (precoTotal * imposto);
        }
    }
}
