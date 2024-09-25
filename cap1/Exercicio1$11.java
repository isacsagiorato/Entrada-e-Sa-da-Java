import java.util.Scanner;

public class Exercicio1$11 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int diagonal_maior;
        int diagonal_menor;
        int area;

        System.out.println("Valor da diagonal maior: ");
        diagonal_maior= Integer.parseInt(scan.nextLine());
        System.out.println("Valor da diagonal menor: ");
        diagonal_menor= Integer.parseInt(scan.nextLine());

        area= (diagonal_maior*diagonal_menor)/2;

        System.out.printf("Area = %d\n", area);

        scan.close();
    }
    
}
