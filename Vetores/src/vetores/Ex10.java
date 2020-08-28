package vetores;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                padrao=0,
                i,
                N;

        int[]
                H;

        N = input.nextInt();
        H = new int[N];

        if (N == 2)
        {
            for (i=0; i<N; i++) H[i] = input.nextInt();
            if (H[i-1] == H[i-2]) padrao = 0;
            else padrao = 1;
        }
        else
        {
            for (i=0; i<N; i++) H[i] = input.nextInt();
            for (i = 2; i < N; i++)
            {
                if ((H[i] < H[i-1] && H[i-1] > H[i-2]) || H[i] > H[i-1] && H[i-1] < H[i-2])
                {
                    padrao = 1;
                }
                else padrao = 0;
            }
        }

        System.out.println(padrao);
    }
}
