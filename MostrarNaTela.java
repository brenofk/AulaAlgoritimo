import java.util.Scanner;
    // 7. Receba um número inteiro de 1 a 100 e mostre na tela o número por extenso.
public class MostrarNaTela {
 
    public static void main(String[] args) {
        Scanner entradaDoTeclado = new Scanner(System.in);

        System.out.println("Digite um numero entre 1 e 10");
        int numero = entradaDoTeclado.nextInt();
        entradaDoTeclado.close();

        switch (numero) {
            case 1:
                System.out.println("um");
                break;

            case 2:
                System.out.println("dois");
                break;

            case 3:
                System.out.println("tres");
                break;

            case 4:
                System.out.println("quatro");
                break;
            
            case 5:
                System.out.println("Cinco");
                break;

            case 6:
                System.out.println("Seis");
                break;
            case 7:
                System.out.println("Sete");
                break;

            case 8: 
                System.out.println("Oito");
                break;
            
            case 9:
                System.out.println("Nove");
                break;
            
            case 10:
                System.out.println("Dez");
            default:
                System.out.println("Preguiça de fazer");
                break;
        }
    }
}
