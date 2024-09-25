import java.util.Scanner;

public class Exercicio1$23 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int nascimento;
        int atual;
        int idade;

        System.out.println("Ano de nascimento: \n");
        nascimento= Integer.parseInt(scan.nextLine());

        System.out.println("Ano atual: \n");
        atual= Integer.parseInt(scan.nextLine());

        idade= atual-nascimento;

        System.out.printf("Idade aproximada: %d anos\n",idade);

        scan.close();

    }
    
}
