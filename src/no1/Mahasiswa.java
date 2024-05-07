package no1;

class Mahasiswa{
    private String nama;
    private String kom;
    private String nim;

    public Mahasiswa(String nama, String kom, String nim){
        this.nama = nama;
        this.kom = kom;
        this.nim = nim;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getNama(){
        return nama;
    }
    public void setKom(String kom){
        this.kom = kom;
    }
    public String getKom(){
        return kom;
    }
    public void setNim(String nim){
        this.nim = nim;
    }
    public String getNim(){
        return nim;
    }

    public void printInfo(){
        System.out.println("Nama "+nama);
        System.out.println("Kom "+kom);
        System.out.println("Nim "+nim);
    }

    public void printInfo(String Keterangan){
        System.out.println(Keterangan + "Nama "+ nama + " Kom " + kom + " Nim " + nim);
    }
    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", nim='" + nim + '\'' +
                '}';
    }
}



