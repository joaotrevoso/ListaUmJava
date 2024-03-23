import java.util.Scanner;

public class Exercicio9 {

    public static void IsDiferenteOuMaior(){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe valor de A:");
        int A = scanner.nextInt();

        System.out.println();

        System.out.printf("Informe valor de B: ");
        int B = scanner.nextInt();

        if(A == B){

            System.out.println("Numeros iguais");

        }else{

            System.out.println("Numeros diferentes");

            System.out.println(A > B ? "Variavel A maior" : "Variavel B maior");

        }

        scanner.close();

    }

}
