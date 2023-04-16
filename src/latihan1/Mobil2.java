package latihan1;

public class Mobil2 {
    int kecepatan;
    String merk;
    int gigi;

    //constructor
    public Mobil2(String merk, int kecepatan, int gigi) {
        this.merk = merk;
        this.kecepatan = kecepatan;
        this.gigi = gigi;
    }

    //method
    public void hidupkanMobil() {
        System.out.println("Mobil dinyalakan");
    }

    public void matikanMobil() {
        System.out.println("Mobil dimatikan");
    }
    //ubah gigi
    public void ubahGigi(int gigi) {
        this.gigi = gigi;
        System.out.println("Gigi diubah menjadi " + gigi);
    }



}
