package no1;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama mahasiswa: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan kom mahasiswa: ");
        String kom = scanner.nextLine();
        System.out.print("Masukkan NIM mahasiswa: ");
        String nim = scanner.nextLine();

        Mahasiswa mahasiswa = new Mahasiswa(nama, kom, nim);

        // Input nilai mahasiswa
        System.out.print("Masukkan Nilai UTS: ");
        double nilaiUts = scanner.nextDouble();

        System.out.print("Masukkan Nilai UAS: ");
        double nilaiUas = scanner.nextDouble();

        System.out.print("Masukkan Jumlah Kehadiran(1-10): ");
        int jlhKehadiran = scanner.nextInt();

        System.out.print("Masukkan Nilai Keaktifan(1-100): ");
        int keaktifan = scanner.nextInt();

        // Membuat objek NilaiMhs
        NilaiMhs nilaiMhs = new NilaiMhs(nilaiUts, nilaiUas, jlhKehadiran, keaktifan);


        System.out.println("\nInformasi Mahasiswa:");
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("Nama: " + mahasiswa.getKom());
        System.out.println("NIM: " + mahasiswa.getNim());

        // Memanggil method overload 1 untuk mengembalikan nilai akhir mahasiswa
        double nilaiAkhir = nilaiMhs.printNilai(nilaiUts, nilaiUas, jlhKehadiran, keaktifan);
        System.out.println("Nilai Akhir Mahasiswa: " + nilaiAkhir);

        // Memanggil method overload 2 untuk mencetak kategori nilai akhir mahasiswa
        System.out.println("\nKategori Nilai Akhir:");
        nilaiMhs.printNilai();
        nilaiMhs.printKelulusan();
        scanner.close();


    }
}