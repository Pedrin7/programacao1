package semana7e8.ExerciciosDeFixacao.exer9;

public class Cor {

    public int r, g ,b;

    public Cor(){
        
    }

    public Cor(int r, int g, int b){
        this.r = r;
        this.g = g;
        this.b = b;
    }

    public int getR(){
        return r;
    }

    public void setR(int r){
        this.r = r;
    }

    public int getG(){
        return g;
    }

    public void setG(int g){
        this.g = g;
    }

    public int getB(){
        return b;
    }

    public void setB(int b){
        this.b = b;
    }

    public String imprime(){
        return "R: "+getR()+ " G: " +getG()+ " B: " +getB();  
    }
}
