import java.util.Scanner;

public class ContaTerminal {
    public int numero;
    public String agencia;
    public String nomeCliente;
    double saldo;
    double resultado;
    public static void main(String[] args) throws Exception {
        
    
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o número da agência: ");
        String agencia = scanner.nextLine();

        System.out.print("Digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        System.out.println("\n Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + ", e seu saldo é R$" + saldo);


        scanner.close();
    }
}
    