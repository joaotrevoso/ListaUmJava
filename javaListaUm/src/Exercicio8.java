import java.util.Scanner;

public class Exercicio8 {

    public static void IsBiggerOrLowerThan50(){

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe o numero: ");
        int num = scanner.nextInt();

        if(num >= 50){

            System.out.println("Numero maior ou igual a 50");

        }else{

            System.out.println("Numero menor que 50");

        }

        scanner.close();

    }

}
