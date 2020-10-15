public class Prak3_Lat8 {
    public static void main(String args[]) {
        String str1 = "Pemrograman";
        String str2 = "Java";
        String str3 = "PemrogramanJava";
        String str4 = "Universitas Syiah Kuala";
        String str5 = "universitas syiah kuala";

        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);
        System.out.println("String 3: " + str3);
        System.out.println("String 1= String 3 ==>" + str1.equals(str3));
        System.out.println("String 2 = String 3 ==>" + str2.equals(str3));
        System.out.println("String 1 + String 2 = String 3 ==>" + (str1 + str2).equals(str3));

        System.out.println("\nString 4:" + str4);
        System.out.println("String 5:" + str5);
        System.out.println("Perintah Pembandingan dibawah mengabaikan antara huruf besar dengan huruf kecil");
        System.out.println("String 4 = String 5 ==> " + str4.equalsIgnoreCase(str5));
        System.out.println(
                "String 4 + String 5 = String 5 + String 4 ==> " + (str4 + str5).equalsIgnoreCase(str5 + str4));

    }
}
/*
program java diatas merupakan program untuk membandingkan 
anatara string pada array 1 dan array 2
*/
