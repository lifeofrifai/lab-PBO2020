
    DESKRIPSI PROGRAM

Program ini merupakan program sederhana untuk mengelola penumpang di Labi-Labi bang Joni  dengan ketentuan:
1.	Bus hanya memiliki 6 kursi penumpang, yang terdiri dari 4 kursi penumpang biasa dan 2 kursi prioritas.
2.	Kursi prioritas hanya dapat diisi oleh orang-orang berikut : 
	Lansia : umur lebih dari 60 tahun 
	Anak-anak : umur kurang dari 10 tahun 
	Dan Ibu hamil
3.	Penumpang biasa dilarang duduk di kursi prioritas
4.	Penumpang prioritas boleh duduk di kursi biasa jikalau kursi prioritas sudah penuh
5.	Penumpang tidak bisa lagi menaiki bus jika bus sudah penuh.

    DESKRIPSI CLASS
1. Class Penumpang
    + Class ini mewakili entitas penumpang bus Satu objek penumpang mewakili satu penumpang
    + Setiap penumpang mempunyai attribut nama, umur, dan status hamil
    + Method Penumpang() merupakan method constructor yang akan memberikan nilai awal kepada attribute.
    + Method getNama(), getUmur(), dan getHamil() adalah method accessor yang mengembalikan nilai yang diminta.

2. Class Bus
    + Class ini mewakili bus
    + Class ini memiliki attribute berupa objek dari Class Penumpang
    + Attribute penumpangBasa berisi penumpang biasa (minimal 0, maksimal 4)
    + Attribute penumpangPrioritas berisi penumpang prioritas (minimal 0, maksimal 2)
    + Method getPenumpang….() mengembalikan list penumpang yang diminta.
    + Method getJumlahPenumpang….() mengembalikan jumlah penumpang yang diminta.
    + Method NaikPenumpang() berfungsi untuk menambahkan penumpang ke dalam Bus (jika ada kursi untuk penumpang tsb). Method ini mengembalikan true jika penumpang
        berhasil naik dan menambahkan penumpang tsb ke dalam Array penumpang, dan mengembalikan false jika penumpang tidak bias naik.
    + Method turunkanPenumpang(nama) menerima parameter nama penumpag. Jika nama penumpang ditemukan, maka hapus penumpang tersebut dari Array penumpang dan
        kembalikan nilai true. Sebaliknya, kembalikan false.
    + Method toString() untuk mencetak daftar nama Penumpang Biasa, Penumpang Prioritas, dan Jumlah semua penumpang.

3. Class Main
    + Pada method main() dideklarasikan sebuah objek Bus. Pada method ini anda akan mensimulasikan proses naik dan turunnya penumpang dari bus.


HOW TO RUN
1. Clone Repository
    $ git clone https://github.com/lifeofrifai/lab-PBO2020.git

2. Compile The Code
    $ javac Main.java

3. Run The Code
    $ java Main

4. Enjoy The Bus