package latihan2;

import java.util.Scanner;

public class KaryawanTetap extends Karyawan {
    int gajiPokok;
    int tunjanganAnak;

    //constructor
    public KaryawanTetap(String nama, String alamat, String status, int gajiPokok, int tunjanganAnak) {
        super(nama, alamat, status);
        this.gajiPokok = gajiPokok;
        this.tunjanganAnak = tunjanganAnak;
    }

    //method
    public void TotalGaji(){
        int totalGaji = gajiPokok + tunjanganAnak;
        System.out.println("Total Gaji : " + totalGaji);
    }

    @Override
    public void cetak() {
        super.cetak();
        System.out.println("Tunjangan Anak : " + tunjanganAnak);
        System.out.println("Gaji Pokok : " + gajiPokok);
      
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("Alamat: ");
        String alamat = input.nextLine();
        System.out.print("Status: ");
        String status = input.nextLine();
        System.out.print("Tunjangan Anak: " );
        int tunjanganAnak = input.nextInt();
        System.out.print("Gaji Pokok: ");
        int gajiPokok = input.nextInt();

        
        KaryawanTetap KT = new KaryawanTetap(nama, alamat, status, gajiPokok, tunjanganAnak);
        KT.cetak();
        KT.TotalGaji();

        input.close(); 
    }

}
