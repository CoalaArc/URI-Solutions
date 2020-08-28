package com.company;

public class SequenciaS {

    public static void main(String[] args)
    {
        double S;
        int i;

        for (i=1, S=0; i<=100; i++)
        {
            S += (float)1/i;
        }
        System.out.printf("%.2f%n", S);
    }
}
