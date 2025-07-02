import java.util.Scanner;

public class LerPrecoDaGasolina {
    
    public static void main(String[] args) {
        
        Scanner entradaDoTeclado = new Scanner(System.in);

        final double precoGasolina = 6.10;
        final double precAlcool = 4.30;

        System.out.println("Digite o tipo de combustível (A para álcool, G para gasolina): ");
        char tipo = Character.toUpperCase(entradaDoTeclado.next().charAt(0)); // garante maiúscula e a primeira letra da posição.

        System.out.println("Digite a quantidade de litros vendidos: ");
        double litros = entradaDoTeclado.nextDouble();

        entradaDoTeclado.close();

        double precoLitro = 0;
        double descontoPorLitro = 0;


        if (tipo == 'A') {
            precoLitro = precAlcool;

            if (litros <= 25) {
                descontoPorLitro = 0.02;
            } else {
                descontoPorLitro = 0.04;
            }
        } else if (tipo == 'G') {
            precoLitro = precoGasolina;

            if (litros <= 25) {
                descontoPorLitro = 0.03;
            } else {
                descontoPorLitro = 0.05;
            }
        } else {
            System.out.println("Tipo de combustivel invalido: ");
            return;
        }

        double valorTotal = litros * precoLitro;

        double descontoTotal = litros * precoLitro * descontoPorLitro;

        double valorPagar = valorTotal - descontoTotal;

        System.out.printf("O valor a pagar é: %.2f\n", valorPagar);

    }
}
