import java.util.Scanner;

public class Uni04Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira um caracter conforme os seguintes: \nM - Masculino\nF - Feminino\nI - Não informado");
        char ds_genero = sc.next().toUpperCase().charAt(0);

        if (ds_genero == 'M') {
            System.out.println("Masculino");
        } else if (ds_genero == 'F') {
            System.out.println("Feminino");
        } else if (ds_genero == 'I') {
            System.out.println("Não informado");
        } else {
            System.out.println("Entrada incorreta");
        }
        
        sc.close();
    }
}
