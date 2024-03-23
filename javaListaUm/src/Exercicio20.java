import java.util.Scanner;

public class Exercicio20 {

    public static void LitrosPorViagem(){

    Scanner scanner = new Scanner(System.in);

   
        System.out.println("Digite o tempo da viagem em horas:");
        double tempoViagem = scanner.nextDouble();

        System.out.println("Digite a velocidade média da viagem em km/h:");
        double velocidadeMedia = scanner.nextDouble();

        // Calculando a distância total da viagem
        double distanciaTotal = tempoViagem * velocidadeMedia;

        // Calculando a quantidade de litros de combustível gasta na viagem (carro faz 12 km/l)
        double litrosConsumidos = distanciaTotal / 12.0;

        System.out.println("A quantidade de litros de combustível gasta na viagem é: " + litrosConsumidos + " litros");


    }
}
