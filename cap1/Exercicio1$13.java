import java.util.Scanner;

public class Exercicio1$13 {
    public static void main(String[] args) {
        
    
    Scanner scan= new Scanner(System.in);

    double num1;
    double num2;
    double soma;
    double subtracao;
    double multiplicacao;
    double divisao;

    System.out.println("Primeiro numero: ");
    num1= Double.parseDouble(scan.nextLine());

    System.out.println("Segundo numero: ");
    num2= Double.parseDouble(scan.nextLine());

    soma= num1+num2;
    subtracao= num1-num2;
    multiplicacao= num1*num2;
    divisao= num1/num2;

    System.out.printf("%.2f + %.2f = %.2f\n", num1,num2,soma);
    System.out.printf("%.2f - %.2f = %.2f\n", num1,num2,subtracao);
    System.out.printf("%.2f * %.2f = %.2f\n", num1,num2,multiplicacao);
    System.out.printf("%.2f / %.2f = %.2f\n", num1,num2,divisao);

    scan.close();
    }
}
