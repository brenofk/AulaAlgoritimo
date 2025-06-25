
import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Para leitura do teclado

        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
        int dobro = numero * 2;
            System.out.println("Numero par: " + dobro);
        } else {
        int triplo = numero * 3;
            System.out.println("Numero impar: " + triplo);
        }

        scanner.close();
    }
}
