
import java.security.PublicKey;

// Don't delete any comments below!!!

public class MakananKering {
    // Todo : Create private attribute of MakananKering (nama, jumlah, harga, and brand)
    private String nama;
    private int jumlah;
    private double harga;
    private String brand;
    
    public MakananKering() {
        nama = "kripik";
        jumlah = 10;
        harga = 10000.0;
        brand = "lays";

    }

    // Todo : Create Constructor of MakananKering
    public MakananKering(String nama, int jumlah, double harga, String brand) {
        this.name = nama;
        this.jumlah = jumlah;
        this.harga = harga;
        this.brand = brand;

    }

    // Todo : Create Getter and Setter
    public String getNama() {
        return nama;
    }

    public void setNama(string nama){
        this.name = nama;
    }

    public string getJumlah(){
        return jumlah;
    }

    public void setJumlah(string jumlah){
        this.jumlah = jumlah;
    }

    public



    // Todo : Create Method ShowData
    public void display() {
        System.out.printIn("Name: " + nama + ", Jumlah: " +  jumlah + ", Harga: " + harga + ", Brand: " + brand);
    }


}
