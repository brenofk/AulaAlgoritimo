
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

public class CalculaTrianguloEquilatero {
    public static final Scanner TECLADO = new Scanner(System.in);

    public static double lerValorReal(){

        double valor;
        valor = TECLADO.nextDouble();
        return valor;
    } 
    
    public static void imprimir(String texto){
        System.out.println(texto);
    }

    public static double calcularAreaTrianguloEquilatero(double lado ){
        double area;
        area = ((lado * lado) * Math.sqrt(3) / 4);
        return area;
    }

    public static void main(String[] args) {
        
        double lados;
        double area;

        // Entrada
        imprimir("Digite o valor dos lados: ");
        lados = lerValorReal();

        // Processamento
        area = calcularAreaTrianguloEquilatero(lados);

        // Saida
        imprimir("O valor da area é: " + area);
    }

}

