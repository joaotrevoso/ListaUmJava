import java.util.Scanner;

public class Exercicio1 {
   
    public static void MenorOuIgualADez(){
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Informe o numero: ");
        int num = scanner.nextInt();

        if(num <= 10){

            System.out.println("Numero menor ou igual a dez");

        }else{

            System.out.println("Numero maior que dez");

        }

        scanner.close();
    
    }
}
