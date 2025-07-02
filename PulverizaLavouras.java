import java.util.Scanner;

// 5. Uma Cia de pulverização utiliza avião para pulverizar lavouras. Os custos de pulverização dependem
// do tipo de praga e da área a ser contratada conforme a tabela:
// • Tipo 1 – ervas daninhas R$ 50,00 por acre;
// • Tipo 2 – gafanhotos R$ 100,00 por acre;
// • Tipo 3 – broca R$ 150,00 por acre;
// • Tipo 4 – todos acima R$ 250,00 por acre.

// Se a área a ser pulverizada for superior a 1000 acres, o fazendeiro tem um desconto de 5%. Em adição,
// qualquer fazendeiro cujo custo or maior do que R$ 750,00 tem um desconto de 10% sobre o valor que
// ultrapassar os R$ 50,00. Caso ambos os descontos se apliquem, o da área é calculado antes. Fazer um
// programa que leia: o tipo de pulverização(1 a 4) e área a ser pulverizada; e imprima o valor a ser pago.

public class PulverizaLavouras {

    public static void main(String[] rgs) {

        Scanner entradaDoTeclado = new Scanner(System.in);

        System.out.println("Digite o tipo de pulverização (1 a 4): ");
        int tipo = entradaDoTeclado.nextInt();

        System.out.println("Digite a area a ser pulverizada (acres): ");
        double area = entradaDoTeclado.nextInt();

        entradaDoTeclado.close();
        double custoPorAcre = 0;

        switch (tipo) {
            case 1:
                custoPorAcre = 50;
                break;

            case 2:
                custoPorAcre = 100;
                break;

            case 3:
                custoPorAcre = 150;
                break;
            case 4:
                custoPorAcre = 250;
                break;
            default:
                System.out.println("Tipo invalido! ");
                break;
        }

        // calcular custo inicial.
        double custoTotal = custoPorAcre * area;

        if (area > 1000) {
            custoTotal = custoTotal * 0.95; // 5% descont.
        }

        // If custo > 750, aplicar desconto de 10% sobre o valor que ultrapassar.

        if (custoTotal > 750) {
            double valorExcedente = custoTotal - 750;
            double descontoExcedente = valorExcedente * 0.10;
            custoTotal -= descontoExcedente;
        }

        System.out.printf("Valor a pagar: %.2f\n", custoTotal);

    }
}
