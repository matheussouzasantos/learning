import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numeroDigitado = input.nextInt();

        int fatorial = 1;

        for (int i = 1; i <= numeroDigitado; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numeroDigitado + " é: " + fatorial);
    }
}
