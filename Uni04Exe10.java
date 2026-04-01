/*
__Enunciado:

Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. 
Faça um algoritmo para ler as idades dos filhos e
exibir quem é o caçula da família; suponha que não haja empates.

__Análise: OK

//___Gordura:
Faça um algoritmo para

//___Entradas:
ler(nr_idade_marquinhos)
ler(nr_idade_zezinho)
ler(nr_idade_luluzinha)

//___Processos:

//___Saídas:
*/
import java.util.Scanner;

public class Uni04Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Entradas e Variáveis:
        System.out.println("Insira a idade do Marquinhos:");
        int nr_idade_marquinhos = sc.nextInt();

        System.out.println("Insira a idade do Zezinho:");
        int nr_idade_zezinho = sc.nextInt();

        System.out.println("Insira a idade da Luluzinha:");
        int nr_idade_luluzinha = sc.nextInt();

        // Processos:
        if ((nr_idade_marquinhos < nr_idade_zezinho) && 
        (nr_idade_marquinhos < nr_idade_luluzinha)) {
            // Saídas:
            System.out.println("O Marquinhos é o caçula.");

        } else if ((nr_idade_zezinho < nr_idade_marquinhos) && 
        (nr_idade_zezinho < nr_idade_luluzinha)) {
            // Saídas:
            System.out.println("O Zezinho é o caçula.");
        } else {
            // Saídas:
            System.out.println("A Luluzinha é a caçula.");
        }
        sc.close();
    }
}
/* Valores de Testes:
 * _ Caso 1 ___
 * nr_idade_marquinhos = 10
 * nr_idade_zezinho = 15
 * nr_idade_luluzinha = 20
 * O Marquinhos é o caçula.
 *
 * _ Caso 2 ___
 * nr_idade_marquinhos = 25
 * nr_idade_zezinho = 15
 * nr_idade_luluzinha = 20
 * O Zezinho é o caçula.
 *
 * _ Caso 3 ___
 * nr_idade_marquinhos = 30
 * nr_idade_zezinho = 25
 * nr_idade_luluzinha = 20
 * A Luluzinha é a caçula.
 */