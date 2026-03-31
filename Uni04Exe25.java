import java.util.Scanner;

public class Uni04Exe25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nr_resultado = 0;

        System.out.println("Algoritmo de cálculos matemáticos");

        System.out.println("Insira dois valores para continuar:");
        int vl_1 = sc.nextInt();
        int vl_2 = sc.nextInt();

        System.out.println("Escolha uma opção:\r\n" + //
                        "1 - Soma de dois números.\r\n" + //
                        "2 - Diferença entre dois números.\r\n" + //
                        "3 - Produto entre dois números.\r\n" + //
                        "4 - Divisão entre dois números (o denominador não pode ser zero).\r\n"
                        );
        int nr_escolha = sc.nextInt();
        

        switch (nr_escolha) {
        case 1:
            nr_resultado = vl_1 + vl_2;
            System.out.println(nr_resultado);
        break;

        case 2:
            nr_resultado = vl_1 - vl_2;
            System.out.println(nr_resultado);
        break;

        case 3:
            nr_resultado = vl_1 * vl_2;
            System.out.println(nr_resultado);
        break;

        case 4:
            nr_resultado = vl_1 / vl_2;
            System.out.println(nr_resultado);
        break;    
        
        default:
            System.out.println("Selecione um valor válido");       
            break;
        }
        sc.close();
    }
}
