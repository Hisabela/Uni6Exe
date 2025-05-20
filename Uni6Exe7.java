import java.util.Scanner;
import java.util.Arrays;

public class Uni6Exe7 {

    /*  Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base neste valor, crie um vetor do tipo inteiro. Em seguida, solicite ao usuário para digitar um número inteiro várias vezes, até preencher o vetor. Esse número deverá ser armazenado no vetor caso ainda não exista, e se o valor já existir deve ser pedido um novo valor. Isto é, se o usuário informar o número 2 e já existir o número 2 em alguma posição do vetor, o número não deve ser adicionado. Após ter adicionado todos os números dentro do vetor, o mesmo deve ser ordenado. Para isso reordene os elementos internos do vetor de modo que este fique em ordem crescente, conforme no exemplo:

    Vetor origem: [0][4][2][6][3]
    Vetor ordenado: [0][2][3][4][6] */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        if (N > 20) N = 20;

        int[] vetor = new int[N];
        int count = 0;

        while (count < N) {
            int num = sc.nextInt();
            if (!existe(vetor, count, num)) {
                vetor[count] = num;
                count++;
            }
            // Se existir, pede outro número (loop continua)
        }

        Arrays.sort(vetor);

        // Imprime vetor ordenado no formato pedido
        for (int i = 0; i < N; i++) {
            System.out.print("[" + vetor[i] + "]");
        }

        sc.close();
    }

    static boolean existe(int[] v, int tamanho, int num) {
        for (int i = 0; i < tamanho; i++) {
            if (v[i] == num) return true;
        }
        return false;
    }
}
