import java.util.Scanner;

// Perguntar os coeficientes de uma equação de segundo grau (a, b e c) e:
// • Se delta for maior que zero – imprima as duas raízes;
// • Se delta for igual a zero – imprima apenas única raiz existente;
// • Se delta for menor que zero – imprima a mensagem “Não existem raízes reais”
public class Coeficiente {
    public static void main(String[] args) {
        Scanner entradaDoTecado = new Scanner(System.in);

        System.out.println("Digite o valor de a: ");
        double a = entradaDoTecado.nextInt();
        

        // Verifica se a equação é de segundo grau.
        if (a == 0) {
            System.out.println("Não é de segundo graus. (a nao pode = 0)");
        }

        System.out.println("Digite valor de b: ");
        double b = entradaDoTecado.nextDouble();

        System.out.println("Digite o valor de c: ");
        double c = entradaDoTecado.nextDouble();

        double delta = Math.pow(b, 2) - (4 * a * c); // valor de b * b
        System.out.println("Deta: " + delta);

        entradaDoTecado.close();

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.printf("Duas raizes reais: x1 = %.2f x2 = %.2f\n", x1, x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.printf("Uma unica raiz real: x = %.2f\n", x);
        } else {
            System.out.println("Nao tem raiz.");
        }
    }
}
