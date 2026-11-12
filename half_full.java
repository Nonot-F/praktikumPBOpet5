package pboPet5;

  import java.util.Scanner;

public class half_full {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tinggi;

        System.out.print("Masukkan tinggi segitiga: ");
        tinggi = input.nextInt();

        System.out.println("\nHalf Triangle:");

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\nFull Triangle:");

        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= (2 * tinggi - 2 * i + 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        input.close();
    }
}

