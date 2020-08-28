package PROVA;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                b,
                i,
                N;

        N = input.nextInt();

        for (i=0; i<N; i++)
        {
            for (b=0; b<=i; b++)
            {
                System.out.printf("%d ", b+1);
                if (b == i) System.out.println();
            }
        }
    }
}
