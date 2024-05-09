package no1;

import java.util.Scanner;

class NilaiMhs {
    private static String jenisUjian;
    private static Integer nilaiUts;
    private static Integer nilaiUas;
    private double totalNilai;


    public static void printNilai() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jenis ujian : ");
        String jenisUjian = scanner.nextLine();
        System.out.println("Masukkan Nilai UTS : ");
        String nilaiUts = scanner.nextLine();
        System.out.println("Masukkan Nilai UAS : ");
        String nilaiUas = scanner.nextLine();
        if ("UTS".equals(jenisUjian)) {
            System.out.println("Nilai UTS: " + nilaiUts);
        } else if ("UAS".equals(jenisUjian)) {
            System.out.println("Nilai UAS: " + nilaiUas);
        } else {
            System.out.println("Mohon maaf inputan anda salah");
        }
    }

    public double printNilai(String Total) {
        totalNilai = (nilaiUas + nilaiUts) * 0.5;
        System.out.println(Total + totalNilai);
        return totalNilai; // Mengembalikan nilai totalNilai
    }
}

