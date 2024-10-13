import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    static ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
    static ArrayList<String> pesananTiket = new ArrayList<>();
    public static void main(String[] args) {
    
        daftarPenerbangan.add(new Penerbangan("GA001", "Jakarta", "Bali", "08:00", "10:00", 1000000f));
        daftarPenerbangan.add(new Penerbangan("GA002", "Surabaya", "Jakarta", "09:00", "11:00", 850000f));
        daftarPenerbangan.add(new Penerbangan("GA003", "Bali", "Jakarta", "12:00", "14:00", 900000f));

        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        
        while (!exit) {
            System.out.println("==== EAD Ticket Booking System ====");
            System.out.println("1. Tampilkan Daftar Pemesanan");
            System.out.println("2. Beli Ticket");
            System.out.println("3. Tampilkan Pesanan Ticket");
            System.out.println("4. Exit");
            System.out.print("Silahkan Pilih Menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  // Mengatasi bug newline dari input nextInt()

            switch (pilihan) {
                case 1 -> tampilkanDaftarPenerbangan();
                case 2 -> beliTicket(scanner);
                case 3 -> tampilkanPesananTicket();
                case 4 -> exit = true;
                default -> System.out.println("Pilihan tidak valid. Silahkan pilih angka 1-4.");
            }
        }

        System.out.println("Terima kasih telah menggunakan EAD Ticket Booking System.");
    }

    // Metode untuk menampilkan daftar penerbangan
    public static void tampilkanDaftarPenerbangan() {
        System.out.println("======= Daftar Penerbangan =======");
        for (int i = 0; i < daftarPenerbangan.size(); i++) {
            System.out.println((i + 1) + ". ");
            daftarPenerbangan.get(i).tampilkanpenerbangan();
        }
    }

    // Metode untuk membeli tiket
    public static void beliTicket(Scanner scanner) {
        tampilkanDaftarPenerbangan();
        System.out.print("Masukkan nomor penerbangan yang ingin dipesan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine();  // Mengatasi newline bug

        if (pilihan > 0 && pilihan <= daftarPenerbangan.size()) {
            Penerbangan penerbanganDipilih = daftarPenerbangan.get(pilihan - 1);

            System.out.print("Masukkan NIK penumpang: ");
            String NIK = scanner.nextLine();
            System.out.print("Masukkan nama depan penumpang: ");
            String namaDepan = scanner.nextLine();
            System.out.print("Masukkan nama belakang penumpang: ");
            String namaBelakang = scanner.nextLine();

            Penumpang penumpang = new Penumpang(NIK, namaDepan, namaBelakang);

        
            pesananTiket.add("Tiket untuk penerbangan: " + penerbanganDipilih.nomorpenerbangan + " - " + penerbanganDipilih.bandaratujuan +
                             " atas nama " + penumpang.namadepan + " " + penumpang.namabelakang);
            System.out.println("Tiket berhasil dipesan!");
        } else {
            System.out.println("Nomor penerbangan tidak valid.");
        }
    }

    // Metode untuk menampilkan pesanan tiket
    public static void tampilkanPesananTicket() {
        if (pesananTiket.isEmpty()) {
            System.out.println("Belum ada tiket yang dipesan.");
        } else {
            System.out.println("======= Pesanan Tiket =======");
            for (String pesanan : pesananTiket) {
                System.out.println(pesanan);
            }
        }
    }
}