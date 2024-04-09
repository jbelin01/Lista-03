package br.edu.up.exercicios;
import java.util.Scanner;

import br.edu.up.modelos.Estudante;

public class Ex24 {

    public void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota do trabalho de laboratório:");
        double notaLaboratorio = leitor.nextDouble();

        System.out.println("Digite a nota da avaliação semestral:");
        double notaSemestral = leitor.nextDouble();

        System.out.println("Digite a nota do exame final:");
        double notaExameFinal = leitor.nextDouble();

        Estudante estudante = new Estudante(notaLaboratorio, notaSemestral, notaExameFinal);
        double notaFinal = calcularNotaFinal(estudante);

        System.out.println("A nota final do estudante é: " + notaFinal);

        leitor.close();
    }

    private double calcularNotaFinal(Estudante estudante) {
        
        double pesoLaboratorio = 2;
        double pesoSemestral = 3;
        double pesoExameFinal = 5;

        
        double notaFinal = (estudante.getNotaLaboratorio() * pesoLaboratorio + estudante.getNotaSemestral() * pesoSemestral + estudante.getNotaExameFinal() * pesoExameFinal) / (pesoLaboratorio + pesoSemestral + pesoExameFinal);

        return notaFinal;
    }
}