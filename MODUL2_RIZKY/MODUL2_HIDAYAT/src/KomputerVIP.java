class KomputerVIP extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    private boolean VipCard;

    // To do: Buatlah constructor pada class KomputerVIP
    public KomputerVIP(boolean VipCard, int JumlahKomputer, String NamaWarnet, float HargaPerjam) {
        super(JumlahKomputer, NamaWarnet, HargaPerjam);
        this.VipCard = VipCard;
    }

    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    public void Informasi(){
        super.Informasi();
        if(VipCard == true){
            System.out.println("STATUS: Member VIP");
            System.out.println("");
            System.out.println("BENEFIT Member VIP ");
            System.out.println("-Diskon 10% untuk bermain diatas 3 jam");
            System.out.println("-Gratis minuman setiap 4 jam bermain");     
            System.out.println("-Prioritas booking komputer gaming");
        }
        else{
            System.out.println("Join Vip dulu lah");
        }
    }

    // To do: Buatlah method Login sesuai dengan ketentuan
    

    // To do: Buatlah method Bermain sesuai dengan ketentuan
    
    // To do: Buatlah method Bermain memakai Polymorphism Overloading sesuai dengan ketentuan

}