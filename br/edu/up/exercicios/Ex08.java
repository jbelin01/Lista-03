package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Aluno;

public class Ex08 {

    public void executar(){
        
        Aluno aluno = new Aluno();

        Scanner leitor = new Scanner(System.in);   
        
        System.out.println("Informe nome: ");
        aluno.setNome(leitor.nextLine());
    
        System.out.println("Informe nota 1: ");
        aluno.setNota1(leitor.nextDouble());
    
        System.out.println("Informe nota 2 : ");
        aluno.setNota2(leitor.nextDouble());
    
        System.out.println("Informe nota 3: ");
        aluno.setNota3(leitor.nextDouble());

        System.out.println("Nome do aluno:" + aluno.getNome());

        System.out.println("Média do aluno:" + aluno.mediaAluno(aluno.getNota1(),aluno.getNota2(),aluno.getNota3()));

        System.out.println("O aluno está " + aluno.mencaoAluno());

        leitor.close();
        
    }
    
}
