package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Nadador;

public class Ex21 {
    
    public void executar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade do nadador:");
        int idade = scanner.nextInt();

        Nadador nadador = new Nadador(idade);
        String categoria = nadador.classificarNadador();

        System.out.println("O nadador está na categoria: " + categoria);

        scanner.close();
    }
}