// Invocar classe Scanner
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número de sua conta: ");
        int numeroConta = scanner.nextInt();

        //Inserir os dados do cliente

        System.out.println("Por favor, digite o número da Agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.next();
        
        System.out.println("Por favor, digite seu sobrenome: ");
        String sobrenomeCliente = scanner.next();

        double saldo = 237.48;
    
        //Exibir a mensagen para o usuário

        System.out.println("Olá " + nomeCliente +" " + sobrenomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta: " + numeroConta + " e seu saldo: " + saldo + " já está disponível para saque.");

    }
}
