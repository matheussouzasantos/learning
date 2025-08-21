import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        System.out.println("Digite um número inteiro: ");
        Scanner input = new Scanner(System.in);
        int numeroEscolhido = input.nextInt();



        if (numeroEscolhido > 0) {
            System.out.println("O número inserido é positivo!");
        } else if (numeroEscolhido < 0) {
            System.out.println("O número inserido é negativo!");
        } else {
            System.out.println("O número inserido é zero");
        }
    }
}
