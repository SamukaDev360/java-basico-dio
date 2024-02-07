public class ResultadoEscolarb {
    public static void main(String[] args) {
        // declarando variavel nota
        int nota = 10;

        // exemplo de estrutura condicional encadeada com mais de duas possibilidade em nosso programa - Utilização do else-if
        if (nota >= 8)  { // retorna true
            System.out.println("Aprovado!");
        } else if (nota >= 5 && nota < 7) { // retorna true ou false
            System.out.println("Recuperação!");
        } else {
            System.out.println("Reprovado!");
        }


    }
}
