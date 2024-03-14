import java.util.Scanner;

public class Exercicio3 {

    public static void MaiorVariavel() {
        
        Scanner scanner = new Scanner(System.in);

        int A;

        int B;

        System.out.printf("Digite o valor de A:");

            A = scanner.nextInt();

        System.out.println();

        System.out.printf("Digite o valor de B:");

            B = scanner.nextInt();

        while(A == B){

            System.out.println("Numero invalido escreva outro: ");

            System.out.printf("Digite o valor de A:");

            A = scanner.nextInt();

        System.out.println();

        System.out.printf("Digite o valor de B:");

            B = scanner.nextInt();


        }
         
        if(A > B){

            System.out.println("Variavel A maior");

        }else{

            System.out.println("Variavel B maior");

        }

        scanner.close();

    }

}
