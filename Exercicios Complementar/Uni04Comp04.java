/*
__ Enunciado: 
Um portal de jogos educativos possui uma área de chat restrita para adolescentes. 
Para acessar, o usuário deve ter uma idade mínima. Escreva um programa que leia 
a idade do usuário e, caso ela seja maior ou igual ('>=') a 13 anos, 
exiba a mensagem: "Acesso ao chat liberado!".

__ Análise: OK
__ Gordura: Um portal de jogos Escreva um programa que


__ Entradas: 
ler(nr_idade)

__ Processos: 
se nr_idade >= 13 então
  imprimir "Acesso ao chat liberado!"
se não

__ Saídas: 
imprimir(msg)


*/

import java.util.Scanner;

public class Uni04Comp04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua idade:");
        byte nr_idade = sc.nextByte();
        if (nr_idade >= 13) {
            System.out.println("Acesso ao chat liberado!");
        }

        sc.close();
    }
}
/*
__ Valores de Teste __
----------------------
__ Caso 01 ____
nr_idade = 12
Saída = NULL
----------------------
__ Caso 02 ____
nr_idade = 14
Saída = NULL
----------------------
*/