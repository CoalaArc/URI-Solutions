package com.company;

import java.util.Scanner;

public class PUM {

    public static void main(String[] args)
    {
        Scanner input  = new Scanner(System.in);
        int N, i=0, linha=1, br=0;

        N = input.nextInt();

        while(linha <= N)
        {
            i++;
            br++;
            if (i%4 == 0)
            {
                System.out.print("PUM");
            }
            else System.out.printf("%d ",i);

            if (br == 4)
            {
                System.out.println();
                br=0;
                linha++;
            }
        }
    }
}
