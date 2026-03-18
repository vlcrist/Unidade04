/*

__ Enunciado: Uma loja virtual deseja dar um brinde para categorias específicas de clientes. 
Escreva um programa que leia um caractere representando o tipo de cupom 
('S' para Especial, 'C' para Comum). Se o cupom for igual ('==') a 'S', 
o programa deve exibir a mensagem: "Cupom validado! Você ganhou um adesivo exclusivo."

__ Análise:  OK
__ Gordura: Uma loja virtual deseja dar um brinde para categorias específicas de clientes Escreva um programa que


__ Entradas: 
ler(tp_cupom)

__ Processos: 
se tp_cupom == S
    imprimir("Cupom validado! Você ganhou um adesivo exclusivo.")
se não

__ Saídas: 
imprimir(mensagem_condicao)
*/

import java.util.Scanner;

public class Uni04Comp01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu cupom de desconto:");
        char tp_cupom = sc.next().toUpperCase().charAt(0);

        if (tp_cupom == 'S') {
            System.out.println("Cupom validado! Você ganhou um adesivo exclusivo.");
        }
        sc.close();
    }
}

/*
__ Valores de teste __
----------------------
__ Caso 01 _____
tp_cupom = S
Saída = Cupom validado! Você ganhou um adesivo exclusivo.
----------------------
__ Caso 02 _____
tp_cupom = C
Saída = NULL
----------------------
*/