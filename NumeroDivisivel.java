import java.util.Scanner;

public class NumeroDivisivel {
    // 6. Ler um número e informar se ele é divisível por 10, por 5, por 2 ou se não é divisível por nenhum destes.
    public static void main(String[] args) {
        
        Scanner entradaDoTeclado = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = entradaDoTeclado.nextInt();
        entradaDoTeclado.close();

        if (numero % 10 == 0) {
            System.out.println("Numero divisivel por 10 ");
        } else if (numero % 5 == 0) {
            System.out.println("Numer divisivel por 5 ");
        } else if (numero % 2 == 0) {
            System.out.println("Numero divisivel por 2 ");
        } else {
            System.out.println("Não é divisive por nenhum");
        }
    }
}
