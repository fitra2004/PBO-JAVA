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
public class Gaming extends Laptop{
    private String kartuGrafis;
    private int refreshRate;
    
    public Gaming (){
    }
    
    public Gaming (String merek, int tahunProduksi,int garansi,int ukuranLayar, int kapasitasRAM){
        super (merek,tahunProduksi,garansi,ukuranLayar,kapasitasRAM);
        this.kartuGrafis=kartuGrafis;
        this.refreshRate=refreshRate;
    }
    public String getKartuGrafis(){
        return kartuGrafis;
    }
    public void setKartuGrafis (String kartuGrafis){
        this.kartuGrafis=kartuGrafis;
    }
    public int getRefreshRate(){
        return refreshRate;
    }
    public void setRefreshRate (int refreshRate){
        this.refreshRate=refreshRate;
    }
    
    @Override
    public void display(){
        System.out.println("Nama merek : "+this.merek);
        System.out.println("Tahun Produksi : "+this.tahunProduksi);
        System.out.println("Garansi Produk : "+this.garansi);
        System.out.println("Ukuran Layar Laptop : "+this.ukuranLayar);
        System.out.println("Kapasitas RAM Laptop: "+this.kapasitasRAM);
        System.out.println("Kartu Grafis Laptop : "+this.kartuGrafis);
        System.out.println("Refresh Rate Laptop: "+this.refreshRate);
    }
}
