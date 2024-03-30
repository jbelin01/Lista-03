public class Funcionario {
    private String nome;
    private int idade;
    private char sexo;
    private double salario;
    
  
   // Construtor para o Exercício 18
   public Funcionario(String nome, int idade, char sexo, double salario) {
    this.nome = nome;
    this.idade = idade;
    this.sexo = sexo;
    this.salario = salario;
    }

// Construtor para o Exercício 16
public Funcionario(String nome, int idade, double salario) {
    this.nome = nome;
    this.idade = idade;
    this.salario = salario;
}
    
 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    public double calcularAbono() {
        double abono = 0.0;
    
        // Verifica sexo e idade para determinar o abono
        if (sexo == 'M' || sexo == 'm') {
            if (idade >= 30) {
                abono = 100.0;
            } else {
                abono = 50.0;
            }
        } else if (sexo == 'F' || sexo == 'f') {
            if (idade >= 30) {
                abono = 200.0;
            } else {
                abono = 80.0;
            }
        }
    
        return abono;
    }

    public double calcularSalarioLiquido() {
        double abono = calcularAbono();
        return salario + abono;
    }
}