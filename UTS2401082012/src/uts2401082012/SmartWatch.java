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
public class SmartWatch extends Smartphone {
    private int ukuranLayar;
    private boolean tahanAir;
    
    public int getUkuranLayar(){
        return ukuranLayar;
    }
    
    public void setUkuranLayar(int ukuranLayar){
        this.ukuranLayar = ukuranLayar;
    }
    
    public boolean getTahanAir(){
        return tahanAir;
    }
    
    public void setTahanAir(boolean tahanAir){
        this.tahanAir = tahanAir;
    }
    
    
    @Override
    public void display(){
        System.out.println("Nama merek : "+this.merek);
        System.out.println("Tahun Produksi : "+this.tahunProduksi);
        System.out.println("Garansi Produk : "+this.garansi);
        System.out.println("Kapasitas Baterai : "+this.kapasitasBaterai);
        System.out.println("Jumlah Kamera : "+this.jumlahKamera);
        System.out.println("Ukuran Layar : "+this.ukuranLayar);
        System.out.println("Apakah Tahan Air : "+this.tahanAir);
    }
}
