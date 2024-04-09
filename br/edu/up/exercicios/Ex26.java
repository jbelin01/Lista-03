package br.edu.up.exercicios;
import java.util.Scanner;

public class Ex26 {
    public void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do pretendente:");
        String nome = leitor.nextLine();

        System.out.println("Digite a idade do pretendente:");
        int idade = leitor.nextInt();

        System.out.println("Digite o grupo de risco do pretendente (1 para baixo, 2 para médio, 3 para alto):");
        int grupoRisco = leitor.nextInt();

        leitor.close();

        if (idade >= 17 && idade <= 70) {
            int categoria = calcularCategoria(idade, grupoRisco);
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Categoria: " + categoria);
        } else {
            System.out.println("O pretendente não se enquadra em nenhuma das categorias ofertadas.");
        }
    }

    private int calcularCategoria(int idade, int grupoRisco) {
        if (idade >= 17 && idade <= 20) {
            return grupoRisco;
        } else if (idade >= 21 && idade <= 24) {
            return grupoRisco + 1;
        } else if (idade >= 25 && idade <= 34) {
            return grupoRisco + 2;
        } else if (idade >= 35 && idade <= 64) {
            return grupoRisco + 3;
        } else {
            return grupoRisco + 6;
        }
    }
}