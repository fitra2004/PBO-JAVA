/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tkanofriaidilfitra;

/**
 *
 * @author nofri
 */
public class PersegiPanjangEnkapsulasi {
    private int panjang;
    private  int lebar;
    private static int JumlahObjek = 0;
    
    // Konstruktor Default
    public PersegiPanjangEnkapsulasi (){
        this.panjang = 0;
        this.lebar = 0;
        JumlahObjek++;
    }
    //// Konstruktor dengan parameter
    public PersegiPanjangEnkapsulasi(int panjangBaru, int lebarBaru){
    this.panjang = panjangBaru;
    this.lebar = lebarBaru;
    JumlahObjek++;
 }
    // Setter dan getter untuk panjang
    public void setPanjang(int panjangBaru){
    this.panjang = panjangBaru;
    }  
    public int getPanjang() {
    return panjang;
    }  
    // Setter dan getter untuk lebar
    public void setLebar(int lebarBaru){
    this.lebar = lebarBaru;
    }  
    public int getLebar() {
    return lebar;
    }
   
    // Getter untuk jumlah objek
    public static int getJumlahObjek() {
    return JumlahObjek;
    }
    
    // Method untuk menghitung luas
    public int getLuas() {
    return panjang * lebar;
    }
    
    // Method untuk menghitung keliling
    public int getKeliling() {
    return 2 *(panjang + lebar);
    }
}
    
