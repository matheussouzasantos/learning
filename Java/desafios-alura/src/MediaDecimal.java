package DesafiosAlura.src;

public class MediaDecimal {
    public static void main(String[] args) {
        double nota1 = 8.1;
        double nota2 = 5.3;

        double mediaDeNotas = (nota1 + nota2) / 2;
        String resultado = String.format("%.1f", mediaDeNotas);
        System.out.println("A média das notas é: " + resultado);
    }
}
