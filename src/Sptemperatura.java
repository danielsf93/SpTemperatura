package sptemperatura;

import java.util.Scanner;

public class Sptemperatura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Exibir opções para o usuário
        System.out.println("Qual estação você gostaria de saber a temperatura atual?");
        System.out.println("01 - Estação 01");
        System.out.println("02 - Estação 02");
        System.out.println("03 - Estação 03");

        // Ler a entrada do usuário
        System.out.print("Digite o número da estação: ");
        String escolha = scanner.nextLine();

        // Mostrar a temperatura com base na escolha
        switch (escolha) {
            case "01":
                System.out.println("Temperatura da Estação 01: 10ºC");
                break;
            case "02":
                System.out.println("Temperatura da Estação 02: 20ºC");
                break;
            case "03":
                System.out.println("Temperatura da Estação 03: 30ºC");
                break;
            default:
                System.out.println("Escolha inválida. Por favor, selecione 01, 02 ou 03.");
                break;
        }
        
        scanner.close();
    }
}
