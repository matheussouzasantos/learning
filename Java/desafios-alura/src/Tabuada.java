import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro que queira saber a tabuada");
        int numeroEscolhido = input.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(numeroEscolhido + "x" + i + "=" + (numeroEscolhido * i));
        }
    }
}
