package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Usuario;

public class Ex04 {
    
    public void executar(){
        
    Usuario usuario = new Usuario();

    Scanner leitor = new Scanner(System.in);

    System.out.println(" digite o valor que possui na  carteira em dolar(US$): ");
    usuario.setCarteira(leitor.nextDouble());

    System.out.println(" Digite o valor da cotação para reais: ");
    usuario.setCotacao(leitor.nextDouble());

    System.out.println("O valor da carteira convertido para reais é: R$ " + usuario.conversao(usuario.getCarteira(), usuario.getCotacao()));
    System.out.println("O valor na carteira em Dólares é: US$"+ usuario.getCarteira());

    leitor.close();
    
    }

}
