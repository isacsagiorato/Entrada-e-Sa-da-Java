import java.util.Scanner;

public class Exercicio1$26 {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        double celsius;
        double fahrenheit;

        System.out.println("Temperatura em graus Celsius: ");
        celsius= Double.parseDouble(scan.nextLine());

        fahrenheit= (1.8*celsius)+32;

        System.out.printf("%.2f graus Celsius correspondem a %.2f graus Fahrenheit\n",celsius,fahrenheit);

        scan.close();


    }
    
}
