/*
__Enunciado:

Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, 
escrever uma mensagem que indique se eles são TRIGÊMEOS, 
GÊMEOS, APENAS IRMÃOS. Considere que eles são GÊMEOS se 
dois deles possuem a mesma idade e o outro diferente dos demais, 
e apenas irmãos se todas as idades forem diferentes.

__Análise: OK

//___Gordura:
Escreva um algoritmo para 

//___Entradas:
ler(nr_idade_1)
ler(nr_idade_2)
ler(nr_idade_3)

//___Processos:

se ((nr_idade_1 == nr_idade_2) && 
(nr_idade_2 == nr_idade_3)) {
    imprimir("TRIGÊMEOS");

} se não se ((nr_idade_1 == nr_idade_3) &&
(nr_idade_1 != nr_idade_2) || (nr_idade_1 == nr_idade_2) && 
(nr_idade_1 != nr_idade_3) || (nr_idade_2 == nr_idade_3) && (nr_idade_3 != nr_idade_1)) {
    imprimir("GÊMEOS");
} senão {
    imprimir("APENAS IRMÃOS");
}

//___Saídas:
imprimir("TRIGÊMEOS")
OU  
imprimir("GÊMEOS")
OU
imprimir("APENAS IRMÃOS")
*/
import java.util.Scanner;

public class Uni04Exe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Entradas e Variáveis:
        System.out.println("Insira a idade do primeiro irmão");
        int nr_idade_1 = sc.nextInt();

        System.out.println("Insira idade do segundo irmão:");
        int nr_idade_2 = sc.nextInt();

        System.out.println("Insira a idade do terceiro irmão");
        int nr_idade_3 = sc.nextInt();

        // Processos:
        if (((nr_idade_1 == nr_idade_2) && 
        (nr_idade_2 == nr_idade_3))) {
            // Saídas:
            System.out.println("TRIGÊMEOS");

        } else if ((nr_idade_1 == nr_idade_3) &&  
        (nr_idade_1 != nr_idade_2) || (nr_idade_1 == nr_idade_2) && 
        (nr_idade_1 != nr_idade_3) || (nr_idade_2 == nr_idade_3) && (nr_idade_3 != nr_idade_1)) {
            // Saídas:
            System.out.println("GÊMEOS");
        } else {
            // Saídas:
            System.out.println("APENAS IRMÃOS");
        }
        sc.close();
    }
}
/*Valores de Testes:
 * _ Caso 1 ___
 * nr_idade_1 = 10
 * nr_idade_2 = 10
 * nr_idade_3 = 10
 * TRIGÊMEOS
 *
 * _ Caso 2 ___
 * nr_idade_1 = 15
 * nr_idade_2 = 15
 * nr_idade_3 = 20
 * GÊMEOS
 *
 * _ Caso 3 ___
 * nr_idade_1 = 25
 * nr_idade_2 = 30
 * nr_idade_3 = 35
 * APENAS IRMÃOS
 */