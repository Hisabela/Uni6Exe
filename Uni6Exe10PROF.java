import java.util.Scanner;

public class Uni6Exe10PROF {

    private Uni6Exe10PROF() {
        int opcao = 0;
        int vet[] = new int[50];
        int posicao = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite uma opção válida entre 1 e 8");
        do {
            System.out.println("Menu");
            System.out.println(" 1 - Incluir valor");
            System.out.println(" 2 - Pesquisar valor");
            System.out.println(" 3 - Alterar valor");
            System.out.println(" 4 - Excluir valor");
            System.out.println(" 5 - Mostrar valores");
            System.out.println(" 6 - Ordenar valores");
            System.out.println(" 7 - Inverter valores");
            System.out.println(" 8 - Sair do sistema");

            opcao = teclado.nextInt();
            System.out.println("Opção digitada: " + opcao);
            switch (opcao) {
                case 1:

                    posicao = incluirValor(vet, posicao, teclado);

                    break;

                case 2:

                    pesquisarValor(vet, teclado);

                    break;

                case 3:

                    alterarValor(vet, teclado);

                    break;

                case 4:

                    excluirValor(vet, teclado, posicao);

                    break;

                case 5:

                    mostrarValor(vet, teclado, posicao);

                    break;

                case 6:


                    break;

                case 7:

                    inverterValor(vet, posicao, teclado);

                    break;

                case 8:


                    break;

            }
        } while (opcao != 8);

    }

    private void inverterValor(int[] vet, int posicao, Scanner teclado) {
        int temp = 0;
        int posFim = 0;
        for (int i = 0; i < posFim; i++) {
            for (int j = 0; j < i; j++) {
                temp = vet[i];
                vet[i] = vet[j];
                vet[j] = temp;
            }
        }

    }

    private void mostrarValor(int[] vet, Scanner teclado, int posicao) {
        for (int i = 0; i < posicao; i++) {
            System.out.println(vet[i]);
        }
    }

    private void excluirValor(int[] vet, Scanner teclado, int posicao) {
        int indice = pesquisarValor(vet, teclado);
        if (indice >= 0) {
            for (int i = indice; i < (posicao - 1); i++) {
                vet[i] = vet[i + 1];
            }
        }

    }

    private void alterarValor(int[] vet, Scanner teclado) {
        // Saber se o número existe no vetor
        int indice = pesquisarValor(vet, teclado);
        if (indice >= 0) {
            // se existir alterar o valor no vetor
            System.out.println("Digite um novo numero");
            int novoNumero = teclado.nextInt();
            vet[indice] = novoNumero;
            System.out.println("Atualizado");
        }
        // se não existir, informar que o número não existe

    }

    private int pesquisarValor(int[] vet, Scanner teclado) {
        int numeroDigitado = teclado.nextInt();
        for (int i = 0; i < vet.length; i++) {
            if (vet[i] == numeroDigitado) {
                System.out.println("Valor " + numeroDigitado);
                return i;
            }
        }
        System.out.println("Número digitado não encontrado");
        return -1;

    }

    private int incluirValor(int[] vet, int posicao, Scanner teclado) {
        System.out.println("Digite um número");
        int numero = teclado.nextInt();

        if (posicao < vet.length) {
            vet[posicao] = numero;
            System.err.println("Número " + numero + " incluido na posicao vet[" + posicao + "]");
        } else {
            System.err.println("Vetor cheio");
        }

        return posicao + 1;

    }

    public static void main(String[] args) {

        new Uni6Exe10PROF();

    }
}