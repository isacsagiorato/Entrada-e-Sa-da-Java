import java.util.Scanner;

public class Exercicio1$17 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);

        double base_maior;
        double base_menor;
        double altura;
        double area;
        

        System.out.println("Valor da base maior: ");
        base_maior= Double.parseDouble(scan.nextLine());

        System.out.println("Valor da base menor: ");
        base_menor= Double.parseDouble(scan.nextLine());

        System.out.println("Valor da altura: ");
        altura= Double.parseDouble(scan.nextLine());

        area= ((base_maior+base_menor)*altura)/2;

        System.out.printf("Area = %.2f\n",area);

        scan.close();
    }
    
}
