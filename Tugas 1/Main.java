/**
 *
 * @author (Muhammad Nurifai) 
 * @NIM (1908107010057)
 */

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int menu;

        Bus labiLabi = new Bus();

        do {
            System.out.println("-------------------------------------");
            System.out.println("|        LABI-LABI BANG JONI        |");
            System.out.println("-------------------------------------\n");
            System.out.println("MENU :");
            System.out.println("1. Naikkan Penumpang");
            System.out.println("2. Turunkan Penumpang");
            System.out.println("3. Lihat Penumpang");
            System.out.println("4. Keluar");
            System.out.print("\nPilihan : ");
            menu = scan.nextInt();

            if (menu == 1) {
                System.out.print("Masukan Nama : ");
                String nama = scan.next();
                System.out.print("Masukan Umur : ");
                int umur = scan.nextInt();
                System.out.print("Apakah Hamil (y/n) : ");
                Boolean hamil = new Scanner(System.in).nextLine().equalsIgnoreCase("y") ? true : false;

                Penumpang penumpang = new Penumpang(nama, umur, hamil);
                labiLabi.naikPenumpang(penumpang);
                labiLabi.toString();
            } else if (menu == 2) {
                System.out.print("Masukan Nama : ");
                String nama = scan.next();
                labiLabi.turunkanPenumpang(nama);
                labiLabi.toString();
            } else if (menu == 3) {
                labiLabi.toString();
            } else if (menu > 4) {
                System.out.println("Menu Tidak Tersedia\n");
            }
        } while (menu != 4);

        System.out.println("Terima Kasih Telah Menaiki Labi-Labi Bang Joni");


    }
}
