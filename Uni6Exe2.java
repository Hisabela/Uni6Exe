import java.util.Scanner;

public class Uni6Exe2 {

    // Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. Imprima quais valores desses informados são maiores que a média dos valores. Faça um método para ler os valores, outro para calcular a média e outro para informar os valores maiores que a média.

    public static void main(String[] args) {
        double[] valores = new double[12];

        ler(valores);
        double media = media(valores);
        maioresQueMedia(valores, media);
    }

    public static void ler(double[] v) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < v.length; i++)
            v[i] = sc.nextDouble();
        sc.close();
    }

    public static double media(double[] v) {
        double soma = 0;
        for (double n : v)
            soma += n;
        return soma / v.length;
    }

    public static void maioresQueMedia(double[] v, double m) {
        for (double n : v)
            if (n > m)
                System.out.println(n);
    }
}
