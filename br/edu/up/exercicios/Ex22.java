package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.ContaLuz;

public class Ex22 {
    public void executar() {
        Scanner leitor = new Scanner(System.in);
        ContaLuz contaLuz = new ContaLuz();

        System.out.println("Informe a idade do nadador:");
        int idade = leitor.nextInt();

        String categoria = calcularCategoria(idade);

        if (categoria.equals("Fora da faixa etária")) {
            System.out.println("Idade fora da faixa etária.");
        } else {
            System.out.println("Categoria do nadador: " + categoria);
        }

        leitor.close();
    }
    private String calcularCategoria(int idade) {
        if (idade >= 5 && idade <= 7) {
            return "Infantil A";
        } else if (idade >= 8 && idade <= 10) {
            return "Infantil B";
        } else if (idade >= 11 && idade <= 13) {
            return "Juvenil A";
        } else if (idade >= 14 && idade <= 17) {
            return "Juvenil B";
        } else if (idade >= 18 && idade <= 25) {
            return "Sênior";
        } else {
            return "Fora da faixa etária";
        }
    }
}