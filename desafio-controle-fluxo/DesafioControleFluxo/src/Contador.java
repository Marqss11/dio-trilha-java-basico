import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Informe o primeiro número:");
        int numeroum = scanner.nextInt();

        System.out.println("\nInforme o segundo número:");
        int numerodois = scanner.nextInt();

        try {
        System.out.println("\nContador:");
        Contar(numeroum, numerodois);
    
    } catch (ParametrosInvalidosException e) {
        System.out.println(e.getMessage());
    }
}

    static void Contar(int numeroum, int numerodois) throws ParametrosInvalidosException {
        if (numerodois <= numeroum) {
            throw new ParametrosInvalidosException("ERRO: O segundo número deve ser maior que o primeiro número!");
        }

        int contagem = numerodois - numeroum;
        for (int x = 1; x <= contagem;x++){
            System.out.println(x);
        }

    }
}
