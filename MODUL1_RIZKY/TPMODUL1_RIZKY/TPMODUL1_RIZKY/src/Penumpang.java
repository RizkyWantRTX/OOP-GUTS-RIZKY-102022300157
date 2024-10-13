public class Penumpang {
    private final String NIK;
    String namadepan;
    String namabelakang;

    public Penumpang(String NIK, String namadepan, String namabelakang) {
        this.NIK = NIK;
        this.namadepan = namadepan;
        this.namabelakang = namabelakang;
    }

    public void tampilkanpenumpang() {
        System.out.println("NIK : " + NIK);
        System.out.println("nama depan : " + namadepan);
        System.out.println("nama belakang : " + namabelakang);
    }
}