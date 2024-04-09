package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Vendedor;

public class Ex03 {

     public void executar(){

        Vendedor vendedor = new Vendedor();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor: ");
        vendedor.setNome(leitor.nextLine());;

        System.out.println("Digite o salário fixo do mesmo: ");
        vendedor.setSalario(leitor.nextDouble());

        System.out.println("Digite a quantidade de vendas dele: ");
        vendedor.setVenda(leitor.nextInt());

        System.out.println("o vendedor "+ vendedor.getNome() +" ganha um salário fixo de : R$" + vendedor.getSalario());
        System.out.println("No final do mês ele receberá: R$" + vendedor.salarioFinal(vendedor.getSalario(), vendedor.getVenda() ));

        leitor.close();
     }
}