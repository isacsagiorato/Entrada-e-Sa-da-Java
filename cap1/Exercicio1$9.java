import java.util.Scanner;

public class Exercicio1$9 {


    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int base;
        int altura;
        int area;

        System.out.println("Valor da base: ");
        base= Integer.parseInt(scan.nextLine());

        System.out.println("Valor da altura: ");
        altura= Integer.parseInt(scan.nextLine());

        area= (base*altura)/2;

        System.out.printf("Area = %d\n", area);
        
        scan.close();
    }
}
