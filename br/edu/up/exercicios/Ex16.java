package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Funcionario;

public class Ex16 {
    public void executar() {
        Scanner scanner = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[584];

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Digite o nome do funcionário " + (i + 1) + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade do funcionário " + (i + 1) + ":");
            int idade = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o sexo do funcionário " + (i + 1) + " (M/F):");
            char sexo = scanner.next().charAt(0);

            System.out.println("Digite o salário do funcionário " + (i + 1) + ":");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            funcionarios[i] = new Funcionario(nome, idade, sexo, salario);
        }

        for (Funcionario funcionario : funcionarios) {
            double salarioLiquido = funcionario.calcularSalarioLiquido();
            double abono = funcionario.calcularAbono();

            System.out.println("Nome do funcionário: " + funcionario.getNome());
            System.out.println("Salário líquido: " + salarioLiquido);
            System.out.println("Abono: " + abono);
        }

        scanner.close();
    }
}