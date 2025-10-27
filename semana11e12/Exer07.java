package semana11e12;
/*
 * Exercício 7. Escreva um método que recebe um array de double e devolve a posição onde se encontra o maior valor do array.
 *  Se houver mais de um valor maior, devolver a posição da primeira ocorrência.
 */

public class Exer07 {
    public static int posicaoDoMaiorNumDoArray(double[] array){
        int posicaoDoMaior = 0;
        double maior = 0;
        for(int i = 0; i < array.length; i++){  
            if (maior < array[i]) {
                maior = array[i];
                posicaoDoMaior = i;
            }
        }

        return posicaoDoMaior;
    }

    public static void main(String[] args){
        double[] array = {1000, 3, 5, 70, 60, 35 ,700};
        // resposta = 4
        System.out.println(posicaoDoMaiorNumDoArray(array));
    }
}
