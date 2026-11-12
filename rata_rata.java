
package pboPet5;

import java.util.Scanner;

public class rata_rata {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah;
        double angka, total = 0, rataRata;

        System.out.print("Masukkan jumlah bilangan: ");
        jumlah = input.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            angka = input.nextDouble();

            total += angka;
        }

        rataRata = total / jumlah;

        System.out.println("Total jumlah bilangan: " + total);
        System.out.println("Rata-rata: " + rataRata);

        input.close();
    }
}
