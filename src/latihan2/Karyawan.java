package latihan2;

import java.util.Scanner;

public class Karyawan {
    String nama;
    String alamat;
    String status;

    //constructor
    public Karyawan(String nama, String alamat, String status) {
        this.nama = nama;
        this.alamat = alamat;
        this.status = status;
    }

    //method
    public void cetak() {
        System.out.println("Nama : " + nama);
        System.out.println("Alamat : " + alamat);
        System.out.println("Status : " + status);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nama : ");
        String nama = input.nextLine();
        System.out.print("Alamat : ");
        String alamat = input.nextLine();
        System.out.print("Status : ");
        String status = input.nextLine();

        Karyawan K = new Karyawan(nama, alamat, status);
        K.cetak();

        input.close(); //menutup scanner
    }


   
    
}
