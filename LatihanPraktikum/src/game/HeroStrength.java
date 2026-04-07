package game;
public class HeroStrength extends Hero { // Nomor 3
    String tipeHero = "Strength";
    public HeroStrength (String name, double health, double attackPower, String tipeHero) { // Nomor 3
        super(name, health, attackPower);
        this.tipeHero = tipeHero;
    }

    @Override
    public void display() { // Nomor 4
        super.display();
        System.out.println("Strength: " + this.tipeHero);
    }

    public void terimaSerangan(double damage) { // Nomor 4
        System.out.println("Damage diberikan: " + damage);
        double damageMasuk = damage * 0.5;
        super.terimaSerangan(damageMasuk);
    }
}
