import java.util.Scanner;

public class Ex07 {
    
    public void executar(){

        Carro carro = new Carro();

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o preço de fábrica do veículo: ");
        carro.setFabrica(leitor.nextDouble());

        System.out.println("O custo ao consumidor é de: R$" + carro.custoConsumidor(carro.getFabrica()));

        leitor.close();


    }
}
