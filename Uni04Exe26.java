import java.util.Scanner;

public class Uni04Exe26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double vl_base;
        double vl_altura;
        double vl_lado;
        double vl_raio;

        System.out.println("Escolha uma opção:");
        System.out.println("Opção 'T': Calcular a área de um triângulo de base b e altura h\r\n" + 
                        "Opção = 'Q': Calcular a área de um quadrado de lado l\r\n" + 
                        "Opção = 'R': Calcular a área de um retângulo de base b e altura h\r\n" + 
                        "Opção = 'C': Calcular a área de um círculo de raio r");
        
        char ds_opcao = sc.next().toUpperCase().charAt(0);
        
        switch (ds_opcao) {
        case 'T':
            System.out.println("Digite a base a altura do triângulo");    
            vl_base = sc.nextDouble();
            vl_altura = sc.nextDouble();
            System.out.printf("Área do triângulo = %.2f", (vl_base * vl_altura) / 2);
            break;
        
        case 'Q':
            System.out.println("Digite o lado do quadrado:");
            vl_lado = sc.nextDouble();
            System.out.printf("Área do quadrado = %.2f",  vl_lado * vl_lado);
            break;
        
        case 'R':
            System.out.println("Digite a base e a altura do retângulo:");
            vl_base = sc.nextDouble();
            vl_altura = sc.nextDouble();
            System.out.printf("Área do triângulo = %.2f", vl_base * vl_altura);
            break;
        
        case 'C':
            System.out.println("Digite o raio da circunferência:");
            vl_raio = sc.nextDouble();
            System.out.printf("Área do círculo = %.2f", Math.PI * Math.pow(vl_raio, 2));
            break;
            
        default:
            System.out.println("Opção inválida.");
            break;
        }
        sc.close();
    }
}
