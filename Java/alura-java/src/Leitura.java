import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito");
        String filme = leitura.nextLine();
        System.out.println("Qual o ano de lancamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Diga sua avaliacao para o filme ");
        double avaliacao = leitura.nextDouble();

        System.out.println("O seu filme favorito é: " + filme);
        System.out.println("Seu filme é de: " + anoDeLancamento);
        System.out.println("Sua avaliacao para o filme foi de: " + avaliacao);
    }
}
