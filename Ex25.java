import java.util.Scanner;

public class Ex25 {

    public void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do estudante:");
        String nome = leitor.nextLine();

        System.out.println("Digite o número de matrícula do estudante:");
        int numeroMatricula = leitor.nextInt();

        System.out.println("Digite a nota do trabalho de laboratório:");
        double notaLaboratorio = leitor.nextDouble();

        System.out.println("Digite a nota da avaliação semestral:");
        double notaSemestral = leitor.nextDouble();

        System.out.println("Digite a nota do exame final:");
        double notaExameFinal = leitor.nextDouble();

        Estudante estudante = new Estudante(nome, numeroMatricula, notaLaboratorio, notaSemestral, notaExameFinal);
        double notaFinal = calcularNotaFinal(estudante);
        String classificacao = getClassificacao(notaFinal);

        System.out.println("Nome do estudante: " + estudante.getNome());
        System.out.println("Número de matrícula: " + estudante.getNumeroMatricula());
        System.out.println("Nota final: " + notaFinal);
        System.out.println("Classificação: " + classificacao);

        leitor.close();
    }

    private double calcularNotaFinal(Estudante estudante) {
        
        double pesoLaboratorio = 2;
        double pesoSemestral = 3;
        double pesoExameFinal = 5;

        
        double notaFinal = (estudante.getNotaLaboratorio() * pesoLaboratorio + estudante.getNotaSemestral() * pesoSemestral + estudante.getNotaExameFinal() * pesoExameFinal) / (pesoLaboratorio + pesoSemestral + pesoExameFinal);

        return notaFinal;
    }

    private String getClassificacao(double notaFinal) {
        if (notaFinal >= 8 && notaFinal <= 10) {
            return "A";
        } else if (notaFinal >= 7 && notaFinal < 8) {
            return "B";
        } else if (notaFinal >= 6 && notaFinal < 7) {
            return "C";
        } else if (notaFinal >= 5 && notaFinal < 6) {
            return "D";
        } else {
            return "R";
        }
    }
}