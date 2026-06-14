public class Main {
  public static void main(String[] args) {
    if (args.length == 0) {
        System.out.println("Informe o texto via argumentos");
        return;
    }

    int qvogais = 0, pares = 0, impares = 0;
    String vogais = "aeiouAEIOU";

    for (String palavra : args) {
        for (int i = 0; i < palavra.length(); i++) {
            if (vogais.indexOf(palavra.charAt(i)) != -1) {
                qvogais++;
            }
        }

        if (palavra.length() % 2 == 0) {
            pares++;
        } else {
            impares++;
        }
    }

    System.out.printf("Quantidade de palavras: %d\n", args.length);
    System.out.printf("Quantidade de vogais: %d\n", qvogais);
    System.out.printf("Palavras com letras pares: %d\n", pares);
    System.out.printf("Palavras com letras ímpares: %d\n", impares);
  }
} 