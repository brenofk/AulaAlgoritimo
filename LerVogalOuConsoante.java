import java.util.Scanner;

public class LerVogalOuConsoante {

    // 1. Ler uma letra e mostrar se ela é vogal ou consoante.//
    public static void main(String[] args) {

        Scanner entradaTeclado = new Scanner(System.in);

        System.out.println("Digite uma vogal ou uma consoante: ");
        String letra = entradaTeclado.next();
        entradaTeclado.close();

        switch (letra.toLowerCase()) { // toLowerCaso é usado para tratar letras maiusculas/minusculas.
            case "a":
                System.out.println("Vogal");
                break;

            case "e":
                System.out.println("Voga");
                break;
            
            case "i":
                System.out.println("Voga");
                break;

            case "o":
                System.out.println("Vogal");
                break;

            default:
                System.out.println("Consoante");
                break;
        }

    }
}