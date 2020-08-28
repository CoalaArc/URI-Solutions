package vetores;

import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                S=0,
                B=0,
                A=0,
                S1=0,
                B1=0,
                A1=0,
                i,
                j,
                N;
        int[]
                jogadas = new int[3],
                pontos = new int[3];
        String
                Jogador;

        N = input.nextInt();

        for (i=0;i<N;i++)
        {
            Jogador = input.next();

            for (j=0; j<3; j++)
            {
                jogadas[j] = input.nextInt();
            }
            for (j=0; j<3; j++)
            {
                pontos[j] = input.nextInt();
            }
            S += jogadas[0];
            B += jogadas[1];
            A += jogadas[2];

            S1 += pontos[0];
            B1 += pontos[1];
            A1 += pontos[2];
        }

        System.out.printf("Pontos de Saque: %.2f %%.\n" +
                "Pontos de Bloqueio: %.2f %%.\n" +
                "Pontos de Ataque: %.2f %%.\n",
                (double)S1/S*100, (double)B1/B*100, (double)A1/A*100);
    }
}
