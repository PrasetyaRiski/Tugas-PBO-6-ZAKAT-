/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean lanjutProgram = true;

        System.out.println("Program Kalkulator Zakat Maal (By Prasetya Riski Wa'afan)");

        while (lanjutProgram) {
            // Input untuk Muzaki
            System.out.print("Masukkan nama Muzaki: ");
            String namaMuzaki = scanner.nextLine();

            System.out.print("Masukkan jenis harta (Uang, Emas, Perak): ");
            String jenisHarta = scanner.nextLine();

            System.out.print("Masukkan jumlah harta: ");
            double jumlahHarta = scanner.nextDouble();
            scanner.nextLine();

            Muzaki muzaki = new Muzaki(namaMuzaki, jumlahHarta, jenisHarta);

            // Menghitung zakat
            double zakat = muzaki.hitungZakat();
            if (zakat > 0) {
                System.out.printf("Jumlah zakat yang harus dibayar oleh %s adalah: %.2f\n", muzaki.getNama(), zakat);
            } else {
                System.out.println("Jumlah harta belum mencapai nisab. Tidak wajib zakat.");
            }

            System.out.print("Masukkan nama Penerima Zakat: ");
            String namaPenerima = scanner.nextLine();

            Penerima penerima = new Penerima(namaPenerima);
            System.out.printf("Zakat akan diberikan kepada %s sebanyak %.2f\n", penerima.getNama(), zakat);


            System.out.print("Apakah Anda ingin menghitung zakat untuk Muzaki lain? (y/n): ");
            String jawaban = scanner.nextLine();

            if (!jawaban.equalsIgnoreCase("y")) {
                lanjutProgram = false;
                System.out.println("Terima kasih telah menggunakan Program Kalkulator Zakat Maal.");
            }
        }

        scanner.close();
    }
}
