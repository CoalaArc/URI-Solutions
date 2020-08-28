package vetores;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                i;
        double[]
                N =  new double[100];

        N[0] = input.nextDouble();
        System.out.printf("N[%d] = %.4f%n", 0, N[0]);
        for (i=1; i < N.length; i++)
        {
            N[i] = N[i-1]/2;

            System.out.printf("N[%d] = %.4f%n", i, N[i]);
        }
    }
}
