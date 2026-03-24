import java.util.Scanner;

public class Uni04Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Identificador de vogais.\nInsira uma letra:");
        char ds_letra = sc.next().toUpperCase().charAt(0);

        if (ds_letra == 'A' || ds_letra == 'E' || ds_letra == 'I' || ds_letra == 'O' || ds_letra == 'U') {
            System.out.println("É vogal");
        } else {
            System.out.println("NÃO é vogal");
        }
        sc.close();
    } 
}