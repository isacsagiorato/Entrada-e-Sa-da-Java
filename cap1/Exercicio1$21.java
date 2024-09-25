import java.util.Scanner;

public class Exercicio1$21 {

    public static void main(String[] args) {
        
        Scanner scan= new Scanner (System.in);

        int num;
        int sucessor;
        int antecessor;


        System.out.println("Insira um numero inteiro: ");
        num= Integer.parseInt(scan.nextLine());

        sucessor= num+1;
        antecessor= num-1;


        System.out.printf("Sucessor de %d: %d\n",num,sucessor);
        System.out.printf("Antecessor de %d: %d\n",num,antecessor);

        scan.close();

    }
    
}
