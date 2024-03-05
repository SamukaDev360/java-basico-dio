import java.util.Scanner;

public class BolinhasDeSabao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int respostaMae; // variavel responsavel para armazenar a resposta da mae

        do {
            // Passo 1: Faça isso primeiro
            System.out.println("Faça uma bolinha de sabão!");

            // Passo 2: Enquanto uma condição for verdadeira
            System.out.println("Sua mãe chamou para o jantar? (Digite 1 para Sim, 0 para Não): ");
            respostaMae = scanner.nextInt();

            // Verificamos se a mãe chamou (respostaMae igual a 1)
        } while (respostaMae != 1); // Se a resposta for diferente de 1, continue fazendo bolinhas.

        // Quando a mãe chamar para o jantar (respostaMae igual a 1), paramos de fazer bolinhas.
        System.out.println("Hora de parar! Vamos jantar.");

        scanner.close(); // Fechamos o scanner para evitar vazamento de recursos.
    }
}
