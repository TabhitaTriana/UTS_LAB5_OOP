package no1;

public class NilaiMhs {
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

//    public double printNilai(){
//        double totalNilai = hitungNilaiAkhir();
//        System.out.println("Nilai Akhir Mahasiswa : " + totalNilai);
//        return totalNilai;
//    }

    public double printNilai(double nilaiUts, double nilaiUas, int jlhKehadiran, int keaktifan){
          this.nilaiUts = nilaiUts;
          this.nilaiUas = nilaiUas;
          this.jlhKehadiran = jlhKehadiran;
          this.keaktifan = keaktifan;

          return hitungNilaiAkhir();
    }
    private double hitungNilaiAkhir(){
        double nilaiKehadiran = jlhKehadiran * 10;
        double totalNilai = nilaiUts + nilaiUas + nilaiKehadiran + keaktifan;
        return totalNilai/4;
    }

}

