package game;
public class Hero { // Nomor 1
    String nama;
    double health;
    double attackPower;

    public Hero(String nama, double health, double attackPower) { // Nomor 1
        this.nama = nama;
        this.health = health;
        this.attackPower = attackPower;
    }

    public void display() { // Nomor 2
        System.out.println("Nama: " + this.nama);
        System.out.println("Health: " + this.health);
        System.out.println("Attack Power: " + this.attackPower);
    }

    public void berlatih() { // Nomor 2
        this.attackPower += 10;
        System.out.println("Hero sedang berlatih");
    }

    public void terimaSerangan(double damage) { // Nomor 2
        this.health -= damage;
        System.out.println("Damage diterima: " + damage);
    }



}
