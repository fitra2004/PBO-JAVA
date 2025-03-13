/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum13032025;

/**
 *
 * @author nofri
 */
public class Kendaraan {
    String jenis;
    int tahun;
    String warna;
    
    ///constructor
    public Kendaraan(String j, int t, String w){
        this.jenis=j;
        this.tahun=t;
        this.warna=w;
    }
    ///method untuk menampilkan data
    public void TampilData(){
        System.out.println("Jenis kendaraan = "+jenis);
        System.out.println("Warna kendaraan = "+warna);
        System.out.println("Tahun keluaran  = "+tahun);
    }
    
    //method dengan parameter
    public void TipeKendaraan(int kec){
        System.out.println("Tipe kendaraan Anda");
        if(kec<20){
            System.out.println("Lebih baik jalan");
            System.out.println("Ganti kendaraaan saja");
        }
        else if (kec<40){
            System.out.println("Slow");
        }
        else if (kec<80){
            System.out.println("Standar");
        }
        else if (kec<100){
            System.out.println("fast");
        }
        else
            System.out.println("Racing Car!!!");
    }
            
}
