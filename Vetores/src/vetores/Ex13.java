package vetores;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                N,
                i;
        int[]
                L;
        String
                letras;

        while (input.hasNext())
        {
            letras = input.next();
            N = input.nextInt();
            L = new int[N];

            for (i=0; i<N; i++)
            {
                L[i] = input.nextInt();
            }
            for (i=0; i<N; i++)
            {
                System.out.printf("%s", letras.charAt(L[i]-1));
            }
            System.out.println();
        }
    }
}
