
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

public class CalcularArea {
    public static final Scanner TECLADO = new Scanner(System.in);

    public static double lerValorReal(){

        double valor;
        valor = TECLADO.nextDouble();
        return valor;
    } 
    
    public static void imprimir(String texto){
        System.out.println(texto);
    }

    public static double calcularAreaTriangulo(double base, double altura){
        double area;
        area = (base * altura) / 2;
        return area;
    }

    public static void main(String[] args) {
        
        double base;
        double altura;
        double area;

        // Entrada
        imprimir("Digite a base: ");
        base = lerValorReal();
 
        imprimir("Digite a altura: ");
        altura = lerValorReal();

        // Processamento
        area = calcularAreaTriangulo(base, altura);

        // Saida
        imprimir("O valor da area é: " + area);
    }

}
