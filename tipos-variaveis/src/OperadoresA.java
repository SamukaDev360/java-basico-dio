public class OperadoresA {
    public static void main(String[] args) {
        int numero = 5;

        //Imprimindo o numero negativo
        System.out.println(-numero);

        //incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        //incrementando numero em mais 1 numero, imprime 7 - cuidado com a ordem de precedencia
        // se eu colocasse numero ++ não funcionaria.
        System.out.println(++numero);


    }
}
