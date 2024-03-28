import java.util.Scanner;

public class Ex10 {
    
    public void executar(){
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("quantas pessoas deseja adicionar: ");
        int num = leitor.nextInt();

        Pessoa[] pessoas = new Pessoa[num];

        for ( int i = 0; i < num; i++){

            System.out.println("Digite a idade da pessoa " + (i+1) + ":");
            int idade = leitor.nextInt();
            
            pessoas[i] = new Pessoa(idade);
        }

        for ( int i = 0; i < num; i++){
            if( pessoas[i].getIdade() > 18){
                System.out.println(" a pessoa " + (i + 1) + " é maior de idade");
            }
            else{
                System.out.println(" a pessoa " + (i + 1) + " é menor de idade");
            }
            
        }

        leitor.close();
        
    }

}
