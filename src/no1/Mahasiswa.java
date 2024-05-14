package no1;

//penggunaan class
class Mahasiswa {
    private String nama;
    private String kom;
    private String nim;

    //penggunaan constructur
    public Mahasiswa(String nama, String kom, String nim){
        this.nama = nama;
        this.kom = kom;
        this.nim = nim;
    }

    Mahasiswa() {
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


    //Method Overriding
//    @Override
//    public String toString() {
//        return "Mahasiswa{" +
//                "nama='" + nama + '\'' +
//                ", nim='" + nim + '\'' +
//                '}';
//    }


}



