import java.util.Scanner;

public class Exercicio1$19 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        double raio;
        double diametro;
        double circunferencia;
        double area;

        System.out.println("Valor do raio do círculo: \n");
        raio= Double.parseDouble(scan.nextLine());

        diametro= 2*raio;
        circunferencia= (2*3.141592)*raio;
        area= 3.141592*(raio*raio);

        System.out.printf("Diametro = %.2f\n",diametro);
        System.out.printf("Circunferencia = %.2f\n",circunferencia);
        System.out.printf("Area = %.2f\n",area);

        scan.close();
    }
    
}
