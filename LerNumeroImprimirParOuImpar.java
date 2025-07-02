import java.util.Scanner;

public class LerNumeroImprimirParOuImpar {
    // Ler um número e imprimir se este número é ou não par.//

    public static void main(String[] args) {
        
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = entradaTeclado.nextInt();
        entradaTeclado.close();
        

        switch (numero % 2) {
            case 0:
                System.out.println("O número é par. ");
                break;
                
            default:
                System.out.println("O número não é par. ");
                break;
        }
    }
}
