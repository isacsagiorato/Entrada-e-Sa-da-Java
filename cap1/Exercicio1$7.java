import java.util.Scanner;
public class Exercicio1$7 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        int lado;
        int perimetro;
        int area;

        System.out.println("Valor do lado: ");
        lado= Integer.parseInt(scan.nextLine());

        perimetro= 4*lado;
        area=lado*lado;

        System.out.printf("Perimetro = %d\n",perimetro);
        System.out.printf("Area = %d\n",area);

        scan.close();
    }
    
}
