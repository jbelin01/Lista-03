package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.PessoaCaract;

public class Ex23 {
    
    public void executar() {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o nome da pessoa:");
        String nome = leitor.nextLine();

        System.out.println("Digite o sexo da pessoa (M/F):");
        String sexo = leitor.nextLine();

        System.out.println("Digite a altura da pessoa:");
        double altura = leitor.nextDouble();

        System.out.println("Digite a idade da pessoa:");
        int idade = leitor.nextInt();

        PessoaCaract pessoa = new PessoaCaract(nome, sexo, altura, idade);

        double pesoIdeal = calcularPesoIdeal(pessoa);

        System.out.println("Nome da pessoa: " + pessoa.getNome());
        System.out.println("Peso ideal: " + pesoIdeal);

        leitor.close();
    }

    private double calcularPesoIdeal(PessoaCaract pessoa) {
        double pesoIdeal = 0;

        if (pessoa.getSexo().equalsIgnoreCase("M")) {
            if (pessoa.getAltura() > 1.70) {
                if (pessoa.getIdade() <= 20)
                    pesoIdeal = (72.7 * pessoa.getAltura()) - 58;
                else if (pessoa.getIdade() >= 21 && pessoa.getIdade() <= 39)
                    pesoIdeal = (72.7 * pessoa.getAltura()) - 53;
                else
                    pesoIdeal = (72.7 * pessoa.getAltura()) - 45;
            } else {
                if (pessoa.getIdade() <= 40)
                    pesoIdeal = (72.7 * pessoa.getAltura()) - 50;
                else
                    pesoIdeal = (72.7 * pessoa.getAltura()) - 58;
            }
        } else if (pessoa.getSexo().equalsIgnoreCase("F")) {
            if (pessoa.getAltura() > 1.50) {
                if (pessoa.getIdade() >= 35)
                    pesoIdeal = (62.1 * pessoa.getAltura()) - 45;
                else
                    pesoIdeal = (62.1 * pessoa.getAltura()) - 44.7;
            } else {
                if (pessoa.getIdade() < 35)
                    pesoIdeal = (62.1 * pessoa.getAltura()) - 49;
                else
                    pesoIdeal = (62.1 * pessoa.getAltura()) - 45;
            }
        }

        return pesoIdeal;
    }
}