import java.util.Scanner;

public class Atividade1 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Para leitura do teclado
        
        int idade = scanner.nextInt();

        scanner.close();

        if (idade >= 18) {
            System.out.println("Pode fazer habilidadetação");
        } else {
            System.out.println("Voce nao pode fazer a habilitação");
        }
    }
}
