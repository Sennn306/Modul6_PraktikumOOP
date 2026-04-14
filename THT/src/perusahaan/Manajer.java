// 105224030_Adrenalin Syahrobby
package perusahaan; // Deklarasi package

public class Manajer extends Karyawan { // Deklarasi kelas turunan
    // Atribut tambahan
    private String divisi;
    private int jumlahAnggotaTim;

    // Konstruktor
    public Manajer (String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String divisi, int jumlahAnggotaTim) {
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja); // Memanggil konstruktor kelas induk
        this.divisi = divisi;
        this.jumlahAnggotaTim = jumlahAnggotaTim;
    }

    // Override method hitungGajiTotal
    @Override
    public double hitungGajiTotal() {
        double gajiTotal = super.hitungGajiTotal(); // Memanggil method hitungGajiTotal dari kelas induk
        gajiTotal = gajiTotal + (300000 * jumlahAnggotaTim); // Menambahkan tunjangan manajerial berdasarkan jumlah anggota tim

        // Menambahkan bonus berdasarkan rating kinerja
        if (getRatingKinerja() > 4.5) {
            gajiTotal = gajiTotal + (gajiTotal * 0.15);
        }
        return gajiTotal;
    }

    // Getter
    public String getDivisi() {
        return divisi;
    }

    public int getJumlahAnggotaTim() {
        return jumlahAnggotaTim;
    }

    // Override method displayInfo
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Divisi: " + divisi); // Menampilkan divisi
        System.out.println("Jumlah Anggota Tim: " + jumlahAnggotaTim); // Menampilkan jumlah anggota tim
    }
}