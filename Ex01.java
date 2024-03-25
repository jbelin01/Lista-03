import java.util.Scanner;


public class Ex01 {

public void executar(){
    Aluno al = new Aluno();
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Informe nome: ");
    al.setNome(sc.nextLine());

    System.out.println("Informe nota 1: ");
    al.setNota1(sc.nextDouble());

    System.out.println("Informe nota 2 : ");
    al.setNota2(sc.nextDouble());

    System.out.println("Informe nota 3: ");
    al.setNota3(sc.nextDouble());

    System.out.println("Média do aluno:" + al.mediaAluno(al.getNota1(),al.getNota2(),al.getNota3()));


    sc.close();
}
    
}
