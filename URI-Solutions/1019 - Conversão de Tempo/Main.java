import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

  public static void main(String[] args) throws IOException {

    int N, horas, minutos, segundos;

    Scanner read = new Scanner(System.in);

    N = read.nextInt();

    horas = N / 3600;
    N %= 3600;

    minutos = N / 60;
    N %= 60;

    segundos = N;

    System.out.println(horas + ":" + minutos + ":" + segundos);

  }

}
