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
public class Elektronik {
    String merek;
    int tahunProduksi;
    int garansi;
    
    public Elektronik(){
        
    }
    public Elektronik (String merek, int tahunProduksi, int garansi){
        this.merek=merek;
        this.tahunProduksi=tahunProduksi;
        this.garansi=garansi;
    }
    public String getMerek(){
        return merek;
    }
    
    public void setMerek (String nama){
        this.merek=merek;
    }
    
    public int getTahunProduksi(){
        return tahunProduksi;
    }
    public void setTahunProduksi (int tahunProduksi){
        this.tahunProduksi=tahunProduksi;
    }
    
    public int getGaransi(){
        return garansi;
    }
    public void setGaransi (int garansi){
        this.garansi=garansi;
    }
    
    public void display(){
        System.out.println("Nama merek : "+this.merek);
        System.out.println("Tahun Produksi : "+this.tahunProduksi);
        System.out.println("Garansi Produk : "+this.garansi);
    }
}
