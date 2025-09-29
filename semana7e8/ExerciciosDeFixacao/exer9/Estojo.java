package semana7e8.ExerciciosDeFixacao.exer9;
import java.util.Scanner;

public class Estojo {
    public Caneta c1;
    public Caneta c2;

    public Estojo(){

    }

    public Estojo (Caneta c1, Caneta c2) {
        this.c1 = c1;
        this.c2 = c2;
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

        Scanner sc = new Scanner(System.in);
        Caneta c1 = new Caneta();
        Caneta c2 = new Caneta();
        Estojo e1 = new Estojo(c1, c2);
        
        System.out.println("Informe a marca da primeira caneta:");
        String marcaC1 = sc.next();
        System.out.println("Informe a marca da segunda caneta:");
        String marcaC2 = sc.next();

        e1.c1.setMarca(marcaC1);
        e1.c2.setMarca(marcaC2);

        System.out.println("---------------------------------------------");

        System.out.println("Informe a cor da primeira caneta em RGB: ");
        e1.c1.cor.setR(sc.nextInt());
        e1.c1.cor.setG(sc.nextInt());
        e1.c1.cor.setB(sc.nextInt());

        System.out.println("---------------------------------------------");

        System.out.println("Informe a cor da segunda caneta em RGB: ");
        e1.c2.cor.setR(sc.nextInt());
        e1.c2.cor.setG(sc.nextInt());
        e1.c2.cor.setB(sc.nextInt());
        
        sc.close();

        System.out.println("-----Estojo----");
        System.out.println(e1.c1.imprimeMarca());
        System.out.println(e1.c2.imprimeMarca());

    }
}