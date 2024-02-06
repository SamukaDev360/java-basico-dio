public class CaixaEletronico {
    public static void main(String[] args) {

        // declarando variaveis saldo e valor solicitado
        double saldo = 25.0;
        double valorSolicitado = 26;


      /* verificando se valor solicitado é menor que saldo, se for iremos realizar a operação dentro
         na nossa condicional descontando o valor se disponivel, caso nosso saldo for insuficiente ele ira mostrar apenas nosso saldo */
        if (valorSolicitado < saldo)
            saldo = saldo - valorSolicitado;


        System.out.println(saldo);


    }
}
