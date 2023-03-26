/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TeamAssigment2;

import java.util.Scanner;

/**
 *
 * @author adam
 */
public class TeamAssigment2 {

    public static void main(String[] args) {
        
        String loop = "Y";
        
        while (loop.equals("Y")) {            
            
        System.out.println(" ");
        System.out.println("============================================================");
        System.out.println("=          Selamat Datang DiProgram Deret Bilangan         =");
        System.out.println("============================================================");
        System.out.println(" ");
        Scanner objNama = new Scanner(System.in);
        System.out.print("Masukkan Nama Anda (1 - 25 Digit) :   ");
        String nama = objNama.nextLine();

        while (nama.length() > 25 && nama.length() < 1) {
            nama = null;
            System.out.println("Nama yang anda masukan tidak sesuai kriteria, silahkan masukkan ulang nama anda !");
            System.out.print("Masukan Nama Anda (1 - 25) Huruf :   ");
            nama = objNama.nextLine();
        }

        Scanner objNIM = new Scanner(System.in);
        System.out.print("Masukkan NIM Anda (Harus 10 Digit) :   ");
        String nim = objNIM.nextLine();

        while (nim.length() != 10) {
            nim = null;
            System.out.println("NIM yang anda lakukan tidak sesuai ketentuan, silahkan masukkan ulang NIM anda !");
            System.out.print("Masukkan NIM Anda (Harus 10 Digit) :   ");
            nim = objNIM.nextLine();
        }

        System.out.println(" ");
        System.out.println("===========================================================");
        System.out.println("Selamat Datang " + nama + "(NIM : " + nim + " )");
        System.out.println("Mari belajar macam-macam deret bilangan !");
        System.out.println("===========================================================");
        System.out.println(" ");
        Scanner objAngka = new Scanner(System.in);
        System.out.print("Masukkan Angka Random (Antara 5 - 20) :   ");
        int angka = objAngka.nextInt();
        System.out.println(" ");
        System.out.println("===========================================================");
        System.out.println(" ");
        System.out.println("Deret Bilangan");
        System.out.println(" ");
        System.out.println(angka + " Bilangan Genap :");
        
        int fakGenap = 0;
        for (int i = 1; i <= angka * 2; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                fakGenap = fakGenap + i;
            }
        }
        System.out.println(" ");
        System.out.println("Hasil Penjumlahan : " +fakGenap);
        

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(angka + " Bilangan Ganjil :");
        int fakGanjil = 0;
        for (int i = 1; i <= angka * 2; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                fakGanjil = fakGanjil + i;
            }
        }
        System.out.println(" ");
        System.out.println("Hasil Penjumlahan : " +fakGanjil);

        System.out.println(" ");
        System.out.println(" ");
        System.out.println(angka + " Bilangan Fibonacci : ");
        int a = 0, b = 1, result = 0;
        for (int i = 1; i <= angka; i++) {
            a = b;
            b = result;
            System.out.print(result + " ");
            result = a + b;
        }
        int faktorialFibo = result;
        faktorialFibo = result + faktorialFibo;
        System.out.println("");
        System.out.println("Hasil Penjumlahan = " + faktorialFibo);

        System.out.println(" ");
        System.out.println(" ");
        Scanner objSwitch = new Scanner(System.in);
        System.out.print("Apakah anda ingin mengulang program ini (y/t): " + " ");
        loop = objSwitch.nextLine().toUpperCase();
        }
        
        System.out.println("Terima Kasih Telah Belajar Bersama Kami !");
        System.exit(0);
    }
}
