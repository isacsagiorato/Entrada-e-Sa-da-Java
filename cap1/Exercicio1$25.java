import java.util.Scanner;

public class Exercicio1$25 {

    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);

        double fahrenheit;
        double celsius;

        System.out.println("Temperatura em graus Fahrenheit: ");
        fahrenheit= Double.parseDouble(scan.nextLine());

        celsius= (fahrenheit-32)/1.8;

      
      System.out.printf("%.2f graus Fahrenheit correspondem a %.2f graus Celsius\n", fahrenheit,celsius);
        scan.close();
    }
    
}
