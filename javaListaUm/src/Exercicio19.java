import java.util.Scanner;

public class Exercicio19 {

    public static void VolumeCilindo(){

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe o valor do raio do cilindo: ");
        double raio  = scanner.nextDouble();

        System.out.printf("Informe o valor da altura do cilindo: ");
        double altura  = scanner.nextDouble();

        double volume = 3.14 * Math.pow(raio, 2) * altura;

        System.out.println("Volume do cilindo : " + volume);

        scanner.close();

    }


}
