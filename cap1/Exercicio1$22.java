import java.util.Scanner;

public class Exercicio1$22 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        double valor;
        double porcentagem;
        double desconto;

        System.out.println("Valor do produto: \n");
        valor= Double.parseDouble(scan.nextLine());

        porcentagem= valor*0.09;
        desconto= valor-porcentagem;

        System.out.printf("Preco de venda com 9%% de desconto: %.2f\n", desconto);

        scan.close();
        
    }
    
}
