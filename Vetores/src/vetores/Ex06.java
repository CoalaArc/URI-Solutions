package vetores;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                T,
                i,
                j;

        int[]
                N = new int[1000];

        T = input.nextInt();

        for (i=0, j=0; i<N.length; i++, j++)
        {
            if (j != T) N[i] = j;
            else
            {
                j=0;
                N[i] = j;
            }
        }

        i=0;
        for (int output: N)
        {
            System.out.printf("N[%d] = %d%n", i, output);
            i++;
        }
    }
}
