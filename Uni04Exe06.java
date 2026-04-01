/*
__Enunciado:

Faça um algoritmo que leia um caractere. 
Caso seja digitada a letra 'M' escreva “Masculino”. 
Se for digitada a letra 'F' escreva “Feminino”. 
Se for informado 'I' escreva “Não Informado”. 
Qualquer outra letra digitada escreva “Entrada Incorreta”. 
Atenção: antes de testar a letra, converta-a para maiúscula.

__Análise: OK

//___Gordura:
Faça um algoritmo que

//___Entradas:
ler(ds_genero)

//___Processos:
se (ds_genero == 'M') {
    imprimir("Masculino");
} se (ds_genero == 'F') {
    imprimir("Feminino");
} se (ds_genero == 'I') {
    imprimir("Não informado");
} se não {
    imprimir("Entrada incorreta");
}

//___Saídas:
imrpimir("Masculino")
OU
imprimir("Feminino")
OU
imprimir("Não informado")
OU
imprimir("Entrada incorreta")

*/
import java.util.Scanner;

public class Uni04Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Entradas e Variáveis:
        System.out.println("Insira um caracter conforme os seguintes: \nM - Masculino\nF - Feminino\nI - Não informado");
        char ds_genero = sc.next().toUpperCase().charAt(0);

        // Processos:
        if (ds_genero == 'M') {
            // Saídas:
            System.out.println("Masculino");
        } else if (ds_genero == 'F') {
            // Saídas:
            System.out.println("Feminino");
        } else if (ds_genero == 'I') {
            // Saídas:
            System.out.println("Não informado");
        } else {
            // Saídas:
            System.out.println("Entrada incorreta");
        }
        
        sc.close();
    }
}
/*
 * __ Valores de Testes:
 * _ Caso 1 ___
 * ds_genero = 'M'
 * imprimir("Masculino");
 * _ Caso 2 ___
 * ds_genero = 'F'
 * imprimir("Feminino");
 * _ Caso 3 ___
 * ds_genero = 'I'
 * imprimir("Não informado");
 * _ Caso 4 ___
 * ds_genero = 'X'
 * imprimir("Entrada incorreta");
 */