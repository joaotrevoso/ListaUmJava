import java.util.Scanner;

public class Exercicio16 {

    public static void MediaTresAlunos(){

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe o valor da nota: ");
        double nota1 = scanner.nextDouble();

        System.out.printf("Informe o valor da nota: ");
        double nota2 = scanner.nextDouble();
        
        System.out.printf("Informe o valor da nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Valor da media: " + media);

        scanner.close();


    }

}
