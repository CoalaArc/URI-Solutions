import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

  public static void main(String[] args) throws IOException {

    Scanner read = new Scanner(System.in);

    int a = read.nextInt();
    int b = read.nextInt();

    int x = a + b;

    System.out.println(String.format("X = %d", x));
  }

}
