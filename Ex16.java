import java.util.Scanner;

public class Ex16 {
    public void executar() {
        Scanner scanner = new Scanner(System.in);
        Funcionario[] funcionarios = new Funcionario[584];

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Digite o nome do funcionário " + (i + 1) + ":");
            String nome = scanner.nextLine();

            System.out.println("Digite o salário do funcionário " + (i + 1) + ":");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            funcionarios[i] = new Funcionario(nome, salario);
        }

        for (Funcionario funcionario : funcionarios) {
            funcionario.calcularReajuste();
        }

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.println("Nome: " + funcionarios[i].getNome() + ", Salário reajustado: " + funcionarios[i].getSalario());
        }

        scanner.close();
    }
}