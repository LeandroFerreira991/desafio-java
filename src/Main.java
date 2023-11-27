import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String nome = "Leandro Ferreira";
        String tipoConta = "Conta corrente";
        double saldo = 1599.99;

        System.out.println("****************************");
        System.out.println("\nNome do cliente: "+ nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual:" + saldo);
        System.out.println("\n****************************");

        int opcao = 0;
        String menu = """
                ** Digite sua opção **
                1- Consultar saldo
                2-Transferir valor
                3- Receber Valor
                4-Sair
                
                """;

        Scanner leitura = new Scanner(System.in);


        while (opcao != 4){
            System.out.println(menu);
            opcao = leitura.nextInt();

            if (opcao == 1){
                System.out.println("O saldo atualizado é: " + saldo);
            } else if (opcao == 2 ) {
                double valor = leitura.nextDouble();
                if ( valor > saldo ){
                    System.out.println("Não Saldo para realizar transferência");
                }else  {
                    saldo -=  valor;
                    System.out.println("Saldo atualizado : " + saldo);
                }
            } else if ( opcao == 3) {
                System.out.println("Valor recebido:");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Saldo atualizado : " + saldo);
            } else if (opcao != 4){
                System.out.println("Opção invalida");
            }
        }
    }
}
