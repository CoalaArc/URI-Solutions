package com.company;

public class SequenciaIJ4 {

    public static void main(String[] args)
    {
        int i;
        float I, J;
        for (i=0, I=0, J=1; I<2.1; I+=0.2, i++)
        {
            if (i == 0 || i == 5)
            {
                System.out.printf("I=%.0f J=%.0f\n", I, J+I);
                System.out.printf("I=%.0f J=%.0f\n", I, J+1+I);
                System.out.printf("I=%.0f J=%.0f\n", I, J+2+I);
                i=0;
            } else
            {
                System.out.printf("I=%.1f J=%.1f\n", I, J+I);
                System.out.printf("I=%.1f J=%.1f\n", I, J+1+I);
                System.out.printf("I=%.1f J=%.1f\n", I, J+2+I);
            }
        }
    }
}
