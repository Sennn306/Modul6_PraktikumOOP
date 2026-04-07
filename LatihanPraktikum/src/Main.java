import game.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Hero hero1 = new Hero("Lancelot", 100, 10); // Nomor 5
        Hero hero2 = new HeroStrength("Tigreal", 100, 10, "Strength"); // Nomor 5

        hero1.display(); // Nomor 5
        hero2.display(); // Nomor 5

        hero1.berlatih(); // Nomor 5
        hero2.berlatih(); // Nomor 5

        hero1.terimaSerangan(50); // Nomor 5
        hero2.terimaSerangan(50); // Nomor 5

        hero1.display(); // Nomor 5
        hero2.display(); // Nomor 5
    }
}
