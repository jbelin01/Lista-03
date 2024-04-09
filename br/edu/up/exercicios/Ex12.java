package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Carango;

public class Ex12 {

    public void executar() {
        Scanner leitor = new Scanner(System.in);
        int totalAte2000 = 0;
        int totalGeral = 0;

        while (true) {
            Carango carango = new Carango();

            System.out.println("Digite o ano do veículo: ");
            int ano = leitor.nextInt();
            carango.setAno(ano);

            double desconto;
            if (carango.getAno() <= 2000) {
                desconto = 0.12;
                totalAte2000++;
            } else {
                desconto = 0.07;
            }

            double preco = 20000; // Preço base do veículo
            double valorDesconto = preco * desconto;
            double valorFinal = preco - valorDesconto;

            System.out.println("Valor do desconto: " + valorDesconto);
            System.out.println("Valor a ser pago: " + valorFinal);

            totalGeral++;

            System.out.println("Deseja continuar calculando desconto? (S/N)");
            String continuar = leitor.next();
            if (!continuar.equalsIgnoreCase("S")) {
                break;
            }
        }
        System.out.println("Total de carros com ano até 2000: " + totalAte2000);
        System.out.println("Total geral de carros: " + totalGeral);

        leitor.close();
    }
    
}
