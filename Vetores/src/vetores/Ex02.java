package vetores;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                i;
        int[]
                N =  new int[10];

        N[0] = input.nextInt();
        System.out.printf("N[%d] = %d%n", 0, N[0]);
        for (i=1; i < 10; i++)
        {
            N[i] = N[i-1]*2;

            System.out.printf("N[%d] = %d%n", i, N[i]);
        }
    }
}
