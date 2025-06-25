import java.util.Scanner;

public class Atividade2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Para leitura do teclado
        
        float nota1 = scanner.nextFloat();
        float nota2 = scanner.nextFloat();

        float media = (nota1 + nota2) / 2;

        if (media > 7.0) {
            System.out.println("Aprovado");
        } else if (media < 4.0) {
            System.out.println("Reprovado");
        } else if (media < 7.0 && media >= 4.0) {
            System.out.println("Exame");
        }
    }
}
