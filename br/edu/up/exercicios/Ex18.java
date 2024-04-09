package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Funcionario;

public class Ex18 {

    public void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nome = scanner.nextLine();

        System.out.println("Digite a idade do funcionário:");
        int idade = scanner.nextInt();

        System.out.println("Digite o sexo do funcionário (M/F):");
        char sexo = scanner.next().charAt(0);

        System.out.println("Digite o salário do funcionário:");
        double salario = scanner.nextDouble();

        Funcionario funcionario = new Funcionario(nome, idade, sexo, salario);

        double salarioLiquido = funcionario.calcularSalarioLiquido();
        double abono = funcionario.calcularAbono();

        System.out.println("Nome do funcionário: " + funcionario.getNome());
        System.out.println("Salário líquido: " + salarioLiquido);
        System.out.println("Abono: " + abono);

        scanner.close();
    }
}