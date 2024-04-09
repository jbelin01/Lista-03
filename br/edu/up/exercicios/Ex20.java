package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Professor;

public class Ex20 {
    
    public void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de horas trabalhadas:");
        int horasTrabalhadas = scanner.nextInt();

        System.out.println("Digite o nível do professor (1, 2 ou 3):");
        int nivel = scanner.nextInt();

        Professor professor = new Professor();
        professor.setHorasTrabalhadas(horasTrabalhadas);
        professor.setNivel(nivel);

        double salario = professor.calcularSalario();
        System.out.println("O salário do professor é: R$" + salario);

        scanner.close();
    }

    public static void main(String[] args) {
        Ex20 programa = new Ex20();
        programa.executar();
    }
}