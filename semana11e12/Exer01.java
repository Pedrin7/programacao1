package semana11e12;
import java.util.Arrays;

/*
 * Exercício 1. Para cada conjunto de valores abaixo, 
 * escreva o código Java, usando laço(s), que preencha um array com os valores:

    10   9   8   7   6   5   4   3   2   1
    0   1   4   9   16   25   36   49   64   81   100
    1   2   3   4   5   10   20   30   40   50
    3   4   7   12   19   28   39   52   67   84

 */

public class Exer01{
    public static void main(String[] args){
        // int a[] = new int[10];

        // for(int i = 0; i < a.length; i++){
        //     a[i] = 10 - i;
        // }

        // System.out.println(Arrays.toString(a));

        // int b[] = new int[11];

        // for(int i = 0; i < b.length;i++){
        //     int j = i * i;
        //     b[i] = j;
        // aqui tambem é uma sequencia quadrática
        // }

        // System.out.println(Arrays.toString(b));

        // int c[] = new int[10];
        
        // int j = 10;
        // for(int i = 0; i < c.length;i++){
        //     if (i < 5) {
        //         c[i] = i + 1;
        //     }
        //     else{
        //         c[i] = j;
        //         j+=10;
        //     }
        // }
        // System.out.println(Arrays.toString(c));

        int d[] = new int[10];

        int sequenciaQuadratica = 0;
        for(int i = 0; i <d.length; i++){
            sequenciaQuadratica = (i * i) + 3;
            d[i] = sequenciaQuadratica;
        }
        System.out.println(Arrays.toString(d));
    }
}