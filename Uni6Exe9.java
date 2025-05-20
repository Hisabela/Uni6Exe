import java.util.Scanner;
public class Uni6Exe9 {

/*Um cinema pretende fazer uma pesquisa para avaliar o grau de satisfação de seus clientes. Trinta deles foram ouvidos e para cada um disse-se o sexo (1=feminino 2=masculino), uma nota para o cinema (zero até dez, valor inteiro) e a idade.

Baseado nisto faça um programa que informe:

qual a nota média recebida pelo cinema;
qual a nota média atribuída pelos homens;
qual a nota atribuída pela mulher mais jovem;
quantas mulheres com mais de 50 anos deram nota superior a média recebida pelo cinema.
Utilize os conceitos sobre vetores (ou mesmo o uso de matriz) e métodos para a resolução deste exercício.

*/


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int TOTAL = 30;

        int[] sexo = new int[TOTAL];   // 1 = feminino, 2 = masculino
        int[] nota = new int[TOTAL];   // 0 a 10
        int[] idade = new int[TOTAL];

        int somaNotas = 0;
        int somaHomens = 0;
        int qtdHomens = 0;
        int menorIdadeMulher = Integer.MAX_VALUE;
        int notaMulherMaisJovem = 0;
        int mulheres50NotaAcimaMedia = 0;

        // Entrada de dados
        for (int i = 0; i < TOTAL; i++) {
            System.out.println("Pessoa " + (i + 1));

            System.out.print("Sexo (1=feminino, 2=masculino): ");
            sexo[i] = sc.nextInt();

            System.out.print("Nota (0 a 10): ");
            nota[i] = sc.nextInt();

            System.out.print("Idade: ");
            idade[i] = sc.nextInt();

            somaNotas += nota[i];

            if (sexo[i] == 2) { // homem
                somaHomens += nota[i];
                qtdHomens++;
            }

            if (sexo[i] == 1) { // mulher
                if (idade[i] < menorIdadeMulher) {
                    menorIdadeMulher = idade[i];
                    notaMulherMaisJovem = nota[i];
                }
            }
        }

        double mediaGeral = (double) somaNotas / TOTAL;

        // Verificar mulheres com mais de 50 que deram nota maior que a média
        for (int i = 0; i < TOTAL; i++) {
            if (sexo[i] == 1 && idade[i] > 50 && nota[i] > mediaGeral) {
                mulheres50NotaAcimaMedia++;
            }
        }

        System.out.printf("\nNota média geral: %.2f\n", mediaGeral);

        if (qtdHomens > 0) {
            double mediaHomens = (double) somaHomens / qtdHomens;
            System.out.printf("Nota média dos homens: %.2f\n", mediaHomens);
        } else {
            System.out.println("Nenhum homem respondeu à pesquisa.");
        }

        System.out.println("Nota da mulher mais jovem: " + notaMulherMaisJovem);
        System.out.println("Mulheres com mais de 50 anos que deram nota acima da média: " + mulheres50NotaAcimaMedia);

        sc.close();
    }
}


