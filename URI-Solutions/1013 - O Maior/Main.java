import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

  public static void main(String[] args) throws IOException {

    int A;
    int B;
    int C;
    int MaiorAB;
    int Maior;

    Scanner read = new Scanner(System.in);

    A = read.nextInt();
    B = read.nextInt();
    C = read.nextInt();

    MaiorAB = (A + B + Math.abs(A - B)) / 2;
    Maior = (MaiorAB + C + Math.abs(MaiorAB - C)) / 2;

    System.out.println(String.format("%d eh o maior", Maior));

  }

}