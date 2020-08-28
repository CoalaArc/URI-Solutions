package vetores;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                i;
        double[]
                N =  new double[100];

        for (i=0; i < N.length; i++)
        {
            N[i] = input.nextDouble();
            if (N[i] <= 10) System.out.printf("A[%d] = %.1f%n", i, N[i]);
        }
    }
}
