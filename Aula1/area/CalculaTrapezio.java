

import java.util.Scanner;

/* 
    * 1 - Nome da classe sempre primeira letra maiuscula
    * 2 - O nome do arquivo é o mesmo nome da classe.
    * 3 - Nome das variaveis e classe CamelCase. ( NomeDoArquivo ou da classe ). No caso das variaveis a primeira letra e minuscula
    * 4 - O arquivo é sempre dividio em Entrada, Processamento e Saída.
*/

/* Assinatura dos metodos sempre tem que ter:
    * Nome.
    * O que tenho que passar.
    * O que ele retorna .
*/

public class CalculaTrapezio {
    public static final Scanner TECLADO = new Scanner(System.in);

    public static double lerValorReal(){

        double valor;
        valor = TECLADO.nextDouble();
        return valor;
    } 
    
    public static void imprimir(String texto){
        System.out.println(texto);
    }

    public static double calcularAreaDoTrapezio(double base_maior, double base_menor, double altura){
        double area;
        area = ((base_maior + base_menor) * altura) / 2;
        return area;
    }

    public static void main(String[] args) {
        
        double base_maior;
        double base_menor;
        double altura;
        double area;

        // Entrada
        imprimir("Digite a base maior: ");
        base_maior = lerValorReal();
 
        imprimir("Digite a base menor: ");
        base_menor = lerValorReal();

        imprimir("Digite a altura: ");
        altura = lerValorReal();

        // Processamento
        area = calcularAreaDoTrapezio(base_maior, base_menor, altura);

        // Saida
        imprimir("O valor da area é: " + area);
    }

}

