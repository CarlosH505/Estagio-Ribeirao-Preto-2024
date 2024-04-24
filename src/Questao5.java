import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string para ser invertida: ");
        String original = scanner.nextLine();

        String invertida = inverterString(original);
        System.out.println("String invertida: " + invertida);

        scanner.close();
    }

    public static String inverterString(String original) {
        StringBuilder stringInvertida = new StringBuilder();

        for (int i = original.length() - 1; i >= 0; i--) {
            stringInvertida.append(original.charAt(i));
        }

        return stringInvertida.toString();
    }
}
