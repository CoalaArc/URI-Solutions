package PROVA;


import java.util.Scanner;


public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int
                i,
                A,
                B;
        long
                soma=0;

        System.out.print("Digite o valor de A (menor numero): ");
        A = input.nextInt();
        System.out.print("Digite o valor de B (maior numero): ");
        B = input.nextInt();

        i = A+1;
        while (i < B)
        {
            if (i%2 == 0)
            {//entrou, entao é par;
                soma = soma + (i*i*i);
            }
            i++;
        }
        System.out.println(soma);
    }
}
