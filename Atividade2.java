import java.util.Scanner;

public class Atividade2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); // Para leitura do teclado

        System.out.println();

        System.out.println("Digite o valor da nota 1");
        float nota1 = scanner.nextFloat();

        System.out.println("Digite o valor da nota 2");
        float nota2 = scanner.nextFloat();

        scanner.close();

        float media = (nota1 + nota2) / 2;

        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else if (media < 4.0) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Exame");
        }
    }
}
