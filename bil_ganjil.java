package pboPet5;

import java.util.Scanner;
public class bil_ganjil {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlah, total = 0;

        System.out.print("Masukkan banyak angka: ");
        jumlah = input.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            int angka = (2 * i) - 1;

            System.out.print(angka + " ");
            total += angka;
        }

        System.out.println("\nTotal penjumlahan: " + total);

        input.close();
    }
}

