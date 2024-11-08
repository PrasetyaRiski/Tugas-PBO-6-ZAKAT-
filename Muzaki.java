package javaapplication8;

public class Muzaki {
    private String nama;
    private double jumlahHarta;
    private String jenisHarta;

    public Muzaki(String nama, double jumlahHarta, String jenisHarta) {
        this.nama = nama;
        this.jumlahHarta = jumlahHarta;
        this.jenisHarta = jenisHarta;
    }
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getJumlahHarta() {
        return jumlahHarta;
    }

    public void setJumlahHarta(double jumlahHarta) {
        this.jumlahHarta = jumlahHarta;
    }

    public String getJenisHarta() {
        return jenisHarta;
    }

    public void setJenisHarta(String jenisHarta) {
        this.jenisHarta = jenisHarta;
    }
    
    public double hitungZakat() {
        double nisab = 0;
        if ("Uang".equalsIgnoreCase(jenisHarta)) {
            nisab = 6859394;
        } else if ("Emas".equalsIgnoreCase(jenisHarta)) {
            nisab = 85;
        } else if ("Perak".equalsIgnoreCase(jenisHarta)) {
            nisab = 595;
        }
        
        if (jumlahHarta >= nisab) {
            return jumlahHarta * 0.025;
        } else {
            return 0; // Tidak wajib zakat jika di bawah nisab
        }
    }
}
