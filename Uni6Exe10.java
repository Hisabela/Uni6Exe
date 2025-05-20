import java.util.Scanner;

public class Uni6Exe10 {
    // capacidade máxima do vetor
    private static final int CAP = 50;

    // o vetor propriamente dito e a quantidade de posições usadas
    private static int[] vet = new int[CAP];
    private static int qtd = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            mostrarMenu();
            opc = sc.nextInt();
            switch (opc) {
                case 1: incluirValor(sc); break;
                case 2: pesquisarValor(sc);break;
                case 3: alterarValor(sc);break;
                case 4: excluirValor(sc);break;
                case 5 : mostrarValores();break;
                case 6 : ordenarValores();break;
                case 7 : valoresInversor();  break;    // “desafio”
                case 8: System.out.println("Fim do programa."); break;
                default : System.out.println("Opção inválida!");
            }
        } while (opc != 8);

        sc.close();
    }

    // ----------------------------  MÉTODOS  ----------------------------

    private static void mostrarMenu() {
        System.out.println("\n---------------- MENU ----------------");
        System.out.println("1 – Incluir valor");
        System.out.println("2 – Pesquisar valor");
        System.out.println("3 – Alterar valor");
        System.out.println("4 – Excluir valor");
        System.out.println("5 – Mostrar valores");
        System.out.println("6 – Ordenar valores");
        System.out.println("7 – Valores do inversor (desafio)");
        System.out.println("8 – Sair do sistema");
        System.out.print("Escolha uma opção: ");
    }

    // 1 – Incluir valor
    private static void incluirValor(Scanner sc) {
        if (qtd == CAP) {
            System.out.println("Vetor cheio! Não é possível incluir mais valores.");
            return;
        }
        System.out.print("Digite o valor a ser incluído: ");
        int v = sc.nextInt();
        vet[qtd] = v;
        qtd++;
        System.out.println("Valor incluído com sucesso!");
    }

    // 2 – Pesquisar valor
    private static void pesquisarValor(Scanner sc) {
        System.out.print("Valor a pesquisar: ");
        int alvo = sc.nextInt();
        for (int i = 0; i < qtd; i++) {
            if (vet[i] == alvo) {
                System.out.println("Valor encontrado na posição " + i + ".");
                return;
            }
        }
        System.out.println("Valor NÃO encontrado.");
    }

    // 3 – Alterar valor (primeira ocorrência)
    private static void alterarValor(Scanner sc) {
        System.out.print("Número a ser alterado: ");
        int velho = sc.nextInt();
        System.out.print("Novo número: ");
        int novo = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            if (vet[i] == velho) {
                vet[i] = novo;
                System.out.println("Valor alterado com sucesso.");
                return;
            }
        }
        System.out.println("Número não encontrado.");
    }

    // 4 – Excluir valor (primeira ocorrência)
    private static void excluirValor(Scanner sc) {
        System.out.print("Valor a excluir: ");
        int alvo = sc.nextInt();

        for (int i = 0; i < qtd; i++) {
            if (vet[i] == alvo) {
                // “puxar” elementos para a esquerda
                for (int j = i; j < qtd - 1; j++) {
                    vet[j] = vet[j + 1];
                }
                qtd--;
                System.out.println("Valor excluído com sucesso.");
                return;
            }
        }
        System.out.println("Valor não encontrado. Nada foi excluído.");
    }

    // 5 – Mostrar valores
    private static void mostrarValores() {
        if (qtd == 0) {
            System.out.println("Vetor vazio.");
            return;
        }
        System.out.print("Valores armazenados: ");
        for (int i = 0; i < qtd; i++) {
            System.out.print(vet[i] + (i < qtd - 1 ? ", " : ""));
        }
        System.out.println();
    }

    // 6 – Ordenar valores (Bubble-Sort)
    private static void ordenarValores() {
        if (qtd < 2) {
            System.out.println("Poucos elementos: já está ordenado.");
            return;
        }
        boolean houveTroca;
        do {
            houveTroca = false;
            for (int i = 0; i < qtd - 1; i++) {
                if (vet[i] > vet[i + 1]) {
                    int tmp = vet[i];
                    vet[i] = vet[i + 1];
                    vet[i + 1] = tmp;
                    houveTroca = true;
                }
            }
        } while (houveTroca);
        System.out.println("Valores ordenados em ordem crescente.");
    }

    // 7 – “Valores do inversor” — aqui mostramos o vetor na ordem inversa
    private static void valoresInversor() {
        if (qtd == 0) {
            System.out.println("Vetor vazio.");
            return;
        }
        System.out.print("Vetor invertido: ");
        for (int i = qtd - 1; i >= 0; i--) {
            System.out.print(vet[i] + (i > 0 ? ", " : ""));
        }
        System.out.println();
    }
}
