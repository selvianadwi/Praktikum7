package latihan2;

import java.util.Scanner;

public class KaryawanKontrak extends Karyawan{
    int upahHarian;
    int jmlHariMasuk;
    int tunjanganAnak;


    //constructor
    public KaryawanKontrak(String nama, String alamat, String status, int upahHarian, int jmlHariMasuk, int tunjanganAnak) {
        super(nama, alamat, status);
        this.upahHarian = upahHarian;
        this.jmlHariMasuk = jmlHariMasuk;
        this.tunjanganAnak = tunjanganAnak;
    }

    //method
    public void totalUpah(){
        int totalUpah = upahHarian * jmlHariMasuk + tunjanganAnak;
        System.out.println("Total Upah : " + totalUpah);
    }

    public void cetak(){
        super.cetak();
        System.out.println("Upah Harian : " + upahHarian);
        System.out.println("Jumlah Hari Masuk : " + jmlHariMasuk);
        System.out.println("Tunjangan Anak : " + tunjanganAnak);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("Alamat: ");
        String alamat = input.nextLine();
        System.out.print("Status: ");
        String status = input.nextLine();
        System.out.print("Upah Harian: ");
        int upahHarian = input.nextInt();
        System.out.print("Jumlah Hari Masuk: ");
        int jmlHariMasuk = input.nextInt();
        System.out.print("Tunjangan Anak: ");
        int tunjanganAnak = input.nextInt();

        KaryawanKontrak KK = new KaryawanKontrak(nama, alamat, status, upahHarian, jmlHariMasuk, tunjanganAnak);
        KK.cetak();
        KK.totalUpah();
        
        input.close();
    }
}
