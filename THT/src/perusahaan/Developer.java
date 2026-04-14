// 105224030_Adrenalin Syahrobby
package perusahaan; // Deklarasi package

public class Developer extends Karyawan { // Deklarasi kelas turunan
    // Atribut tambahan
    private String level;
    private int jumlahBugFix;

    // Konstruktor
    public Developer(String idKaryawan, String nama, int tahunMasuk, double gajiPokok, double ratingKinerja, String level, int jumlahBugFix){
        super(idKaryawan, nama, tahunMasuk, gajiPokok, ratingKinerja); // Memanggil konstruktor kelas induk
        this.level = level;
        this.jumlahBugFix = jumlahBugFix;
    }

    // Melakukan overriding
    @Override 
    public double hitungGajiTotal(){
        double gajiTotal = super.hitungGajiTotal(); // Memanggil method hitungGajiTotal dari kelas induk

        // Menambahkan bonus berdasarkan level
        if (level == "Senior"){
            gajiTotal = gajiTotal + 3000000;
        } else if (level == "Mid"){
            gajiTotal = gajiTotal + 1500000;
        } else if (level == "Junior") {
            gajiTotal = gajiTotal;
        }

        // Menambahkan bonus berdasarkan jumlah bug fix
        if (getRatingKinerja() >= 3.0) {
            gajiTotal = gajiTotal + (jumlahBugFix * 50000);
        }
        return gajiTotal; // Mengembalikan gaji total
    }

    // Getter
    public String getLevel() {
        return level;
    }

    public int getJumlahBugFix() {
        return jumlahBugFix;
    }

    // Override method displayInfo
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Level: " + level); // Menampilkan level
        System.out.println("Jumlah Bug Fix: " + jumlahBugFix); // Menampilkan jumlah bug fix
    }
}