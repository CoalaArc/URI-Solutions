package vetores;

import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long[]
                Fib;
        int
                j,
                T,
                N,
                i;

        T = input.nextInt();

        for (i=0; i<T; i++)
        {
            N = input.nextInt();
            Fib = new long[N+1];
            if (N == 0) System.out.println("Fib(0) = 0");
            else if (N == 1) System.out.println("Fib(1) = 1");
            else
            {
                Fib[0] = 0;
                Fib[1] = 1;
                for (j=2; j<Fib.length; j++)
                {
                    Fib[j] = Fib[j-2] + Fib[j-1];
                }
                System.out.printf("Fib(%d) = %d%n", j-1, Fib[j-1]);
            }
        }
    }
}
