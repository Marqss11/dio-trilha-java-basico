import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){

        //Criando o objeto Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Input e Scanner para informação do número da conta.
        System.out.println("Informe o número da conta: ");
        int numero = scanner.nextInt();
        
        //Input e Scanner para informação do número da agência.
        System.out.println("\nInforme a agência: ");
        String agencia = scanner.next(); 

        // Scanner adicionado para ler a quebra de linha restante e limpar o buffer.
        scanner.nextLine();

        //Input e Scanner para informação do nome completo.
        System.out.println("\nInforme o nome completo: ");
        String nomeCompleto = scanner.nextLine().toUpperCase();

        //Input e Scanner para informação do saldo da conta.
        System.out.println("\nInforme o saldo da conta: ");
        Double saldo = scanner.nextDouble();

        //Imprimindo os dados do portador
        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco!\nSua agência é: %s\nConta: %d\nSeu saldo é de: R$%.2f.\nSaldo já disponivel para utilização!", nomeCompleto, agencia, numero, saldo);
        
    }
}
