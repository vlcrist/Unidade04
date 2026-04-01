/*
__Enunciado:

__Análise:

//___Gordura:

//___Entradas:

//___Processos:

//___Saídas:
*/
import java.util.Scanner;

public class Uni04Exe19 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o valor de x:");
        int vl_x = sc.nextInt();

        System.out.println("Insira o valor de y:");
        int vl_y = sc.nextInt();
        
        if (vl_x == 0 && vl_y == 0) {
            System.out.println("Quadrante 0");
        } else if (vl_x > 0 && vl_y > 0) {
             System.out.println("Quadrante 1");
        } else if ( vl_x < 0 && vl_y > 0) {
             System.out.println("Quadrante 2");
        } else if (vl_x < 0 && vl_y < 0) {
            System.out.println("Quadrante 3");
        } else if (vl_x > 0 && vl_y < 0) {
            System.out.println("Quadrante 4");
        } else {}
        
        sc.close();

    }
              
}
        
