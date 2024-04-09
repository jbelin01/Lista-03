package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Preco;

public class Ex14 {

    public void executar(){
         

        Preco[] preco = new Preco[40];
        Scanner leitor = new Scanner(System.in);

        Double mediaC = 0.0;
        Double mediaV = 0.0;

        for (int i = 0; i < 40; i++){

            preco[i] = new Preco();

            System.out.println("Digite o preço de custo do produto " + (i + 1) + ":"); 
            preco[i].setCusto(leitor.nextDouble());


            System.out.println("Digite o preço de venda do produto " + (i + 1) + ":");
            preco[i].setVenda(leitor.nextDouble());

            mediaC = mediaC + preco[i].getCusto();
            mediaV = mediaV + preco[i].getVenda();

        }

        mediaC = mediaC/40;
        mediaV = mediaV/40;

        for ( int i = 0; i < 40; i++){

            if ( preco[i].getVenda() > preco[i].getCusto()){

                System.out.println("Resultado: " + (preco[i].getVenda()-preco[i].getCusto()) + ", este produto teve Lucro." );
            
            }
            else if (preco[i].getVenda() < preco[i].getCusto()){

                System.out.println("Resultado: " + (preco[i].getVenda()-preco[i].getCusto()) + ", este produto teve Prejuízo." );

            }
            else{

                System.out.println("Resultado: " + (preco[i].getVenda()-preco[i].getCusto()) + ", este produto não teve nem lucro e nem prejuízo." );
            }
        }

        System.out.println("A média de custo é " + mediaC);
        System.out.println("A média de venda é " + mediaV);

        leitor.close();

    }
    
}
