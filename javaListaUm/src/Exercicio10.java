import java.util.Scanner;

public class Exercicio10 {

    public static void LerNumEscreverPorExtenso(){

        String vet[] = {"um","dois","tres","quatro","cinco"};

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Infomer o numero: ");
        int num = scanner.nextInt();

        System.out.println();

        System.out.println(vet[num - 1]);

        scanner.close();

    }

}
