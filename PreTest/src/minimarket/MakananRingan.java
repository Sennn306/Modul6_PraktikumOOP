package minimarket;
public class MakananRingan extends Produk {
    String rasa;

    public void MakananRingan(String namaProduk, double harga) {
        super(namaProduk, harga);
        this.rasa = rasa;
    }
    @override 
    public void tampilkanDetail() {
        super.tampilkanDetail();
        System.out.println("Rasa: " + rasa);
    }

}