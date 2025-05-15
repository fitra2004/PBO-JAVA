/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts2401082012;

/**
 *
 * @author nofri
 */
public class Smartphone extends Elektronik {
    int kapasitasBaterai;
    int jumlahKamera;
    
    public Smartphone(){
        
    }
    
    public int getKapasitasBaterai(){
        return kapasitasBaterai;
    }
    
    public void setKapasitasBaterai(int kapasitasBaterai){
        this.kapasitasBaterai = kapasitasBaterai;
    }
    
    public int getJumlahKamera(){
        return jumlahKamera;
    }
    
    public void setJumlahKamera(int jumlahKamera){
        this.jumlahKamera = jumlahKamera;
    }
    
    @Override
    public void display(){
        System.out.println("Nama merek : "+this.merek);
        System.out.println("Tahun Produksi : "+this.tahunProduksi);
        System.out.println("Garansi Produk : "+this.garansi);
        System.out.println("Kapasitas Baterai : "+this.kapasitasBaterai);
        System.out.println("Jumlah Kamera : "+this.jumlahKamera);
    }
}
   