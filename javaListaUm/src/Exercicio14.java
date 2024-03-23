import java.util.Scanner;

public class Exercicio14 {

    public static void ProgressaoAritimetica(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro termo (a1) da progressão aritmética:");
        int a1 = scanner.nextInt();

        System.out.println("Digite o valor de n (ordem do termo que deseja encontrar):");
        int n = scanner.nextInt();

        System.out.println("Digite a razão (r) da progressão aritmética:");
        int r = scanner.nextInt();


    int an = a1 + (n - 1) * r;

        System.out.println("O " + n + "-ésimo termo da progressão aritmética é: " + an);


    }

}
