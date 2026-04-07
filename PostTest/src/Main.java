import rental.*;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) throws Exception {
        ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();

        daftarKendaraan.add(new Mobil("ABC123", "Toyota Avanza", 2012, 500000, 6));
        daftarKendaraan.add(new Mobil("DEF456", "Honda Civic", 2024, 700000, 4));
        daftarKendaraan.add(new Motor("XYZ789", "Yamaha R15", 2022, 150000, 150));

        for (Kendaraan k : daftarKendaraan) {
            k.displayInfo();
            System.out.println("Harga Sewa 5 hari: Rp" + k.hitungHargaSewa(5) + "\n");
        }
    }
}
