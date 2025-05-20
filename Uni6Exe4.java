import java.util.Scanner;

public class Uni6Exe4 {

    // Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos. Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas dos vetores originais. Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. Exiba, ao final, os três vetores na tela. Faça três métodos: um método para ler valores dos vetores, outro para somar e outro para escrever os vetores.

    public static void main(String[] args) {
        int[] v1 = new int[10];
        int[] v2 = new int[10];
        int[] v3 = new int[10];

        ler(v1);
        ler(v2);
        somar(v1, v2, v3);
        escrever("Vetor 1", v1);
        escrever("Vetor 2", v2);
        escrever("Vetor 3", v3);
    }

    static void ler(int[] v) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < v.length; i++)
            v[i] = sc.nextInt();
        // Não fecha o scanner aqui para evitar fechar System.in prematuramente
    }

    static void somar(int[] v1, int[] v2, int[] v3) {
        for (int i = 0; i < v3.length; i++)
            v3[i] = v1[i] + v2[i];
    }

    static void escrever(String nome, int[] v) {
        System.out.print(nome + ": ");
        for (int n : v)
            System.out.print(n + " ");
        System.out.println();
    }
}
