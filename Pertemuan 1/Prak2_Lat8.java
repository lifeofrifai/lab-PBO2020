import java.util.Scanner;
public class Prak2_Lat8 {
    public static void main(String[] args) {
        int age = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan umur anda:");
        age = sc.nextInt();
        if (age >= 17)
            System.out.print("Anda sudah boleh buat KTP");
    }

}
/* program seleksi if di java */
