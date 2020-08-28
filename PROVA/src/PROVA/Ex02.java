package PROVA;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                i,
                j,
                N,
                M,
                par=0,
                impar=0;

        int[][]
                numeros;

        N = input.nextInt();
        M = input.nextInt();
        numeros = new int[N][M];

        for (i=0; i<N; i++)
        {//leitura dos numeros
            for (j=0; j<M; j++) numeros[i][j] = input.nextInt();
        }

        for (i=0; i<N; i++)
        {//conta impar na linha par
            if (i%2 == 0)
            {//se chegou aqui a linha é par
                for (j=0; j<M; j++)
                {
                    if (numeros[i][j]%2 != 0) impar++;
                }
            }
        }

        for (j=0; j<M; j++)
        {//conta par na coluna impar
            if (j%2 != 0)
            {//se chegou aqui a coluna é impar
                for (i=0; i<N; i++)
                {
                    if (numeros[i][j]%2 == 0) par++;
                }
            }
        }

        System.out.printf("PAR: %d\nIMPAR: %d\n", par, impar);

    }
}
