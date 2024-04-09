package br.edu.up.exercicios;
import java.util.Scanner;

public class Ex17 {

    public void executar() {
        Scanner leitor = new Scanner(System.in);

        
        System.out.println("Digite o número de funcionários:");
        int numFuncionarios = leitor.nextInt();
        System.out.println("Digite o valor do salário mínimo:");
        Double salarioMinimo = leitor.nextDouble();
        leitor.nextLine();

        Double aumentoTotal = 0.0;

        
        for (int i = 1; i <= numFuncionarios; i++) {
            System.out.println("Funcionário " + i + ":");
            System.out.println("Digite o nome do funcionário:");
            String nome = leitor.nextLine();
            System.out.println("Digite o salário do funcionário:");
            Double salario = leitor.nextDouble();
            leitor.nextLine();

            
            Double novoSalario = calcularNovoSalario(salario, salarioMinimo);

            
            aumentoTotal += novoSalario - salario;

            
            System.out.println("Nome: " + nome);
            System.out.println("Novo salário: " + novoSalario);
            
        }

        
        System.out.println("Aumento total na folha de pagamento: " + aumentoTotal);

        leitor.close();
    }

   
    private Double calcularNovoSalario(Double salario, Double salarioMinimo) {
        if (salario < 3 * salarioMinimo) {
            return salario * 1.5; 
        } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
            return salario * 1.2; 
        } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
            return salario * 1.15; 
        } else {
            return salario * 1.1; 
        }
    }
}