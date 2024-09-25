import java.util.Scanner;

public class Exercicio1$16 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        double base;
        double altura;
        double area;

        System.out.println("Valor da base: ");
        base= Double.parseDouble(scan.nextLine());
        
        System.out.println("Valor da altura: ");
        altura= Double.parseDouble(scan.nextLine());

        area= (base*altura)/2;

        System.out.printf("Area = %.2f",area);


scan.close();

    }
    
}
