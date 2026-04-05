/*
__Enunciado:
Dado um número de ponto flutuante maior do que 0, 
informe se foram digitadas ou não casas decimais no número.

__Análise: OK

//___Gordura:

*null*

//___Entradas:

ler(nr_numero)

//___Processos:

se (nr_numero % 1 != 0) {
    imprimir("Casas decimais foram digitadas.");
} senão {
    imprimir("Casas decimais não foram digitadas.");
}

//___Saídas:

imprimir("Casas decimais foram digitadas.")
OU 
imprimir("Casas decimais não foram digitadas.")

*/
import java.util.Scanner;

public class Uni04Exe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variáveis e Entradas:
        System.out.println("Insira um número para verificação de casas decimais");
        float nr_numero = sc.nextFloat();
        // Processos:
        if (nr_numero % 1 != 0) {
            // Saídas:
            System.out.println("Casas decimais foram digitadas.");
        } else {
            // Saídas:
            System.out.println("Casas decimais não foram digitadas.");
        }
        sc.close();
    }
}
/*
 * __ Valores de Testes:
 * _ Caso 1 ___
 * nr_numero = 100,50
 * imprimir("Casas decimais foram digitadas.")
 * _ Caso 2 ___
 * nr_numero = 999
 * imprimir("Casas decimais não foram digitadas.")
 */