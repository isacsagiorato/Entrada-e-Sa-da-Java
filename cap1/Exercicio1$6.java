import java.util.Scanner;

public class Exercicio1$6 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int num1;
        int num2;
        int soma;
        int divisao;
        int multiplicacao;
        int subtracao;

        System.out.println("Primeiro numero: ");
        num1= Integer.parseInt(scan.nextLine());

        System.out.println("Segundo numero: ");
        num2= Integer.parseInt(scan.nextLine());
        
        soma= num1+num2;
        subtracao= num1-num2;
        multiplicacao= num1*num2;
        divisao= num1/num2;

        System.out.printf("%d + %d = %d\n",num1,num2,soma);
        System.out.printf("%d - %d = %d\n",num1,num2,subtracao);
        System.out.printf("%d * %d = %d\n",num1,num2,multiplicacao);
        System.out.printf("%d / %d = %d\n",num1,num2,divisao);

        scan.close();
    }
}
