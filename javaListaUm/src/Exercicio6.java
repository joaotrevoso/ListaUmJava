import java.util.Scanner;

public class Exercicio6 {

    public static void CelsiusToFahrenheit() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe a temperatura em Celsius: ");
        float celsius = scanner.nextFloat();

        float faren = (9 * celsius + 160) / 5;

        System.out.println("Temperatura em Fahrenheit " + faren);

        scanner.close();

    }

}
