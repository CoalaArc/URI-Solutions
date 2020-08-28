package vetores;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                N,
                i;
        int
                V[];
        boolean
                stop = false;

        N = input.nextInt();

        V = new int[N];

        for (i=0; i<N; i++) V[i] = input.nextInt();

        for (i=1; i<N && !stop; i++)
        {
            if (V[i] < V[i-1]) stop = true;
        }

        if (stop) System.out.println(i);
        else System.out.println("0");
    }
}
