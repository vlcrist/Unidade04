import java.util.Scanner;

public class Uni04Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a idade do Marquinhos:");
        int nr_idade_marquinhos = sc.nextInt();

        System.out.println("Insira a idade do Zezinho:");
        int nr_idade_zezinho = sc.nextInt();

        System.out.println("Insira a idade da Luluzinha:");
        int nr_idade_luluzinha = sc.nextInt();

        if ((nr_idade_marquinhos < nr_idade_zezinho) && 
        (nr_idade_marquinhos < nr_idade_luluzinha)) {
            System.out.println("O Marquinhos é o caçula.");

        } else if ((nr_idade_zezinho < nr_idade_marquinhos) && 
        (nr_idade_zezinho < nr_idade_luluzinha)) {
            System.out.println("O Zezinho é o caçula.");
        } else {
            System.out.println("A Luluzinha é a caçula.");
        }
        sc.close();
    }
}
