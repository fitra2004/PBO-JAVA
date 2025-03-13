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
public class Mobil {
    ///definisi class Mobil dengan atribut
    String warna;
    String merk;
    int tahun;
    String plat;
    
    ///method tanpa return
    public void MobilAktif(){
        System.out.println("Ready..Go!");
    }
    
    ///method dengan return
    String SuaraMobil(){
        return "BRUUMMMMM!!!";
    }
}
