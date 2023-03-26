import java.util.Scanner;

public class RepetitionAlgorithm {
    public static void main(String[] args) {
        try (Scanner Input = new Scanner(System.in)) {

            /*
             * Contoh Inputan
             * Nama: Karto
             * NIM: 1200012345
             * Sembarang Angka: 20
             */
            
            // 1.a Menginputkan Nama user.
            System.out.print("Masukkan Nama Anda [1..25] : ");
            String Nama = Input.next();

            // 1.b Validasikan banyak karakter dari Nama yang diinput minimal 1 dan maksimal 25.
            while (Nama.length() < 1 || Nama.length() > 25) {
                // \n simbol untuk spasi baris
                System.out.println("\nNama harus diantara 1 - 25 karakter\n");
                System.out.print("Masukkan Nama Anda [1..25] : ");
                Nama = Input.next();
            }

            // 2.a Menginputkan NIM user. (sebagai string `karakter`)
            System.out.print("Masukkan NIM Anda [harus 10 karakter] : ");
            String NIM = Input.next();

            // 2.b Validasikan banyak karakter dari Nim yang diinput harus 10 karakter.
            while (NIM.length() != 10) {
                System.out.println("\nNIM harus 10 karakter\n");
                System.out.print("Masukkan NIM Anda [harus 10 karakter] : ");
                NIM = Input.next();
            }

            System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
            System.out.println("Registrasi Sukses..");
            System.out.println("Selamat datang " + Nama + " [NIM: " + NIM + "].. ^^v\n");
            System.out.println("Mari belajar macam-macam deret bilangan..");

            System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");

            while(true) {
                // 3.a Menginputkan Jumlah Angka user.
                System.out.print("Masukan Sembarang Angka [5..20] : ");
                int JumlahAngka = Input.nextInt();

                // 3.b Validasikan Jumlah Angka yang diinput minimal 5 dan maksimal 20.
                while (JumlahAngka < 5 || JumlahAngka > 20) {
                    System.out.println("\nJumlah angka harus diantara minimal 5 - 20 maksimal\n");
                    System.out.print("Masukan Sembarang Angka [5..20] : ");
                    JumlahAngka = Input.nextInt();
                }

                System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");

                System.out.println("Deret Bilangan");
                System.out.println("###############\n");

                // 4.a Tampilkan Deret Bilangan Genap, Bilangan Ganjil
                int MulaiAngkaGanjil = 1;
                int MulaiAngkaGenap = 2;

                String DeretBilanganGenap = "";
                String DeretBilanganGanjil = "";

                int HasilPenjumlahanBilanganGenap = 0;
                int HasilPenjumlahanBilanganGanjil = 0;

                for (int i = 1; i <= JumlahAngka; i++) {
                    // 4.a.1 Bilangan Genap
                    DeretBilanganGenap += MulaiAngkaGenap + " ";
                    HasilPenjumlahanBilanganGenap += MulaiAngkaGenap;
                    MulaiAngkaGenap += 2;

                    // 4.a.2 Bilangan Ganjil
                    DeretBilanganGanjil += MulaiAngkaGanjil + " ";
                    HasilPenjumlahanBilanganGanjil += MulaiAngkaGanjil;
                    MulaiAngkaGanjil += 2;
                }

                System.out.println(JumlahAngka + " Bilangan Gelap : ");
                System.out.println(DeretBilanganGenap);
                System.out.println("Hasil Penjumlahan : " + HasilPenjumlahanBilanganGenap + "\n");

                System.out.println(JumlahAngka + " Bilangan Ganjil : ");
                System.out.println(DeretBilanganGanjil);
                System.out.println("Hasil Penjumlahan : " + HasilPenjumlahanBilanganGanjil + "\n");

                // 4.b Bilangan Fibonacci sesuai dengan Jumlah Angka yang diinput
                // Fn + 1 = Fn – 1  + Fn
                int n1 = 1;
                int n2 = 1;
                String DeretBilanganFibonacci = "";
                int HasilPenjumlahanBilanganFibonaci = 0;

                for (int i = 1; i <= JumlahAngka; i++) {
                    DeretBilanganFibonacci += n1 + " ";
                    HasilPenjumlahanBilanganFibonaci += n1;
                    int n3 = n1 + n2;
                    n1 = n2;
                    n2 = n3;
                }                

                System.out.println(JumlahAngka + " Bilangan Fibonacci : ");
                System.out.println(DeretBilanganFibonacci);
                System.out.println("Hasil Penjumlahan : " + HasilPenjumlahanBilanganFibonaci + "\n");

                // 5.a Program akan meminta inputan dari user untuk mengulang perhitungan.
                System.out.print("Anda ingin mengulang [y/t] : ");
                // 5.c Jika user memilih ‘T’ atau ‘t’,  maka program akan berakhir.
                String MengulangProgram = Input.next();
                if (MengulangProgram.equalsIgnoreCase("t")) {
                    // equalsIgnoreCase() returns true regardless of cases of strings.
                    break;
                }
                // 5.b Jika user memilih ‘Y’ atau ‘y’, maka program akan berulang.
                //...
            }
        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
    }
}
