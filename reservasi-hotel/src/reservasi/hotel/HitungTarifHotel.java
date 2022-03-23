/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reservasi.hotel;

/**
 *
 * @author Aldy
 */
public class HitungTarifHotel extends Hotel {
    
    private int tarif;
    private String kamar;
    
    // untuk mengambil data dari input get_harga()
    public int get_harga(){
        //untuk memilih dan menginput data harga
        if(type == 1){
            tarif = 250000;
        }else if(type == 2){
            tarif = 500000;
        }else if(type == 3){
            tarif = 750000;
        }else{
            
        }
        return tarif;
    }
    
    // untuk mengambil data dari input get_kamar()
    public String get_kamar(){
        //untuk memilih dan menginput data kamar
        if(type == 1){
            kamar = "Deluxe";
        }else if(type == 2){
            kamar = "Premium";
        }else if(type == 3){
            kamar = "Superior";
        }else{
            
        }
        return kamar;
    }
    
    //hasil dari tarif dikali waktu, * itu adalah perkalian
    public int get_total(){
        return tarif*waktu;
    }
    
}
