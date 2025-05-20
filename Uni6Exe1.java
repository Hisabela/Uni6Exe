import java.util.Scanner;

public class Uni6Exe1 {

    //Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor de 10 posições do tipo inteiro. Escreva na ordem inversa em que foram lidos. Faça um método para ler e outro para escrever.

    public static void main(String[] args) {
        int[] numeros = new int[10];

        lerNumeros(numeros);
        escreverInverso(numeros);
    }

    // Método para ler os números e armazenar no vetor
    public static void lerNumeros(int[] vetor) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = scanner.nextInt();
        }
        scanner.close();
    }

    // Método para escrever os números na ordem inversa
    public static void escreverInverso(int[] vetor) {
        System.out.println("\nNúmeros na ordem inversa:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}