import java.util.Scanner;



public class Exercicio1$24 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        double hora;
        int quantidade;
        double porcentagem;
        double salario;
        double salario_bruto;

        System.out.println("Valor da hora/aula: \n");
        hora= Double.parseDouble(scan.nextLine());

        System.out.println("Quantidade de aulas: \n");
        quantidade= Integer.parseInt(scan.nextLine());

        System.out.println("Porcentagem de desconto do INSS: \n");
        porcentagem= Double.parseDouble(scan.nextLine());

        salario_bruto= quantidade*hora;

        porcentagem= (porcentagem/100)*salario_bruto;

        salario= salario_bruto-porcentagem;

        System.out.printf("Salario Liquido: %.2f\n",salario);


        scan.close();
        

    }
    
}
