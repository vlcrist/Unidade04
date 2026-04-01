/*
__Enunciado:
Dado uma letra, escreva um algoritmo 
que informe se ela é ou não uma vogal.

__Análise: OK

//___Gordura:
escreva um algoritmo que

//___Entradas:
ler(ds_letra)

//___Processos:
se (ds_letra == 'A' || ds_letra == 'E' || ds_letra == 'I' || ds_letra == 'O' || ds_letra == 'U') {
    imprimir("É vogal");
} se não {
    imprimir("NÃO é vogal");
}

//___Saídas:
imprimir("É vogal")
OU
imprimir("NÃO é vogal")

*/
import java.util.Scanner;

public class Uni04Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Entradas e Variáveis:
        System.out.println("Identificador de vogais.\nInsira uma letra:");
        char ds_letra = sc.next().toUpperCase().charAt(0);

        // Processos:
        if (ds_letra == 'A' || ds_letra == 'E' || ds_letra == 'I' || ds_letra == 'O' || ds_letra == 'U') {
            // Saídas:
            System.out.println("É vogal");
        } else {
            // Saídas:
            System.out.println("NÃO é vogal");
        }
        sc.close();
    } 
}
/*
 * __ Valores de Testes:
 * _ Caso 1 ___
 * ds_letra = 'A'
 * É vogal
 * 
 * _ Caso 2 ___
 * ds_letra = 'B'
 * NÃO é vogal
 * 
 * _ Caso 3 ___
 * ds_letra = 'E'
 * É vogal
 */