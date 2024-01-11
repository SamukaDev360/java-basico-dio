public class Operadores {
    public static void main(String[] args) {
        // concatenação de strings com operador soma +
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        // concatenação de string com tipo numerico:
        String concatenacao ="?";
        // a opartir do momento que o programa percebe-se que tem uma string ele para de realizar a soma.
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);
        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);
        // aqui definimos uma ordem de precedencia fazendo primeiro a soma dos numeros e depois a concatenação resultando em 13 o resultado
        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
    }
}
