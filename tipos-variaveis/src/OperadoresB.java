public class OperadoresB {
    public static void main(String[] args) {
        int numeroExemploA = 5;
        int numeroExemploB = 5;

        //incremento em 1 + 1 metodo 1:
        numeroExemploA++;
        System.out.println(numeroExemploA);

        //incremento em 1 + 1 metodo 2:
        numeroExemploB = numeroExemploB + 1;
        System.out.println(numeroExemploB);

        // Operador unário logico de negação
        boolean verdadeiro = true;

        System.out.println("Valor original da variavel: " + verdadeiro);
        System.out.println("Inverteu: " + !verdadeiro);
    }
}
