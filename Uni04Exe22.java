import java.util.Scanner;

public class Uni04Exe22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Programa de dúvida de título");
        System.out.println("Insira o número conforme seu curso: \n1 - Ciência da Computação \n2 - Licenciatura da Computação \n3 - Sistemas de Informação");
    
        int nr_escolha = sc.nextInt();

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
