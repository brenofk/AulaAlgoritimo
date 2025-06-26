
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // Para leitura do teclado
        System.out.println();
        System.out.println("Digite o valor do número: ");
        int numero = scanner.nextInt();

        scanner.close();

        if (numero % 2 == 0) {
            int dobro = numero * 2;
            System.out.println("O numero é par e o dobro é: " + dobro);
        } else {
            int triplo = numero * 3;
            System.out.println("O numero é impar e o triplo é: " + triplo);
        }
    }
}
