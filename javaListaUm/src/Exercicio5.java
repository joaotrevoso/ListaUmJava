import java.util.Scanner;

public class Exercicio5 {

    public static void TrocaDeValores() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe o primero numero: ");
        int um = scanner.nextInt();

        System.out.println();

        System.out.printf("Informe o segundo numero: ");
        int dois = scanner.nextInt();

        int swap;

        System.out.printf("\nNumero um: %d Numero dois: %d \n",um,dois);

        swap = um;

        um = dois;

        dois = swap;

        System.out.printf("\nNumero um: %d Numero dois: %d \n",um,dois);

        scanner.close();

    }

}
