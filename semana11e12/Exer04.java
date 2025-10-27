package semana11e12;
/*
 * Exercício 4. Crie um método que recebe um array de inteiros e retorna a 
 * quantidade de elementos do array que são números negativos.
 */

public class Exer04 {
    public static void menoresQueZero(int[] array){
        int cont = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] < 0) {
                System.out.println(array[i]);
                cont++;
            }
        }
        System.out.println("A quantidade de números negativos é: "+cont);
    }

    public static void main(String[] args){
        int[] meuArray = {1, -5, 10, -3, 99, 12, -36,0,36,88};
        menoresQueZero(meuArray);
    }
}
