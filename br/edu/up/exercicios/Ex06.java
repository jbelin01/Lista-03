package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Venda;

public class Ex06 {
    public void executar(){
        
        Venda venda = new Venda();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o preço de custo do produto: ");
        venda.setCusto(leitor.nextDouble());

        System.out.println("Digite o percentual que terá de acréscimo:  ");
        venda.setAcrescimo(leitor.nextDouble());

        System.out.println("O valor de venda é: " + venda.valorVenda(venda.getCusto(), venda.getAcrescimo()));

        leitor.close();
        
    }
}
