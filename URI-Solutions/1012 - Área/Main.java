import java.io.IOException;
import java.util.Scanner;

/**
 * IMPORTANT: O nome da classe deve ser "Main" para que a sua solução execute
 * Class name must be "Main" for your solution to execute El nombre de la clase
 * debe ser "Main" para que su solución ejecutar
 */
public class Main {

  public static void main(String[] args) throws IOException {

    // entrada de valores
    double A;
    double B;
    double C;
    // area das formas geométricas
    double trianguloRetangulo;// (base*altura)/2
    double circulo;// pi*(raio*raio)
    double trapezio;// ((B+b)*h)/2
    double quadrado;// Base*Base
    double retangulo;// Base*h
    // constante
    double pi = 3.14159;

    Scanner read = new Scanner(System.in);
    // leitura da entrada
    A = read.nextDouble();
    B = read.nextDouble();
    C = read.nextDouble();
    // calculo das areas
    trianguloRetangulo = (A * C) / 2;
    circulo = pi * Math.pow(C, 2);
    trapezio = ((A + B) * C) / 2;
    quadrado = B * B;
    retangulo = A * B;

    System.out.printf("TRIANGULO: %.3f\n", trianguloRetangulo);
    System.out.printf("CIRCULO: %.3f\n", circulo);
    System.out.printf("TRAPEZIO: %.3f\n", trapezio);
    System.out.printf("QUADRADO: %.3f\n", quadrado);
    System.out.printf("RETANGULO: %.3f\n", retangulo);

  }

}
