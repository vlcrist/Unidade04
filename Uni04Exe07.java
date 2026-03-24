import java.util.Scanner;

public class Uni04Exe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira o peso da carta:");
        double valorPagar = 0;
        double vl_peso = sc.nextInt();
        
        if (vl_peso <= 50) {
            valorPagar = 0.45;
        } else {
            double vl_peso_excedido = vl_peso - 50;

            double vl_adicional = (vl_peso_excedido / 20) + 1;
            valorPagar = 0.45f + 0.45f * vl_adicional;
        }
        System.out.println("Custo do selo: " + valorPagar);
        sc.close();
    }

}
