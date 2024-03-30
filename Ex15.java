import java.util.Scanner;

public class Ex15 {

    public void executar() {
        Scanner scanner = new Scanner(System.in);

        double totalDesconto = 0;
        double totalPago = 0;

        while (true) {
            System.out.println("Digite o valor do veículo (digite 0 para encerrar): ");
            double valorVeiculo = scanner.nextDouble();

            if (valorVeiculo == 0) {
                break; 
            }

            scanner.nextLine(); 

            System.out.println("Digite o tipo de combustível (álcool, gasolina ou diesel): ");
            String combustivel = scanner.nextLine();

            Veiculo veiculo = new Veiculo(valorVeiculo, combustivel);

            double desconto;
            if (combustivel.equalsIgnoreCase("álcool")) {
                desconto = valorVeiculo * 0.25; 
            } else if (combustivel.equalsIgnoreCase("gasolina")) {
                desconto = valorVeiculo * 0.21; 
            } else if (combustivel.equalsIgnoreCase("diesel")) {
                desconto = valorVeiculo * 0.14; 
            } else {
                System.out.println("Tipo de combustível inválido. Por favor, insira álcool, gasolina ou diesel.");
                continue; 
            }

            double valorPago = valorVeiculo - desconto;
            totalDesconto += desconto;
            totalPago += valorPago;

            System.out.println("Desconto: " + desconto);
            System.out.println("Valor a ser pago pelo cliente: " + valorPago);
        }

        System.out.println("Total de desconto: " + totalDesconto);
        System.out.println("Total pago pelos clientes: " + totalPago);

        scanner.close();
    }
}