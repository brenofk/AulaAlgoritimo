import java.util.Scanner;

public class CalculaValor {
    public static final Scanner TECLADO = new Scanner(System.in);

    public static double lerValorReal(){

        double valor;
        valor = TECLADO.nextDouble();
        return valor;
    } 

    public static void imprimir(double valorLiquidoDoSocio, double diferenca, double porcentagem){
        System.out.printf("%.2f\n%.2f\n%.2f%% \n", valorLiquidoDoSocio, diferenca, porcentagem);
    }

    public static void imprimirTexto(String texto) {
        System.out.println(texto);
    }

    public static double calculaValorDosSocios(double valor_bruto){

        double valorAdm;
        double resultado;
        double imposto;

        valorAdm = ((valor_bruto * 6) /100);
        resultado = valor_bruto - valorAdm;
        resultado = resultado /3;
        imposto = (resultado * 15) / 100;
        resultado = resultado - imposto;

        return resultado;
    }

    public static void main(String[] args) {

        double valorLiquidoDoSocio;
        double diferenca;
        double valor_bruto;
        double porcentagem;

        imprimirTexto("Digite o valor bruto:");
        
        valor_bruto = lerValorReal();
        
        valorLiquidoDoSocio = calculaValorDosSocios(valor_bruto);
        diferenca = (valor_bruto /3) - valorLiquidoDoSocio;
        
        porcentagem = (valorLiquidoDoSocio * 100) / valor_bruto;

        imprimir(valorLiquidoDoSocio, diferenca, porcentagem);
    }





}
