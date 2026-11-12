
package pboPet5;

import java.util.Scanner;

public class Bilangan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka, terbesar, terkecil;

        System.out.println("Masukkan bilangan ke-1: ");
        angka = input.nextInt();

        terbesar = angka;
        terkecil = angka;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Masukkan bilangan ke-" + i + ": ");
            angka = input.nextInt();

            if (angka > terbesar) {
                terbesar = angka;
            }

            if (angka < terkecil) {
                terkecil = angka;
            }
        }

        System.out.println("Bilangan terbesar: " + terbesar);
        System.out.println("Bilangan terkecil: " + terkecil);

        input.close();
    }
}

