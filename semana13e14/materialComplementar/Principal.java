package semana13e14.materialComplementar;
import java.util.Arrays;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pedro", 23, 75, 1.80);
        Pessoa p2 = new Pessoa("Maya", 23, 68, 1.68);
        Pessoa p3 = new Pessoa("Rossano", 58, 100, 1.79);
        Pessoa p4 = new Pessoa("Maristela", 56, 70, 1.55);

        Pessoa[] pessoas = new Pessoa[4];
        pessoas[0] = p1;
        pessoas[1] = p2;
        pessoas[2] = p3;
        pessoas[3] = p4;

        Presenca p = new Presenca(pessoas);
        // System.out.println(Arrays.toString(pessoas));
        p.gerarPresencaAleatoria();
        p.imprimirPresenca(null);


    }
}
