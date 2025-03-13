/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum13032025;
import java.util.Scanner;
/**
 *
 * @author nofri
 */
public class KendaraanMain {
    public static void main (String[]args){
        String jns;
        int thn;
        String wrn;
        int v;
        
        Scanner in=new Scanner(System.in);
        ///meminta input
        System.out.print("Masukkan jenis kendaraan = ");
        jns = in.nextLine();
        System.out.print("Tahun keluaran = ");
        thn = in.nextInt();
        in.nextLine();///
        System.out.print("Warna kendaraaan = ");
        wrn = in.nextLine();
        
        ///inputkan data kecepatan max kendaraan
        System.out.print("Masukkan data kecepatan max per jam kendaraan = ");
        v=in.nextInt();
        
        ///deklarasi objek
        Kendaraan mobil1=new Kendaraan(jns,thn,wrn);
        System.out.println("\n--Informasi Kendaraan 1--");
        mobil1.TampilData();
        
        mobil1.TipeKendaraan(v);
    }
}
