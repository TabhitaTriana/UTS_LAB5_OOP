package no1;

public class NilaiMhs extends Mahasiswa{
    private double nilaiUts;
    private double nilaiUas;
    private double hitungNilaiAkhir;
    private int jlhKehadiran;
    private int keaktifan;
    
    public NilaiMhs(){
        this.nilaiUts = 0;
        this.nilaiUas = 0;
        this.jlhKehadiran = 0;
        this.keaktifan = 0;
    }

    public NilaiMhs(double nilaiUts, double NilaiUas, int jlhKehadiran, int keaktifan){
         this.nilaiUts = nilaiUts;
         this.nilaiUas = nilaiUas;
         this.jlhKehadiran = jlhKehadiran;
         this.keaktifan = keaktifan;
    }

    public double hitungNilaiAkhir(){
        double nilaiKehadiran = jlhKehadiran * 10;
        double totalNilai = nilaiUts + nilaiUas + nilaiKehadiran + keaktifan;
        return totalNilai/4;
    }
    public double printNilai(double nilaiUts, double nilaiUas, int jlhKehadiran, int keaktifan){
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
        this.jlhKehadiran = jlhKehadiran;
        this.keaktifan = keaktifan;

        return hitungNilaiAkhir();
    }
    public void printNilai(){
        double nilaiAkhir = hitungNilaiAkhir();

        // Menentukan kategori nilai berdasarkan nilai akhir dan langsung menampilkannya
        if (nilaiAkhir >= 80) {
            System.out.println("Nilai Akhir Mahasiswa : (A)");
        } else if (nilaiAkhir >= 70) {
            System.out.println("Nilai Akhir Mahasiswa : (B)");
        } else if (nilaiAkhir >= 60) {
            System.out.println("Nilai Akhir Mahasiswa : (C)");
        } else if (nilaiAkhir >= 50) {
            System.out.println("Nilai Akhir Mahasiswa : (D)");
        } else {
            System.out.println("Nilai Akhir Mahasiswa : (E)");
        }
    }
    public void printKelulusan() {
        double nilaiAkhir = hitungNilaiAkhir();

        if (nilaiAkhir >= 60) {
            System.out.println("Mahasiswa Lulus");
        } else {
            System.out.println("Mahasiswa Tidak Lulus");
        }
    }

}

