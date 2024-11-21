import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingresa un número >> ");
            int numero = scanner.nextInt();

            if (numero > 0) {
                System.out.println("Mayor que cero");
            }
            else if (numero == 0) {
                System.out.println("Igual a cero");
            }
            else if (numero < 0) {
                System.out.println("Menor a cero");
            }
        } finally {
            scanner.close();
        }
    }
}   
