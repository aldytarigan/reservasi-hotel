/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservasi.hotel;

import java.util.Scanner;

/**
 *
 * @author Aldy
 */
public class Main {
    
    public static void main(String[] args){
        
        String name;
        int type, waktu;
        
        //objek hotel
        HitungTarifHotel hotel = new HitungTarifHotel();
        
        //untuk menginput data setName()
        System.out.println("================== Booking Hotel ==================");
        Scanner nama = new Scanner(System.in);
        System.out.print("Nama Anda : ");
        name = nama.next();
        hotel.setName(name);
        
        // untuk menampilkan menu jenis kamar
        System.out.println("\nPilih Jenis Kamar");
        System.out.println("1. Deluxe Room Rp.250.000;");
        System.out.println("2. Premiun Room Rp.500.000;");
        System.out.println("3. Superior Room Rp.750.000;");
        
        //untuk menginput data setType()
        Scanner pilih = new Scanner(System.in);
        System.out.print("Jenis Kamar Yang Dipilih : ");
        type = pilih.nextInt();
        hotel.setType(type);
        
        //untuk mengimput data setWaktu()
        Scanner lama = new Scanner(System.in);
        System.out.print("\nUntuk Berapa Lama : ");
        waktu = lama.nextInt();
        hotel.setWaktu(waktu);
        
        //hasil yang akan keluar setelah menginput data diatas
        System.out.println("================ Note Pembayaran ==================");
        System.out.println("Nama Pelanggan      : " + hotel.getName());
        System.out.println("Jenis Kamar         : " + hotel.get_kamar());
        System.out.println("Tarif Penginapan    : Rp." + hotel.get_harga());
        System.out.println("Total Pembayaran    : Rp." + hotel.get_total());
        System.out.println("===================================================");
        
    }
    
}
