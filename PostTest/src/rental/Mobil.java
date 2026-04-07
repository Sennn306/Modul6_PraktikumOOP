package rental;

public class Mobil extends Kendaraan {
    int kapasitasPenumpang;

    public Mobil(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar, int kapasitas) {
        super(nomorPolisi, merk, tahunProduksi, hargaSewaDasar);
        this.kapasitasPenumpang = kapasitas;
    }
    @Override
    public double hitungHargaSewa(int hari){
        double total = super.hitungHargaSewa(hari);

        total += (50000 * hari); // Asuransi

        if (kapasitasPenumpang > 5){ // Kebersihan
            total += 50000;
        }
        return total;
    }
    
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Kapasitas Penumpang: " + kapasitasPenumpang);
    }
}