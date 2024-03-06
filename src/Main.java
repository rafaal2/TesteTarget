import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
  --------------------------    questao 1------------------------------------------------------------------------------
//        1) Observe o trecho de código abaixo:
//
//        int INDICE = 13;
//        int SOMA = 0;
//        int K = 0;
//
//        while (K < INDICE ) {
//            K = K + 1;
//
//            SOMA = SOMA + K;
//        }
//
//        System.out.println(SOMA);
//        reposta = 91

   ---------------------- questao 2 -------------------------------------------------------------------------------
//        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
//        int num = sc.nextInt();
//
//        if (verificarFibo(num)) {
//            System.out.println(num + " pertence à sequência de Fibonacci.");
//        } else {
//            System.out.println(num + " não pertence à sequência de Fibonacci.");
//        }
//    }
//
//    public static boolean verificarFibo(int num) {
//        int primeiro = 0;
//        int segundo = 1;
//
//        while (primeiro <= num) {
//            if (primeiro == num) {
//                return true;
//            }
//            int proximo = primeiro + segundo;
//            primeiro = segundo;
//            segundo = proximo;
//        }
//
//        return false;
//    }
   --------------------------- questão 3 -------------------------------------------------------------------------------
//        a)
//       int primeiro = 1;
//       int razao = 2;
//       for (int i = 0; i < 5; i++) {
//            System.out.print(primeiro + ", ");
//            primeiro += razao;
//        } RESPOSTA = 9

//        B)
//            int primeiro = 2;
//            for (int i = 0; i < 6; i++) {
//                System.out.print(primeiro + ", ");
//                primeiro *= 2;
//            }
//         RESPOSTA = 128

//        C)
//            for (int i = 0; i < 7; i++) {
//                int num = i * i;
//                System.out.print(num + ", ");
//            }RESPOSTA = 100
//        D)
//            for (int i = 2; i <= 8; i += 2) {
//                int numero = i * i;
//                System.out.print(numero + ", ");
//            }RESPOSTA = 49
        //E)
//        int i = 1;
//        int n = 10;
//        int primeiro = 0, segundo = 1;
//        while (i <= n) {
//            System.out.print(primeiro + ", ");
//
//            int nextTerm = primeiro + segundo;
//            primeiro = segundo;
//            segundo = nextTerm;
//
//            i++;
//        } Resposta = 13
//f) Resposta = 200
--------------------------- questão 4 -------------------------------------------------------------------------------

// eu ligaria um dos interruptores por um tempo e entraria na sala,a lampada que estivesse quente seria ele, e anotaria
// na segunda visita faria o mesmo mais ligando outro interruptor e anotaria a segunda lampada quente
// a lampada fria seria o ultimo dos interruptores

--------------------------- questão 5 -------------------------------------------------------------------------------

//        String texto = "Target";
//        System.out.println("String original: " + texto);
//
//        String invertida = inverterString(texto);
//        System.out.println("String invertida: " + invertida);
//
//    }
//    public static String inverterString(String texto) {
//        List<Character> caracteres = new ArrayList<>();
//
//        for (int i = texto.length() - 1; i >= 0; i--) {
//            caracteres.add(texto.charAt(i));
//        }
//        StringBuilder resultado = new StringBuilder(caracteres.size());
//        for (char c : caracteres) {
//            resultado.append(c);
//        }
//        return resultado.toString();
//    }}
