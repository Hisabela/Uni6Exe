import java.util.Scanner;

public class Uni6Exe5 {

    /* ind é indiferente - Com o objetivo de determinar o índice de afinidade entre um rapaz e uma moça cada um respondeu um questionário com 5 perguntas, como por exemplo:

    Gosta de música sertaneja?
    Gosta de futebol?
    Gosta de seriados?
    Gosta de redes sociais?
    Gosta da Oktoberfest?
    A resposta a cada pergunta pode ser: SIM, NÃO ou IND (indiferente). O índice de afinidade é medido da seguinte maneira:
    
    se ambos deram a mesma resposta soma-se 3 pontos ao índice;
    se um respondeu IND e o outro SIM ou NÃO soma-se 1;
    se um respondeu SIM e o outro NÃO subtrai-se 2 ao índice.
    Crie um vetor para armazenar as respostas do rapaz e outro para armazenar as respostas da moça. Crie um método que possa ler tanto as respostas do rapaz como da moça, e outro para calcular e retornar a afinidade. Por fim, escreva a afinidade considerando os seguintes intervalos:
    
    Afinidade	Mensagem
    15	“Casem!
    10 a 14	“Vocês têm muita coisa em comum!”
    5 a 9	“Talvez não dê certo :(”
    0 a 4	“Vale um encontro.”
    -1 a -9	“Melhor não perder tempo”
    -10	“Vocês se odeiam!” */
    


    public static void main(String[] args) {
        String[] r1 = new String[5];
        String[] r2 = new String[5];
        String[] perguntas = {
            "Gosta de música sertaneja?",
            "Gosta de futebol?",
            "Gosta de seriados?",
            "Gosta de redes sociais?",
            "Gosta da Oktoberfest?"
        };

        lerRespostas("rapaz", perguntas, r1);
        lerRespostas("moça", perguntas, r2);

        int afinidade = calcularAfinidade(r1, r2);
        mostrarMensagem(afinidade);
    }

    static void lerRespostas(String pessoa, String[] perguntas, String[] respostas) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Respostas do " + pessoa + ":");
        for (int i = 0; i < perguntas.length; i++) {
            System.out.print(perguntas[i] + " ");
            respostas[i] = sc.next().toUpperCase();
        }
    }

    static int calcularAfinidade(String[] r1, String[] r2) {
        int pontos = 0;
        for (int i = 0; i < r1.length; i++) {
            if (r1[i].equals(r2[i])) pontos += 3;
            else if ((r1[i].equals("IND") && !r2[i].equals("IND")) || (r2[i].equals("IND") && !r1[i].equals("IND")))
                pontos += 1;
            else if ((r1[i].equals("SIM") && r2[i].equals("NÃO")) || (r1[i].equals("NÃO") && r2[i].equals("SIM")))
                pontos -= 2;
        }
        return pontos;
    }

    static void mostrarMensagem(int p) {
        System.out.println("Afinidade: " + p);
        if (p == 15) System.out.println("Casem!");
        else if (p >= 10) System.out.println("Vocês têm muita coisa em comum!");
        else if (p >= 5) System.out.println("Talvez não dê certo :(");
        else if (p >= 0) System.out.println("Vale um encontro.");
        else if (p >= -9) System.out.println("Melhor não perder tempo");
        else System.out.println("Vocês se odeiam!");
    }
}