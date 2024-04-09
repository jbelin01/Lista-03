package br.edu.up.modelos;
public class Professor {
    private int nivel;
    private int horasTrabalhadas;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double calcularSalario() {
        double valorHoraAula;

        switch (nivel) {
            case 1:
                valorHoraAula = 12.0;
                break;
            case 2:
                valorHoraAula = 17.0;
                break;
            case 3:
                valorHoraAula = 25.0;
                break;
            default:
                System.out.println("Nível de professor inválido. Utilizando valor padrão de R$ 12,00 por hora/aula.");
                valorHoraAula = 12.0;
                break;
        }

        return horasTrabalhadas * valorHoraAula;
    }
}