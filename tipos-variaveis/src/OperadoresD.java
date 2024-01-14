public class OperadoresD {
    public static void main(String[] args) {
        String nomeUm = "SAMUEL";
        String nomeDois = "SAMUEL";

        System.out.println(nomeUm == nomeDois);


        int numeroUm = 1;
        int numeroDois = 2;

        // compara se são iguais
        boolean simNao = numeroUm == numeroDois;
        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        // compara se sao diferentes
        simNao = numeroUm != numeroDois;
        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        // compara se numero 1 é maior que o numero 2
        simNao = numeroUm > numeroDois;
        System.out.println("numeroUm é maior que numeroDois? " + simNao);


    }
}
