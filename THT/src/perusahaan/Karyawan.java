// 105224030_Adrenalin Syahrobby
package perusahaan; // Deklarasi package
public class Karyawan {
    // Atribut kelas karyawan
    private String idKaryawan;
    private String nama;
    private int tahunMasuk;
    private double gajiPokok;
    private double ratingKinerja;
    public int tahunSekarang = 2026; // Set tahun sekarang

    // Konstruktor
    public Karyawan(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja) {
        this.idKaryawan = idKaryawan;
        this.nama = nama;
        this.tahunMasuk = tahunMasuk;
        this.gajiPokok = gajiPokok;
        this.ratingKinerja = ratingKinerja;

        // Validasi rating kinerja
        if (ratingKinerja < 1.0 || ratingKinerja > 5.0) {
            this.ratingKinerja = 3.0; // Set rating kinerja ke 3.0
        }
    }

    // Getter
    public String getIdKaryawan() {
        return idKaryawan;
    }

    public String getNama() {
        return nama;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }
    public double getGajiPokok() {
        return gajiPokok;
    }

    public double getRatingKinerja() {
        return ratingKinerja;
    }

    public int getTahunSekarang() {
        return tahunSekarang;
    }

    // Setter
    public void setidKaryawan(String idKaryawan) {
        this.idKaryawan = idKaryawan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setTahunMasuk(int tahunMasuk) {
        this.tahunMasuk = tahunMasuk;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public void setRatingKinerja(double ratingKinerja) {
        this.ratingKinerja = ratingKinerja;
        if (ratingKinerja < 1.0 || ratingKinerja > 5.0) { // Validasi ulang rating kinerja
            this.ratingKinerja = 3.0; // Set rating kinerja ke 3.0
        }
    }

    // Method hitung total gaji
    public double hitungGajiTotal(){
        double gajiTotal;
        int lamaKerja = tahunSekarang - tahunMasuk; // Hitung lama kerja
        double bonusLoyal  = gajiPokok * 0.05 * lamaKerja; // Hitung bonus loyal
        gajiTotal = gajiPokok + bonusLoyal; // Menyimpan gaji total

        // Cek rating kinerja
        if (ratingKinerja < 2.5 ){
            gajiTotal = gajiTotal - (gajiTotal * 0.10);
        } 
        return gajiTotal; // Mengembalikan gaji total
        
    }

    // Method untuk menampilkan informasi
    public void displayInfo(){
        System.out.println("ID Karyawan: " + idKaryawan); // Menampilkan id karyawan
        System.out.println("Nama: " + nama); // Menampilkan nama
        System.out.println("Tahun Masuk: " + tahunMasuk); // Menampilkan tahun masuk
        System.out.println("Rating Kinerja: " + ratingKinerja); // Menampilkan rating kinerja
        System.out.println("Gaji Pokok: " + gajiPokok); // Menampilkan gaji pokok
    }
}