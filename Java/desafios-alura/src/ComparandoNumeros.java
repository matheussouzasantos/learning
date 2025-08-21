import java.util.Scanner;

public class ComparandoNumeros {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        int primeiroNumero = input.nextInt();

        System.out.println("Digite um segundo numero inteiro");
        int segundoNumero = input.nextInt();

        if (primeiroNumero == segundoNumero) {
            System.out.println("Os numeros sao iguais");
        } else if (primeiroNumero > segundoNumero) {
            System.out.println("Os numeros sao diferentes");
            System.out.println("O primeiro numero é maior");
        } else if (primeiroNumero < segundoNumero) {
            System.out.println("Os numeros sao diferentes");
            System.out.println("O segundo numero é maior");
        }
    }
}
