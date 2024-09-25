import java.util.Scanner;

public class Exercicio1$10 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int base_maior;
        int base_menor;
        int altura;
        int area;

        System.out.println("Valor da base maior: ");
        base_maior= Integer.parseInt(scan.nextLine());

        System.out.println("Valor da base menor: ");
        base_menor= Integer.parseInt(scan.nextLine());

        System.out.println("Valor da altura: ");
        altura= Integer.parseInt(scan.nextLine());

        area= ((base_maior+base_menor)*altura)/2;

        System.out.printf("Area = %d\n",area);

        scan.close();
    }
    
}
