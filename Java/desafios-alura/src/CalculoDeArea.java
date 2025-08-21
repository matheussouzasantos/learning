import java.util.Scanner;

public class CalculoDeArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\nQual operacao deseja fazer?\n1. Calcular área do quadrado\n2. Calcular área do círculo");
        int operacaoEscolhida = input.nextInt();

        if (operacaoEscolhida == 1) {
            System.out.println("Digite quanto mede o lado do quadrado (somente números): ");
            double ladoDoQuadrado = input.nextDouble();
            String areaDoQuadrado = String.format("%.2f", ladoDoQuadrado * ladoDoQuadrado);

            System.out.println("A área do quadrado é: " + areaDoQuadrado + " (unidades ao quadrado)");

        } else if (operacaoEscolhida == 2) {
            System.out.println("Digite quanto mede o raio do circulo (somente números): ");
            double raioDoCirculo = input.nextDouble();
            String areaDoCirculo = String.format("%.2f", (3.14 * (raioDoCirculo * raioDoCirculo)));

            System.out.println("A área do quadrado é: " + areaDoCirculo + " (unidades ao quadrado)");

        } else {
            System.out.println("O número inserido nao corresponde a nenhuma opcao");
        }
    }
}
