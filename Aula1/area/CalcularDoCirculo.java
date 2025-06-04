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

public class CalcularDoCirculo {

    public static final Scanner TECLADO = new Scanner(System.in);

    public static double lerValorReal(){

        double valor;
        valor = TECLADO.nextDouble();
        return valor;
    } 

    public static void imprimir(String texto){
        System.out.println(texto);
    }

    public static double calcularAreaDoCirculo(double raio){
        double circunferencia;
        final double PI = Math.PI;

        circunferencia = (raio * raio) * PI; 
        return circunferencia;
    }



    public static void main(String[] args) {
        
        double raio;
        double areaDaCircunferencia;

        // Entrada
        imprimir("digite o valor do raio: ");
        raio = lerValorReal();

        // Processamento
        areaDaCircunferencia = calcularAreaDoCirculo(raio);

        // Saida
        imprimir("O valor da circunferencia é: " + areaDaCircunferencia);

    }
}