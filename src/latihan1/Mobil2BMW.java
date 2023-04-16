package latihan1;

public class Mobil2BMW extends Mobil2{
    public Mobil2BMW(String merk, int kecepatan, int gigi) {
        super(merk, kecepatan, gigi);
    }

    public void nontonTv() {
        System.out.println("Tv dihidupkan");
        System.out.println("Tv mencari channel");
        System.out.println("Tv menampilkan gambar");
    }
}
