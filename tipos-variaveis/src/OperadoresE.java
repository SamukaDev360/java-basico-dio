public class OperadoresE {
    public static void main(String[] args) {
        boolean condicao1 = true;
        boolean condicao2 = true;

        // Valida se as duas sao verdadeiras
        if (condicao1 && condicao2) {
            System.out.println("as duas condições sao verdadeiras");

        }

        // valida se apenas uma das duas sao verdadeiras
        if (condicao1 || condicao2) {
            System.out.println("uma das condiçoes é veradeira");
        }

        System.out.println("fim");
    }
}
