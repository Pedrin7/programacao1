package semana7e8.ExerciciosDeFixacao.exer8;

public class Estojo {
    public Cor cor;
    public Caneta c1;
    public Caneta c2;

    public Estojo(){

    }

    public Estojo(Cor cor, Caneta c1, Caneta c2) {
        this.cor = cor;
        this.c1 = c1;
        this.c2 = c2;
    }

    public Cor getCor(){
        return cor;
    }

    public void setCor(Cor cor){
        this.cor = cor;
    }
    
    public Caneta getC1(){
        return c1;
    }

    public void setC1(Caneta c1){
        this.c1 = c1;
    }

    public Caneta getC2(){
        return c2;
    }

    public void setC2(Caneta c2){
        this.c2 = c2;
    }


    public static void main(String[] args){

        Cor cor = new Cor(5,5, 5);
        Caneta c1 = new Caneta("Azul");
        Caneta c2 = new Caneta("Vermelha");


        Estojo e1 = new Estojo(cor, c1, c2);

        System.out.println(e1.cor.imprime());
        System.out.println(e1.c1.imprimeCaneta());
        System.out.println(e1.c2.imprimeCaneta());
    }

}

