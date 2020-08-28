import java.io.IOException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    int N, valor;
    int n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 1;

    Scanner read = new Scanner(System.in);

    N = read.nextInt();

    valor = N;

    n100 = N / 100; // notas de 100
    N %= 100; // resto

    n50 = N / 50;
    N %= 50;

    n20 = N / 20;
    N %= 20;

    n10 = N / 10;
    N %= 10;

    n5 = N / 5;
    N %= 5;

    n2 = N / 2;
    N %= 2;

    n1 = N;

    System.out.println(valor);
    System.out.println(n100 + " nota(s) de R$ 100,00");
    System.out.println(n50 + " nota(s) de R$ 50,00");
    System.out.println(n20 + " nota(s) de R$ 20,00");
    System.out.println(n10 + " nota(s) de R$ 10,00");
    System.out.println(n5 + " nota(s) de R$ 5,00");
    System.out.println(n2 + " nota(s) de R$ 2,00");
    System.out.println(n1 + " nota(s) de R$ 1,00");

  }

}