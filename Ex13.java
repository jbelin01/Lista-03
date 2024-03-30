import java.util.Scanner;

public class Ex13 {
    
    public void executar(){

        Pessoa pessoa = new Pessoa();
        Scanner leitor = new Scanner(System.in);
        int totalAptos = 0;
        int totalInaptos = 0;

        System.out.println("Digite o número de pessoas: ");
        int numPessoas = leitor.nextInt();
        leitor.nextLine(); 
        for (int i = 0; i < numPessoas; i++) {
            

            System.out.println("Digite o nome da pessoa " + (i + 1) + ":");
            pessoa.setNome(leitor.nextLine());

            System.out.println("Digite o sexo da pessoa " + (i + 1) + " (M/F):");
            String sexo = leitor.nextLine();
            pessoa.setSexo(sexo);

            System.out.println("Digite a idade da pessoa " + (i + 1) + ":");
            int idade = leitor.nextInt();
            pessoa.setIdade(idade);
            leitor.nextLine(); 

            System.out.println("Digite a saúde da pessoa " + (i + 1) + " (Apto/Inapto):");
            String saude = leitor.nextLine();
            pessoa.setSaude(saude);

            if (pessoa.getSexo().equalsIgnoreCase("M") && pessoa.getIdade() >= 18 && pessoa.getIdade() <= 45 && pessoa.getSaude().equalsIgnoreCase("Apto")) {
                System.out.println(pessoa.getNome() + " está apto para o serviço militar obrigatório.");
                totalAptos++;
            } else {
                System.out.println(pessoa.getNome() + " não está apto para o serviço militar obrigatório.");
                totalInaptos++;
            }
        }

        System.out.println("Total de pessoas aptas: " + totalAptos);
        System.out.println("Total de pessoas inaptas: " + totalInaptos);

        leitor.close();
    }
}
    

