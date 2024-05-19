package no1;

// Pendeklarasian Class
class Mahasiswa {
    // Private Variabel
    private String nama;
    private String kom;
    private String nim;

    // Pendeklarasian Constructor
    public Mahasiswa(String nama, String kom, String nim){
        this.nama = nama;
        this.kom = kom;
        this.nim = nim;
    }

    // Default Constructur (tanpa parameter)
    Mahasiswa() {
    }

    //Method Getter dan Setter
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


}



