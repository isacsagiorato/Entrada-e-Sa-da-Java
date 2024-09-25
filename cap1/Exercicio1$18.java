import java.util.Scanner;

public class Exercicio1$18 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        double diagonal_maior;
        double diagonal_menor;
        double area;

        System.out.println("Valor da diagonal maior: ");
        diagonal_maior= Double.parseDouble(scan.nextLine());
        System.out.println("Valor da diagonal menor: ");
        diagonal_menor= Double.parseDouble(scan.nextLine());

        area= (diagonal_maior*diagonal_menor)/2;

        System.out.printf("Area = %.2f\n", area);

        scan.close();
    }
    
}
