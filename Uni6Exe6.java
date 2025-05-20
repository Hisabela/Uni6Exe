import java.util.Scanner;

public class Uni6Exe6 {

    // Faça um programa que leia um valor N inteiro. Com base neste valor, crie um vetor do tipo real. Em seguida, solicite ao usuário informar essa quantidade N de valores reais para popular o vetor. Após ter preenchido o vetor, solicite que o usuário informe um outro valor real. Informe para o usuário se este valor informado se encontra cadastrado no vetor. Faça um método para ler o vetor e outro, que retorne verdadeiro ou falso, para encontrar o valor.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        double[] vetor = new double[N];

        lerVetor(sc, vetor);

        double valor = sc.nextDouble();

        if (encontrarValor(vetor, valor))
            System.out.println("Valor encontrado no vetor.");
        else
            System.out.println("Valor não encontrado no vetor.");

        sc.close();
    }

    static void lerVetor(Scanner sc, double[] v) {
        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextDouble();
        }
    }

    static boolean encontrarValor(double[] v, double val) {
        for (double n : v) {
            if (n == val) return true;
        }
        return false;
    }
}