import java.util.Scanner;

public class Uni04Exe12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean triangulo;
        System.out.println("Insira o primeiro lado");
        int nr_lado_1 = sc.nextInt();

        System.out.println("Insira o segundo lado");
        int nr_lado_2 = sc.nextInt();

        System.out.println("Insira o terceiro lado");
        int nr_lado_3 = sc.nextInt();

        if ((nr_lado_1 < (nr_lado_2 + nr_lado_3)) &&
        (nr_lado_2 < (nr_lado_1 + nr_lado_3)) &&
        (nr_lado_3 < (nr_lado_1 + nr_lado_2))) {
            triangulo = true;
        } else {
            System.out.println("Não formam um triângulo");
            triangulo = false;
        }
        if (triangulo == true) {
            if ((nr_lado_1 == nr_lado_2) && (nr_lado_2 == nr_lado_3)) {
                System.out.println("É equilatero");
            } else {
                if (((nr_lado_1 == nr_lado_2)) || ((nr_lado_2 == nr_lado_3)) || ((nr_lado_1 == nr_lado_3))) {
                    System.out.println("É isóceles");
                } else {
                    System.out.println("É escaleno");
                }
            }
        sc.close();
        }
    
    }
}
