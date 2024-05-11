package no1;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

//        System.out.print("Masukkan nama mahasiswa: ");
//        String nama = scanner.nextLine();
//        System.out.print("Masukkan kom mahasiswa: ");
//        String kom = scanner.nextLine();
//        System.out.print("Masukkan NIM mahasiswa: ");
//        String nim = scanner.nextLine();

//        Mahasiswa mahasiswa = new Mahasiswa(nama, kom, nim);
//
//        System.out.println("\nInformasi Mahasiswa:");
//        System.out.println("Nama: " + mahasiswa.getNama());
//        System.out.println("Nama: " + mahasiswa.getKom());
//        System.out.println("NIM: " + mahasiswa.getNim());

//        mahasiswa.printInfo();
//        mahasiswa.printInfo("Informasi Mahasiswa:");


        // Input nilai mahasiswa
        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUts = scanner.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUas = scanner.nextDouble();

        System.out.print("Masukkan Jumlah Kehadiran: ");
        int jlhKehadiran = scanner.nextInt();

        System.out.print("Masukkan Nilai Keaktifan: ");
        int keaktifan = scanner.nextInt();

        // Membuat objek NilaiMhs
        NilaiMhs nilaiMhs = new NilaiMhs(nilaiUts, nilaiUas, jlhKehadiran, keaktifan);

        // Memanggil method overload 1 untuk mencetak nilai akhir mahasiswa
        System.out.println("\nHasil dari method overload 1:");
        nilaiMhs.printNilai();

        // Memanggil method overload 2 untuk mengembalikan nilai akhir mahasiswa
        double nilaiAkhir = nilaiMhs.printNilai(nilaiUts, nilaiUas, jlhKehadiran, keaktifan);
        System.out.println("\nHasil dari method overload 2:");
        System.out.println("Nilai Akhir Mahasiswa: " + nilaiAkhir);

        scanner.close();

//        System.out.println("\nRepresentasi String Objek Mahasiswa:");
//        System.out.println(mahasiswa.toString());
    }
}