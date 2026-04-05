/*
__Enunciado:

Um aluno está em dúvida sobre o título que vai receber após concluir seu 
curso de graduação. Considerando que o sistema apresenta 3 cursos disponíveis 
(1 – Ciência da Computação, 2 – Licenciatura da Computação e 3 – Sistemas de Informação) 
descreva um algoritmo para ler a opção do aluno e escrever uma mensagem informando 
o título que o aluno vai receber caso opte por aquele curso. As titulações são respectivamente: 
"Bacharel em Ciência da Computação", "Licenciado em Computação" e "Bacharel em Sistemas de Informação".

__Análise: OK

//___Gordura:

Um aluno está em dúvida sobre o título que vai receber após concluir seu 
curso de graduação descreva um algoritmo para

//___Entradas:

ler(nr_escolha)

//___Processos:

caso (nr_escolha == 1) então
    escreva("Bacharel em Ciência da Computação")
caso (nr_escolha == 2) então
    escreva("Licenciado em Computação")
caso (nr_escolha == 3) então
    escreva("Bacharel em Sistemas de Informação")

//___Saídas:

imprimir("Bacharel em Ciência da Computação")
OU
imprimir("Licenciado em Computação")
OU
imprimir("Bacharel em Sistemas de Informação")

*/
import java.util.Scanner;

public class Uni04Exe22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa de dúvida de título");
        
         // Variáveis e Entradas:
        System.out.println("Insira o número conforme seu curso: \n1 - Ciência da Computação \n2 - Licenciatura da Computação \n3 - Sistemas de Informação");
        int nr_escolha = sc.nextInt();

         // Processos E Saídas:
        switch (nr_escolha) {
        case 1:
        System.out.println("Bacharel em Ciência da Computação");
        break;
        case 2:
        System.out.println("Licenciado em Computação");
        break;
        case 3:
        System.out.println("Bacharel em Sistemas de Informação");
        }
        sc.close();
    }   
}
 /*
 Valores de teste:
 __ Caso 01 ___
 nr_escolha = 1
 imprimir("Bacharel em Ciência da Computação")
__ Caso 02 ___
 nr_escolha = 2
 imprimir("Licenciado em Computação")
__ Caso 03 ___
 nr_escolha = 3
 imprimir("Bacharel em Sistemas de Informação")
 */