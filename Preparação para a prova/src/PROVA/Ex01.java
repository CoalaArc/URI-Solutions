package PROVA;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[]
                P = new double[2],
                Q = new double[2];

        double
                d;

        P[0] = input.nextDouble();//x1
        P[1] = input.nextDouble();//y1
        Q[0] = input.nextDouble();//x2
        Q[1] = input.nextDouble();//y2
        while (P[0] != 0 || P[1] != 0 || Q[0] != 0 || Q[1] != 0)
        {
            d = Math.sqrt(Math.pow((Q[0] - P[0]), 2) + Math.pow((Q[1] - P[1]), 2));

            System.out.printf("A distancia entre os pontos P(%.1f , %.1f) e Q(%.1f , %.1f) é: %.2f%n",
                    P[0], P[1], Q[0], Q[1], d);
            //restart
            P[0] = input.nextDouble();//x1
            P[1] = input.nextDouble();//y1
            Q[0] = input.nextDouble();//x2
            Q[1] = input.nextDouble();//y2
        }
    }
}
