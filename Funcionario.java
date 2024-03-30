class Funcionario {
    private String nome;
    private double salario;
    private static double salarioMinimo = 1100.0;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void calcularReajuste() {
        double salarioMinimoAtual = salarioMinimo * 3;

        if (salario < salarioMinimoAtual) {
            salario *= 1.5;
        } else if (salario <= salarioMinimoAtual * 10) {
            salario *= 1.2;
        } else if (salario <= salarioMinimoAtual * 20) {
            salario *= 1.15;
        } else {
            salario *= 1.1;
        }
    }
}