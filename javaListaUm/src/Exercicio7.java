import java.util.Scanner;

public class Exercicio7 {

    public static void IsIn100And200(){

        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe o numero: ");
        int num = scanner.nextInt();

        if(num > 100 && num < 200){

            System.out.println("Numero esta entre 100 e 200");

        }else{

            System.out.println("Numero esta fora do intervalo");

        }

        scanner.close();

    }

}
