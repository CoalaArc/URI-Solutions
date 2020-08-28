import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

  public static void main(String[] args) throws IOException {

    double raio;
    double pi = 3.14159;
    double volume;

    Scanner read = new Scanner(System.in);

    raio = read.nextDouble();
    volume = (4.0 / 3) * pi * Math.pow(raio, 3);

    System.out.printf("VOLUME = %.3f", volume);
    System.out.println();

  }

}
