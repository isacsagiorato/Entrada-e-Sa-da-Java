import java.util.Scanner;

public class Exercicio1$20 {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);

        int num1;
        int num2;
        int media;

        System.out.println("Primeiro numero: \n");
        num1= Integer.parseInt(scan.nextLine());

        System.out.println("Segundo numero: \n");
        num2= Integer.parseInt(scan.nextLine());

        media= (num1+num2)/2;

        System.out.printf("Media aritmetica: %d\n",media);

        scan.close();
    }
    
}
