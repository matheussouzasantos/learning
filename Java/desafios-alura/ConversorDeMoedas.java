package DesafiosAlura;

public class ConversorDeMoedas {
    public static void main(String[] args){
        // considere 1 dolar = 5,50 reais
        double valorEmDolar = 10.90;
        double conversaoParaReal = valorEmDolar * 5.50;
        String valorEmReal = String.format("%.2f", conversaoParaReal);

        System.out.println("O valor em dolar é: " + valorEmDolar);
        System.out.println("O valor em real é: " + valorEmReal);

    }
}
