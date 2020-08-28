package matrizes;

import java.util.Scanner;

public class SOMA_MATRIZES {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //declaração de variáveis
        int
                i,
                j,
                M,
                N;

        int[][]
                A,
                B,
                C;

        //leitura das linhas e colunas
        System.out.println("Informe as dimensoes das matrizes.");
        System.out.print("Linhas: ");
        M = input.nextInt();
        System.out.print("Colunas: ");
        N = input.nextInt();

        //dimensoes das matrizes
        A = new int[M][N];
        B = new int[M][N];
        C = new int[M][N];

        //leitura da matriz A
        for (i=0; i<M; i++)
        {
            System.out.printf("Informe os números da %d° linha da Matriz A:%n", i+1);
            for (j=0; j<N; j++)
            {
                A[i][j] = input.nextInt();
            }
        }

        //leitura da matriz B
        for (i=0; i<M; i++)
        {
            System.out.printf("Informe os números da %d° linha da Matriz B:%n", i+1);
            for (j=0; j<N; j++)
            {
                B[i][j] = input.nextInt();
            }
        }

        //composição da matriz C
        for (i=0; i<M; i++)
        {
            for (j=0; j<N; j++)
            {
                C[i][j] = A[i][j] + B[i][j];
                System.out.printf("C[%d][%d] = %d%n", i, j, C[i][j]);
            }
        }
    }
}
