package com.company;

public class SequenciaIJ3 {

    public static void main(String[] args)
    {

        for (int I=1, J=7; I<=9; J--)
        {
            System.out.printf("I=%d J=%d\n", I,J);
            if ((J-I) == 4)
            {
                I += 2;
                J = I + 7;
            }
        }
    }
}
