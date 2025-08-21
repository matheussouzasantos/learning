import java.util.Scanner;

public class ParOuImpar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numeroDigitado = input.nextInt();

        if (numeroDigitado % 2 == 0) {
            System.out.println("O número digitado é par!");
        } else {
            System.out.println("O número digitado é impar!");
        }
    }
}
