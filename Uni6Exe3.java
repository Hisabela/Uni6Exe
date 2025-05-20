import java.util.Scanner;

public class Uni6Exe3 {

    //Uni6Exe03.java - Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. Em seguida, modifique o vetor de modo que os valores das posições ímpares sejam aumentados em 5% e os das posições pares sejam aumentados em 2%. Imprima o vetor resultante. Faça um método para ler os valores, outro para ajustar os valores dentro do vetor e outro para escrever os valores atualizados do vetor.

    public static void main(String[] args) {
        double[] v = new double[12];
        ler(v);
        ajustar(v);
        escrever(v);
    }

    static void ler(double[] v) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < v.length; i++) v[i] = sc.nextDouble();
        sc.close();
    }

    static void ajustar(double[] v) {
        for (int i = 0; i < v.length; i++)
            v[i] *= (i % 2 == 0) ? 1.02 : 1.05;
    }

    static void escrever(double[] v) {
        for (double n : v) System.out.println(n);
    }
}