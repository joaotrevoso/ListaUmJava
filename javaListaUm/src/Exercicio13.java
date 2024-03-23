import java.util.Scanner;

public class Exercicio13 {

    public static void OperadorAritimeticoValido(){

    Scanner scanner =  new Scanner(System.in);
    
    int A = scanner.nextInt();

    int B = scanner.nextInt();

    scanner.nextLine();

    String operador = scanner.nextLine();

    if(operador.equals("+")){

        System.out.printf("Soma :  %d ", A + B);
        
    }else if(operador.equals("-")){

        System.out.printf("Subtracao :  %d ", A - B);

    }else if(operador.equals("*")){

        System.out.printf("Multiplicacao :  %d ", A * B);

    }else if(operador.equals("/")){

        if(A != 0 && B != 0){
        System.out.printf("Divisao :  %d ", A / B);
    }
    else{
    
        System.out.println("Divisao por zeros");
    
    }
    }else{

        System.out.println("Operador invalido");

    }

    scanner.close();

    }

}
