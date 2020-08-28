package vetores;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                i;
        int[]
                N =  new int[10];

        for (i=0; i < 10; i++)
        {
            N[i] = input.nextInt();

            if (N[i] <= 0) N[i] = 1;

            System.out.printf("X[%d] = %d%n", i, N[i]);
        }
    }
}
