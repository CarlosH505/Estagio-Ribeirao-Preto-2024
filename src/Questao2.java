import java.util.Scanner;

public class Questao2 {

    public static boolean Fibonacci(int numero) {
        int primeiroNumero = 0;
        int segundoNumero = 1;

        while (primeiroNumero <= numero) {
            if (primeiroNumero == numero) {
                return true;
            }
            int proximo = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = proximo;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número ");
        int numeroDigitado = scanner.nextInt();

        boolean verdadeiro = Fibonacci(numeroDigitado);

        if (verdadeiro) {
            System.out.println("o número pertence à sequência de Fibonacci.");
        } else {
            System.out.println("o número não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}
