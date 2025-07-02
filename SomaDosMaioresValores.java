import java.util.Scanner;

// 2. Ler 3 valores e escrever a soma dos 2 maiores.//
public class SomaDosMaioresValores {
    
    public static void main(String[] args) {
        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Digite o primeiro valor inteiro: ");
        int primeiroValor = entradaTeclado.nextInt();
        
        System.out.println("Digite o segundo valor inteiro: ");
        int segundoValor = entradaTeclado.nextInt();

        System.out.println("Digite o terceiro valor que seja inteiro: ");
        int terceiroValor = entradaTeclado.nextInt();
        entradaTeclado.close();


        int menorNumero = primeiroValor;

        if (segundoValor < menorNumero) {
            menorNumero = segundoValor;
        }

        if (terceiroValor < menorNumero) {
            menorNumero = terceiroValor;
        }

        int somaDosDoisMaioresNumeros = primeiroValor + segundoValor + terceiroValor - menorNumero;
        System.out.println("A soma dos dois maiores numero é: " + somaDosDoisMaioresNumeros);
    }
}
