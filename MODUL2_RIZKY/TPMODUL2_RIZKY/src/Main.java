public class Main {
    public static void main(String[] args) {
        System.out.println("Detail Hewan\n");

        // Membuat objek Kucing dan Burung dengan detail sesuai output
        Kucing kucing = new Kucing("Momo", 2, "Persia");
        Burung burung = new Burung("Rio", 1, "Hijau");

        // Output untuk kucing
        System.out.println("Ini adalah " + kucing.nama + " !");
        kucing.suara();
        kucing.makan();
        kucing.makan("ikan");
        System.out.println();

        // Output untuk burung
        System.out.println("Ini adalah " + burung.nama + " !");
        burung.suara();
        burung.makan();
        burung.makan("biji-bijian");
        System.out.println();

        // Informasi lengkap hewan
        kucing.infoHewan();
        burung.infoHewan();
    }
}
