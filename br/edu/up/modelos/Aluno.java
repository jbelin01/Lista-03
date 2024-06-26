package br.edu.up.modelos;
public class Aluno {

    private String nome;
    private Double nota1;
    private Double nota2;
    private Double nota3;

    public Aluno(){
        
    }

        public Aluno(String nome, Double nota1, Double nota2, Double nota3){

            this.nome = nome;
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
        }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota1() {
        return this.nota1;
    }

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota2() {
        return this.nota2;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota3() {
        return this.nota3;
    }

    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }
    

    public static Double mediaAluno(Double nota1, Double nota2, Double nota3){
        return (nota1 + nota2 + nota3)/3;
    }

    public String mencaoAluno(){
        Double media = mediaAluno(nota1, nota2, nota3);
            
         if (media >= 7){

            return "Aprovado!";

         }
         else if(media <=5){

            return "Reprovado!";

         }
         else{

            return "Recuperação!";

         }


    }


    
}
