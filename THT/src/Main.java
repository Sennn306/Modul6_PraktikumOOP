// 105224030_Adrenalin Syahrobby
import perusahaan.*; // Import package
import java.util.ArrayList; // Import ArrayList
public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Karyawan> daftarKaryawan = new ArrayList<>(); // Deklarasi ArrayList

        // Objek 1
        daftarKaryawan.add(new Karyawan("1001", "Udin", 2020, 3000000, 2.0));

        // Objek 2
        daftarKaryawan.add(new Developer("2001", "Budi", 2018, 5000000, 4.0, "Senior", 20));

        // Objek 3
        daftarKaryawan.add(new Developer("2001", "Risma", 2024, 4000000, 2.5, "Mid", 15));
        
        // Objek 4
        daftarKaryawan.add(new Manajer("3001", "Rina", 2015, 10000000, 4.8, "IT", 10));

        // Objek 5
        daftarKaryawan.add(new Manajer("3002", "Kiki", 2025, 12000000, 3.5, "HR", 3));

        double totalAnggaranGaji = 0.0; // Variabel untuk menyimpan total anggaran gaji
        double gajiTertinggi = 0.0; // Variabel untuk menyimpan gaji tertinggi
        String namaHighestEarner = ""; // Variabel untuk menyimpan nama karyawan dengan gaji tertinggi
        double totalRatingKinerja = 0.0; // Variabel untuk menyimpan total rating kinerja

        // Looping untuk menampilkan data
        for (Karyawan karyawan : daftarKaryawan){
            karyawan.displayInfo(); // Memanggil method displayInfo
            double gajiBulanIni = karyawan.hitungGajiTotal(); // Memanggil method hitungGajiTotal

            System.out.println("Gaji Bulan Ini: " + gajiBulanIni + "\n"); // Menampilkan gaji bulan ini
            System.out.println("=====================================" + "\n");

            totalAnggaranGaji += gajiBulanIni; // Menyimpan total anggaran gaji

            // Menentukan karyawan dengan gaji tertinggi
            if (gajiBulanIni > gajiTertinggi) {
                gajiTertinggi = gajiBulanIni;
                namaHighestEarner = karyawan.getNama();
            }
            // Menyimpan total rating kinerja
            totalRatingKinerja += karyawan.getRatingKinerja();
        }

            double rataRataRating = totalRatingKinerja / daftarKaryawan.size(); // Menghitung rata-rata rating kinerja

            // Menampilkan hasil perhitungan
            System.out.println("HASIL PERHITUNGAN GAJI KARYAWAN" + "\n");
            System.out.println("Total Anggaran Gaji: " + totalAnggaranGaji + "\n"); // Menampilkan total anggaran gaji
            System.out.println("Nama Karyawan Tertinggi: " + namaHighestEarner + "\n"); // Menampilkan nama karyawan tertinggi
            System.out.println("Total Rating Kinerja: " + totalRatingKinerja + "\n"); // Menampilkan total rating kinerja
            System.out.println("Rata-Rata Rating Kinerja: " + rataRataRating + "\n"); // Menampilkan rata-rata rating kinerja


    }
}
