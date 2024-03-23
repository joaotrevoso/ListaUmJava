import java.util.Scanner;

public class Exercicio17 {

    public static void MediaPonderada(){

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe o valor da nota e seu peso: ");
        double nota1 = scanner.nextDouble();
        double peso1 = scanner.nextDouble();

        System.out.printf("\nInforme o valor da nota e seu peso: ");
        double nota2 = scanner.nextDouble();
        double peso2 = scanner.nextDouble();

        System.out.printf("\nInforme o valor da nota e seu peso: ");
        double nota3 = scanner.nextDouble();
        double peso3 = scanner.nextDouble();
    
        double mediafinal = (nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3) / (peso1 + peso2 + peso3);

        System.out.println("Valor da media final: " + mediafinal);

        scanner.close();

    }
}
