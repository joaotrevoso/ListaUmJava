import java.util.Scanner;

public class Exercicio4 {

    public static void CalculosNumeros() {
        
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe o primero numero: ");
        int um = scanner.nextInt();

        System.out.println();

        System.out.printf("Informe o segundo numero: ");
        int dois = scanner.nextInt();


        System.out.printf("Soma dos valores: %d \n ",um + dois);

        System.out.printf("Subtracao dos valores: %d \n ",um - dois);

        System.out.printf("Multiplicacao dos valores: %d \n ",um * dois);

        System.out.printf("Divisao dos valores: %d \n ",um / dois);
        
        scanner.close();
    }

}
