package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Numero;

public class Ex09 {

    public void executar(){
        
        int contador = 0;
        Numero numeros[] = new Numero[80];
        Scanner leitor = new Scanner(System.in);

                
        for ( int i = 0; i < 80; i++){

            numeros[i] = new Numero();

            System.out.println("Digite o Número " + (i+1)+": ");
            numeros[i].setNum(leitor.nextDouble());
            
            if(numeros[i].getNum() >= 10 && numeros[i].getNum() <= 150){
                contador++;
            }
            
                      
        }

        System.out.println("Existem " + contador + " números entre 10 e 150!");
        

        leitor.close();

    }
    
}