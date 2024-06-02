import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);

        System.out.println("Por favor digite o seu nome: ");
          String nome = scanner.next();

        System.out.println("Por favor digite seu sobre nome: ");
          String sobrenome = scanner.next();

        System.out.println("Por favor digite o número da conta: ");
          int numero = scanner.nextInt();

        System.out.println("Por favor digite sua agência: ");
          String agencia = scanner.next();

        System.out.println("Por favor nos informe seu saldo: ");
          double saldo = scanner.nextDouble();

          System.out.println("Olá "+nome+" "+sobrenome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já esta disponível para saque.");
          

}
}
