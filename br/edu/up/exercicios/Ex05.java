package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Prestacao;

public class Ex05 {

    public void executar(){
        Prestacao prestacao = new Prestacao();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor da compra: R$");
        prestacao.setCompra(leitor.nextDouble());

        System.out.println("O valor parcelado em 5 vezes de: R$" + prestacao.valorParcela(prestacao.getCompra()));

        leitor.close();
        
    }
    
    
    
}
