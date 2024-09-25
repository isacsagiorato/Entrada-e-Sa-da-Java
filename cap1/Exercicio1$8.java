import java.util.Scanner;

public class Exercicio1$8 {
public static void main(String[] args) {
    Scanner scan= new Scanner(System.in);

    int base;
    int altura;
    int perimetro;
    int area;

    System.out.println("Valor da largura");
    base= Integer.parseInt(scan.nextLine());

    System.out.println("Valor da altura");
    altura= Integer.parseInt(scan.nextLine());

    perimetro= (2*base)+(2*altura);
    area= base*altura;

    System.out.printf("Perimetro = %d\n",perimetro);
    System.out.printf("Area = %d\n",area);

    scan.close();
}    
}
