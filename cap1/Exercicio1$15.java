import java.util.Scanner;

public class Exercicio1$15 {
public static void main(String[] args) {
Scanner scan= new Scanner(System.in);

double largura;
double altura;
double area;
double perimetro;

System.out.println("Valor da largura: ");
largura= Double.parseDouble(scan.nextLine());

System.out.println("Valor da altura: ");
altura= Double.parseDouble(scan.nextLine());

perimetro= (2*largura)+(2*altura);
area= largura*altura;

System.out.printf("Perimetro = %.2f\n",perimetro);
System.out.printf("Area = %.2f\n",area);

scan.close();
    }
}
