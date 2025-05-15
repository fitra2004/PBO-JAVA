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
public class Laptop extends Elektronik{
    int ukuranLayar;
    int kapasitasRAM;
    
    public Laptop (){
    }
    public Laptop (int ukuranLayar, int kapasitasRAM){
        this.ukuranLayar=ukuranLayar;
        this.kapasitasRAM=kapasitasRAM;
    }
    public Laptop (String merek, int tahunProduksi, int garansi,int ukuranLayar, int kapasitasRAM){
        super (merek,tahunProduksi,garansi);
        this.ukuranLayar=ukuranLayar;
        this.kapasitasRAM=kapasitasRAM;
    }

    public int getUkuranLayar(){
        return ukuranLayar;
    }
    public void setUkuranLayar (int ukuranLayar){
        this.ukuranLayar=ukuranLayar;
    }
    public int getKapasitasRAM(){
        return kapasitasRAM;
    }
    public void setKapasitasRAM (int kapasitasRAM){
        this.kapasitasRAM=kapasitasRAM;
    }
    
    public void Display(){
        System.out.println("Nama merek : "+this.merek);
        System.out.println("Tahun Produksi : "+this.tahunProduksi);
        System.out.println("Garansi Produk : "+this.garansi);
        System.out.println("Ukuran Layar Laptop : "+this.ukuranLayar);
        System.out.println("Kapasitas RAM Laptop: "+this.kapasitasRAM);
    }
    
}
