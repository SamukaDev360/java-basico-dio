import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
      // iniciando variavel mesada do Joaozinho
      double mesada = 50.0;

      // Enquanto a variavel mesada for maior que zero eu quero que rode minha estrutura while
      while (mesada > 0) {
          // Aqui iniciando a variavel recebendo valores de forma aleatoria que representara o valor dos doces
          double valorDoce = valorAleatorio();

          // Em nosso codigo chegara um momento que nosso valor aleatorio ira gerar um valor maior que o restante de nossa mesada
          if (valorDoce > mesada){
              valorDoce = mesada;
          }
          System.out.println("Doce do valor: " + valorDoce + " Adicionado no carrinho");
          mesada = mesada - valorDoce;

      }
        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces");


    }
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
}
