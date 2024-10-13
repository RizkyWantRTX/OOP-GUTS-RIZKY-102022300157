public class Penerbangan {
    public String nomorpenerbangan;
    public String bandarakeberangkatan;
    public String bandaratujuan;
    public String waktukeberangkatan;
    public String waktukedatangan;
    public Float hargatiket;

    public Penerbangan(String nomorpenerbangan, String bandarakeberangkatan, String bandaratujuan, String waktukeberangkatan, String waktukedatangan, Float hargatiket) {
        this.nomorpenerbangan = nomorpenerbangan;
        this.bandarakeberangkatan = bandarakeberangkatan;
        this.bandaratujuan = bandaratujuan;
        this.waktukeberangkatan = waktukeberangkatan;
        this.waktukedatangan = waktukedatangan;
        this.hargatiket = hargatiket;
    }

    public void tampilkanpenerbangan() {
        System.out.println("nomor penerbangan          : " + nomorpenerbangan);
        System.out.println("bandara keberangkatan      : " + bandarakeberangkatan);
        System.out.println("bandara tujuan             : " + bandaratujuan);
        System.out.println("waktu keberangkatan        : " + waktukeberangkatan);
        System.out.println("waktu kedatangan           : " + waktukedatangan);
        System.out.println("harga tiket                : " + hargatiket);
        System.out.println("====================================================");
    }
}