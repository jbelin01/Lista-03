import java.util.Scanner;

public class Ex11 {
    
    public void executar(){

        Pessoa pessoas[] = new Pessoa[56];
        String sexos[] = new String[56];
        Scanner leitor = new Scanner(System.in);
        int contadorA = 0;
        int contadorB = 0;

        for ( int i = 0; i < 56; i++){

            pessoas[i] = new Pessoa();

            System.out.println("Digite o nome da pessoa " + (i+1)+": ");
            pessoas[i].setNome(leitor.nextLine());

            System.out.println("Digite o sexo da pessoa " + (i+1)+"(M/F): ");
            String sexo = leitor.nextLine();

            if (!sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("F") && !sexo.equalsIgnoreCase("m") && !sexo.equalsIgnoreCase("f")){

                System.out.println("O sexo tem que ser M/F ou m/f!");
                i--;                
                
            }
            else{

                sexos[i] = sexo;

            }


        }

        for(int i = 0; i < 56; i++){

            if (sexos[i].equals("M") || sexos[i].equals("m")){

                System.out.println("O " + pessoas[i].getNome()+ " é " + sexos[i]);
                contadorA++;

            }
            else if (sexos[i].equals("F") || sexos[i].equals("f")){

                System.out.println("A " + pessoas[i].getNome()+ " é " + sexos[i]);
                contadorB++;
            }
        }

        System.out.println(" Tem "+ contadorA + " pessoas do sexo Masculino");
        System.out.println(" Tem "+ contadorB + " pessoas do sexo Feminino");


        leitor.close();
    }
}
