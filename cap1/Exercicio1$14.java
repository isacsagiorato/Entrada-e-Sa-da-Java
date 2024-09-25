import java.util.Scanner;

public class Exercicio1$14 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        double perimetro;
        double area;
        double lado;

        System.out.println("Valor do lado: ");
        lado= Double.parseDouble(scan.nextLine());

        perimetro= 4*lado;
        area= lado*lado;

        System.out.printf("Perimetro = %.2f\n", perimetro);
        System.out.printf("Area = %.2f\n", area);

        scan.close();

        
        
    }
    
}
