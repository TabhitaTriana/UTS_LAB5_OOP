package no1;

// Deklarasi kelas NilaiMhs yg merupakan subclass dari Mahasiswa
public class NilaiMhs extends Mahasiswa{
    private double nilaiUts;
    private double nilaiUas;
    private double hitungNilaiAkhir;
    private int jlhKehadiran;
    private int keaktifan;

    // Default Constructur
    public NilaiMhs(){
        this.nilaiUts = 0;
        this.nilaiUas = 0;
        this.jlhKehadiran = 0;
        this.keaktifan = 0;
    }

    // Constructur dengan Parameter
    public NilaiMhs(double nilaiUts, double NilaiUas, int jlhKehadiran, int keaktifan){
         this.nilaiUts = nilaiUts;
         this.nilaiUas = nilaiUas;
         this.jlhKehadiran = jlhKehadiran;
         this.keaktifan = keaktifan;
    }

    // Method untuk menghitung dan mengembalikan nilai akhir
    public double hitungNilaiAkhir(){
        double nilaiKehadiran = jlhKehadiran * 10;
        double totalNilai = nilaiUts + nilaiUas + nilaiKehadiran + keaktifan;
        return totalNilai/4;
    }

    // Overloading untuk menghitung dan mengembalikan nilai akhir
    public double printNilai(double nilaiUts, double nilaiUas, int jlhKehadiran, int keaktifan){
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
        this.jlhKehadiran = jlhKehadiran;
        this.keaktifan = keaktifan;

        return hitungNilaiAkhir();
    }

    // Overloading untuk mencetak nilai akhir dan kategori nilai
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

    // Method untuk mencetak status kelulusan
    public void printKelulusan() {
        double nilaiAkhir = hitungNilaiAkhir();

        if (nilaiAkhir >= 60) {
            System.out.println("Mahasiswa Lulus");
        } else {
            System.out.println("Mahasiswa Tidak Lulus");
        }
    }

}

