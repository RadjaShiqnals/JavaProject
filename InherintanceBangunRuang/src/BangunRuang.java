import java.util.Scanner;

public class BangunRuang {

    int sisi, p, l, t;
    float jari2, t2;
    Scanner test = new Scanner(System.in);

    public void volumeBalok() {
        System.out.println("Masukkan Panjang Balok");
        p = test.nextInt();
        System.out.println("Masukkan Lebar Balok");
        l = test.nextInt();
        System.out.println("Masukkan Tinggi Balok");
        t = test.nextInt();
        System.out.print("Panjang= " + p + "\nLebar = " + l + "\nTinggi = " + t + "\nVolume Balok adalah " + p * l * t);
    }

    public void volumeBola() {
        System.out.println("Masukkan jari-jari bola");
        jari2 = test.nextFloat();
        System.out.print("Jari-jari = " + jari2 + "\nVolume Bola adalah = " + Math.PI * (jari2 * jari2 * jari2) * 4 / 3);
    }

    public void volumeKerucut() {
        System.out.println("masukkan jari-jari kerucut");
        jari2 = test.nextFloat();
        System.out.println("Masukkan Tinggi Kerucut");
        t2 = test.nextFloat();
        System.out.println("Jari-jari = " + jari2 + "\nTinggi = " + t2 + "\nVolume Kerucut = " + jari2 * jari2 * t2 * Math.PI / 3);
    }

    public void volumeKubus() {
        System.out.println("Masukkan Sisi Kubus");
        sisi = test.nextInt();
        System.out.println("Sisi Kubus = " + sisi + "\nVolume Kubus = " + sisi * sisi * sisi);
    }

    public void volumeLimas() {
        System.out.println("Masukkan Sisi Alas Limas");
        sisi = test.nextInt();
        System.out.println("Masukkan Tinggi Limas");
        t = test.nextInt();
        System.out.println("Tinggi Limas = " + t + "\nSisi Alas Limas= " + sisi + "\nVolume Limas = " + (sisi * sisi) * t / 3);
    }

    public void volumePrisma() {
        System.out.println("Masukkan SIsi Alas Prisma");
        sisi = test.nextInt();
        System.out.println("Masukkan Tinggi Prisma");
        t = test.nextInt();
        System.out.println("Sisi Alas Prisma = " + sisi + "\nTinggi Prisma = " + t + "\nVolume Prisma = " + (sisi * t / 2) * t);

    }

    public void volumeTabung() {
        System.out.println("Masukkan jari-jari Tabung");
        jari2 = test.nextFloat();
        System.out.println("Masukkan Tinggi");
        t2 = test.nextFloat();
        System.out.println("jari-jari Tabung = " + jari2 + "\nTinggi Tabung = " + t2 + "\nVolume Tabung = " + jari2 * jari2 * t2 * Math.PI);
    }
}
