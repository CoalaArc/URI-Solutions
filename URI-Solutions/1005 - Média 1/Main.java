import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

  public static void main(String[] args) throws IOException {

    double A;
    double B;
    double MEDIA;

    Scanner read = new Scanner(System.in);

    A = read.nextDouble();
    B = read.nextDouble();

    MEDIA = (A * 3.5 + B * 7.5) / 11;

    System.out.printf("MEDIA = %,.5f\n", MEDIA);

  }

}
