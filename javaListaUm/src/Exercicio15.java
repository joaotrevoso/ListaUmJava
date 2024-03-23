import java.util.Scanner;

public class Exercicio15 {

    public static void DistanciaMedia(){

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe o valor da cordenada 1: ");
        double x1 = scanner.nextDouble();

        System.out.printf("\nInforme o valor da cordenada 2: ");
        double x2= scanner.nextDouble();

        System.out.printf("\nInforme o valor da cordenada 3: ");
        double y1= scanner.nextDouble();

        System.out.printf("\nInforme o valor da cordenada 4: ");
        double y2= scanner.nextDouble();

        double formula = Math.sqrt(((x2 - x1)* (x2 - x1)) + ((y2 - y1) * (y2 - y1)));

        System.out.println("\nValor da distancia media : " + formula);

        scanner.close();

    }

}
