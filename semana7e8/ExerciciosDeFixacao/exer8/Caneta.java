package semana7e8.ExerciciosDeFixacao.exer8;

public class Caneta {
    public String caneta;

    public Caneta(){
        
    }

    public Caneta(String caneta){
        this.caneta = caneta;
    }
    
    public String getCaneta(){
        return caneta;
    }

    public void setCaneta(String caneta){
        this.caneta = caneta;
    }

    public String imprimeCaneta(){
        return "Caneta: " +getCaneta();
    }
}
