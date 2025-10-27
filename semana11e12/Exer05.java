package semana11e12;
/*
 * Exercício 5. Crie um método que recebe um array de inteiros a e um valor inteiro x 
 * e retorna a quantidade de vezes que x aparece no array a.
 */

public class Exer05 {
    public static void valores(int[] a, int x){
        int cont = 0;
        for(int i = 0; i < a.length; i++){
            if (a[i] == x) {
                cont++;
            }
        }
        System.out.println("O valor " +x+ " apareceu " +cont+ " vezes no array informado.");
    }

    public static void main(String[] args){
        int[] a = {3, 0, 90, -78, 25, 50, 71, 0, 28, 50, 50,};
        int x = 50;
        valores(a, x);
    }
}
