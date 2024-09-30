import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //TODO: CONHECER E IMPORTAR A CLASSE SCANNER
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número de sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = scanner.next();

        double saldo = 237.48;
    
        //TODO: Exibir a mensagen para o usuário

        System.out.println("Olá" + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta" + numeroConta + "e seu saldo: " + saldo + "já está disponível para saque");

        //Obter pela classe scanner os valores digitados e exibir a menssagem da conta criada
    }
}
