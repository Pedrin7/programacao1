package semana7e8.ExerciciosDeFixacao;

public class exer2 {

    public static void main(String[] args) {
        
        /* TRANSFORMANDO O WHILE ABAIXO EM FOR. WHILE 01:

         int x = 10;
            while(x < 100){
                System.out.println(x);
                x++;
            }
         */

        /* TRANSFORMAÇÃO DO WHILE 01 EM FOR ABAIXO:

        for(int x = 10; x < 100; x++){
            System.out.println(x);
        }
        */

        // ----------------------------------------------------

        /* TRANSFORMANDO O WHILE ABAIXO EM FOR. WHILE 02:

        int y = 100;

        while(y >= 0)
            System.out.println(y--);
        */

        /*TRANSFORMAÇÃO DO WHILE 02 EM FOR ABAIXO:

        for(int y = 100; y >= 0; y--){
           System.out.println(y--);
        }
        */

        // -----------------------------------------

        /* TRANSFORMANDO O WHILE ABAIXO EM FOR. WHILE 03:
        int z = 50;

        while(z != 10)

            if(z > 10)
                z--;
            else
                z++;
        */

        /* TRANSFORMAÇÃO DO WHILE 03 EM FOR ABAIXO:

        for(int z = 50; z != 10;){
            if (z > 10) {   
                z--;
            }
            else{
                z++
            }
        }
        */
    }
    
}