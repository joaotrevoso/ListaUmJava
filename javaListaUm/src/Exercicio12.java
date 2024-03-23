import java.util.Scanner;

public class Exercicio12 {

    public static void ShowMes(){


        String meses[] = {"janeiro","fevereiro","marco","abril","maio","junho","julho"
    ,"agosto","setembro","outubro","novembro","dezembro"};

        Scanner scanner = new Scanner(System.in);

        int mes = scanner.nextInt();

        if(mes > 12 || mes < 0){

            System.out.println("Mes invalido");

        }else{

        System.out.println("Mes : " + meses[mes - 1]);
    }

    scanner.close();

    }

}
