class Komputer {
    // To do: Buatlah 3 variable sesuai ketentuan
    protected int JumlahKomputer;
    protected String NamaWarnet;
    protected float HargaPerjam;

    // To do: Buatlah constructor pada class Komputer
    public Komputer(int JumlahKomputer, String NamaWarnet, float HargaPerjam) {
        this.JumlahKomputer = JumlahKomputer;
        this.NamaWarnet = NamaWarnet;
        this.HargaPerjam = HargaPerjam;
    }
    // To do: Buatlah Method Informasi dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    public void Informasi() {
        System.out.println("Jumlah Komputer: " + JumlahKomputer);
        System.out.println("Warnet: " + NamaWarnet);
        System.out.println("Harga Perjam: " + HargaPerjam);
        System.out.println("----------------------------------------");
    }

}