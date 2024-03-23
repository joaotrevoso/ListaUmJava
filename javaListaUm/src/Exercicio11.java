import java.util.Scanner;

public class Exercicio11 {

    public static void ValoresCrescente(){

        Scanner scanner = new Scanner(System.in);

        int um = scanner.nextInt();

        int dois = scanner.nextInt();

        int tres = scanner.nextInt();
        
        if(um > dois && um > tres){

            System.out.println(um);

            System.out.println(dois > tres ? dois + " " + tres : tres + " " + dois);


        }
        else if(dois > um && dois > tres){

            System.out.println(dois);

            System.out.println(tres > um ? tres  + " " + um : um + " " + tres);


        }else{

            System.out.println(tres);

            System.out.println(dois > um ? dois + " " + um : um + " " + dois);
            
            


        }                

        scanner.close();

    }

}   
