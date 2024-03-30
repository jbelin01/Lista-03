import java.util.Scanner;

public class Ex18 {

    public void executar() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o nome do funcionário:");
        String nome = leitor.nextLine();

        System.out.println("Digite a idade do funcionário:");
        int idade = leitor.nextInt();

        System.out.println("Digite o sexo do funcionário (M/F):");
        char sexo = leitor.next().charAt(0);

        System.out.println("Digite o salário do funcionário:");
        double salario = leitor.nextDouble();

        Funcionario funcionario = new Funcionario(nome, idade, sexo, salario);

        double salarioLiquido = funcionario.calcularSalarioLiquido();
        double abono = funcionario.calcularAbono();

        System.out.println("Nome do funcionário: " + funcionario.getNome());
        System.out.println("Salário líquido: " + salarioLiquido);
        System.out.println("Abono: " + abono);

        leitor.close();
    }
}