import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeCliente = "Matheus Souza";
        String tipoDeConta = "Corrente";
        double saldo = 2500.00;
        int opcaoEscolhida = 0;

        System.out.println("***********************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("\nNome: \t" + nomeCliente);
        System.out.println("Tipo conta: \t" + tipoDeConta);
        System.out.println("Saldo inicial: \t" + saldo);
        System.out.println("***********************************");

        String menu = """
                \nOperacoes
                \n1- Consultar saldo
                2- Depositar valor
                3- Transferir pix
                4- Sair
                """;
        while (opcaoEscolhida != 4) {
            System.out.println(menu);
            opcaoEscolhida = input.nextInt();

            if (opcaoEscolhida == 1) {
                System.out.println("Seu saldo atual é de R$ " + saldo);
            } else if (opcaoEscolhida == 2) {
                System.out.println("Digite o valor a ser depositado");
                double deposito = input.nextDouble();
                saldo += deposito;
            } else if (opcaoEscolhida == 3) {
                System.out.println("Digite o valor a ser transferido");
                double tranferencia = input.nextDouble();
                if (tranferencia > saldo) {
                    System.out.println("Saldo insuficiente");
                } else {
                    saldo -= tranferencia;
                }
            } else if (opcaoEscolhida == 4) {
                System.out.println("Encerrando programa");
            } else {
                System.out.println("Operacao inválida");
            }
        }
    }
}
