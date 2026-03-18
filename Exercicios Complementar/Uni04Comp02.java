/*

/*
__ Enunciado: 
Um sistema de monitoramento de TI verifica o status de um servidor através de 
códigos numéricos. O código 1 significa que o sistema está "OK". Escreva um 
algoritmo que leia um número inteiro representando o status atual. Se o status 
for diferente ('!=') de 1, o programa deve exibir o alerta: 
"ATENÇÃO: Sistema operando com instabilidade!"

__ Análise: ok
__ Gordura: Um sistema de Escreva um algoritmo que


__ Entradas: 
ler(st_server)

__ Processos: 
se st_server != 1 então
  imprimir "ATENÇÃO: Sistema operando com instabilidade!"
se não

__ Saídas: 
imprimir(msg)

*/


import java.util.Scanner;

public class Uni04Comp02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o código de status do Servidor:");
        byte st_server = sc.nextByte();
        if (st_server != 1) {
            System.out.println("ATENÇÃO: Sistema operando com instabilidade!");
        }
        sc.close();
    }
}
/*
__ Valores de teste __
----------------------
__ Caso 01 _____
st_server = 2
Saída = ATENÇÃO: Sistema operando com instabilidade!
----------------------
__ Caso 02 _____
st_server = 1
Saída = NULL
----------------------
*/