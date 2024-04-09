package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Triangulo;

public class Ex19 {
    
    public void executar(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os três lados do triângulo:");
        double lado1 = scanner.nextDouble();
        double lado2 = scanner.nextDouble();
        double lado3 = scanner.nextDouble();
        
        Triangulo triangulo = new Triangulo(lado1, lado2, lado3);
        
        if (triangulo.ehTriangulo()) {
            System.out.println("Os lados fornecidos podem formar um triângulo.");
            System.out.println("Tipo de triângulo: " + triangulo.tipoTriangulo());
        } else {
            System.out.println("Os lados fornecidos não podem formar um triângulo.");
        }
        
        scanner.close();
    }
    
    public static void main(String[] args) {
        Ex19 ex19 = new Ex19();
        ex19.executar();
    }
}