import java.util.Scanner;

public class Exercicio2 {
    
    public static void SomaDosNumeros() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe o primeiro numero: ");
        int num1 = scanner.nextInt();

        System.out.printf("Informe o segundo numero: ");
        int num2 = scanner.nextInt();
            
        System.out.printf("Soma : %d ",num1 + num2);

        scanner.close();

    }

}
