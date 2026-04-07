package rental;

public class Motor extends Kendaraan {
    int kapasitasMesin;

    public Motor(String nomorPolisi, String merk, int tahunProduksi, double hargaSewaDasar, int cc){
        super(nomorPolisi, merk, tahunProduksi, hargaSewaDasar);
        this.kapasitasMesin = cc;

    }

    @Override 
    public double hitungHargaSewa(int hari){
        double total = super.hitungHargaSewa(hari);
        
        if (kapasitasMesin >= 250){ // Pajak barang mewah
            total += (25000 * hari);
        }
        return total;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Kapasitas Mesin: " + kapasitasMesin);
    }
}