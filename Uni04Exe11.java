import java.util.Scanner;

public class Uni04Exe11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira a idade do primeiro irmão");
        int nr_idade_1 = sc.nextInt();

        System.out.println("Insira idade do segundo irmão:");
        int nr_idade_2 = sc.nextInt();

        System.out.println("Insira a idade do terceiro irmão");
        int nr_idade_3 = sc.nextInt();

        if (((nr_idade_1 == nr_idade_2) && 
        (nr_idade_2 == nr_idade_3))) {
            System.out.println("TRIGÊMEOS");

        } else if ((nr_idade_1 == nr_idade_3) &&  
        (nr_idade_1 != nr_idade_2) || (nr_idade_1 == nr_idade_2) && 
        (nr_idade_1 != nr_idade_3) || (nr_idade_2 == nr_idade_3) && (nr_idade_3 != nr_idade_1)) {
            System.out.println("GÊMEOS");
        } else {
            System.out.println("APENAS IRMÃOS");
        }
        sc.close();
    }
}
