package minimarket;
public class Produk {
    String namaProduk;
    double harga;

    public Produk(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public String getNamaProduk() {
        return namaProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void tampilkanDetail() {
        System.out.println("Nama Produk: " + namaProduk);
        System.out.println("Harga: " + harga);
    }

    
}