import java.util.Scanner;

public class Exercicio1$12 {
    public static void main(String[] args) {
        
    
    Scanner scan= new Scanner(System.in);
    double num;

    System.out.println("Entre com um valor qualquer: ");
    num= Double.parseDouble(scan.nextLine());

    System.out.printf("%f\n",num);
    System.out.printf("%.2f\n",num);
    System.out.printf("%.3f\n",num);

    scan.close();

}  
}
