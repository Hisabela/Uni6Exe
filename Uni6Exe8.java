import java.util.Scanner;

public class Uni6Exe8 {
    
    //Faça um programa que leia um valor N inteiro limitado a 20 posições. Com base neste valor, crie um vetor do tipo real. Faça o usuário informar valores para as posições deste vetor e coloque-as nas posições na sequência informada pelo usuário. Imprima uma tabela contendo cada valor diferente e o número de vezes que o valor aparece no vetor (veja exemplo a seguir).


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int MAX = 20;
        System.out.print("Digite a quantidade de valores (máx. 20): ");
        int n = sc.nextInt();

        if (n < 1 || n > MAX) {
            System.out.println("Quantidade inválida. Deve ser entre 1 e 20.");
            return;
        }

        double[] valores = new double[n];

        // Lê os valores do vetor
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = sc.nextDouble();
        }

        // Contar frequências
        boolean[] contado = new boolean[n];

        System.out.printf("\n%-10s%-10s\n", "VALOR", "FREQUÊNCIA");

        for (int i = 0; i < n; i++) {
            if (!contado[i]) {
                double valorAtual = valores[i];
                int frequencia = 1;

                for (int j = i + 1; j < n; j++) {
                    if (valores[j] == valorAtual) {
                        frequencia++;
                        contado[j] = true;
                    }
                }

                System.out.printf("%-10.2f%-10d\n", valorAtual, frequencia);
            }
        }

        sc.close();
    }
}


/*
Exemplo de uso
Digite a quantidade de valores (máx. 20): 8
Digite o valor 1: 2.1
Digite o valor 2: 3.7
Digite o valor 3: -4.2
Digite o valor 4: 2.1
Digite o valor 5: 3.75
Digite o valor 6: -4.2
Digite o valor 7: 2.1
Digite o valor 8: 7.0

VALOR     FREQUÊNCIA
2.10      3
3.70      1
-4.20     2
3.75      1
7.00      1 */