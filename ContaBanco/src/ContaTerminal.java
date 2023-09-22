import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        //TODO: Conhecer e importar a classe Scanner

        //Exibr as mensagens para o nosso usuário
        
        //Obter pelo Scanner os valores digitados pelo terminal

        //Exibir mensagem conta criada

        System.out.println("Por favor insira seu nome:");
        String nomeCliente = scan.nextLine();

        System.out.println("Digite o número da sua conta:");
        int numeroConta = scan.nextInt();

        System.out.println("Informe a sua agência:");
        String agencia = scan.next();

        System.out.println("Informe o seu saldo:");
        double saldo = scan.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +", Conta " + numeroConta + " e seu saldo é R$:" + saldo + "0" + " já está disponível para saque.");
    }
}
