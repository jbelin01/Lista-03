package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Automovel;

public class Ex02 {

    public void executar(){

        Automovel automovel = new Automovel();
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a distância percorrida: ");
        automovel.setDistancia(leitor.nextDouble());

        System.out.println("Digite quantos listros gastos: ");
        automovel.setCombustivel(leitor.nextDouble());

        System.out.println("Counsumo médio:" + automovel.consumoMedio(automovel.getdistancia(), automovel.getCombustivel()));
          
        leitor.close();
    }
    
}
