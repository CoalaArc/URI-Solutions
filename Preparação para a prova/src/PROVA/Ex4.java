package PROVA;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                primo,
                j,
                i,
                N;

        boolean
                prime;

        N = input.nextInt();
        if (N == 1) System.out.println("2");
        else
        {
            System.out.print("2 ");
            for (i=1, primo=3; i<N; i++)
            {
                prime = false;
                while (!prime)
                {

                    if (primo%2 != 0)
                    {
                        j=2;
                        prime = true;
                        while (j < primo && prime)
                        {
                            if (primo%j == 0) prime = false;
                            j++;
                        }
                        if (prime) System.out.printf("%d ",primo);
                    }
                    primo++;
                }
            }
        }
    }
}
