package rental;
public class Kendaraan {
    public String nomorPolisi;
    public String merk;
    public int tahunProduksi;
    protected double hargaSewaDasar;

    public Kendaraan(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar) {
        this.nomorPolisi = nomorPolisi;
        this.merk = merk;
        this.tahunProduksi = tahunProduksi;
        this.hargaSewaDasar = hargaSewaDasar;
    }

    public void displayInfo(){
        System.out.println("Nomor Polisi    : " + nomorPolisi);
        System.out.println("Merk            : " + merk);
        System.out.println("Tahun Produksi  : " + tahunProduksi);
        System.out.println("Harga Sewa Dasar: Rp" + hargaSewaDasar);
    }

    public double hitungHargaSewa(int hari){
        double total = hargaSewaDasar * hari;
        if (this.tahunProduksi < 2015) {
            total -= (total * 0.10);
        } 
        return total;
        
    }
}
