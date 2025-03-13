/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5soal;
import java.util.Scanner;
/**
 *
 * @author nofri
 */
public class Latihan5soal5 {
    public static void main (String[]args){
        int menu, jum_pembelian;
        int x,y,z;
        long harga,tot_awal = 0;
        float diskon = 0 , tot_bayar;
        
        Scanner in = new Scanner (System.in);
        
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|");
        System.out.println("|       MEREK          |        HARGA        |");
        System.out.println("|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|");
        System.out.println("|   1.Merek X          |    Rp.40.000,00     |");
        System.out.println("|   2.Merek Y          |    Rp.50.000,00     |");
        System.out.println("|   3.Merek Z          |    Rp.60.000,00     |");
        System.out.println("|XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX|");
        System.out.println("Pilih Merek (angka)       : ");
        menu=in.nextInt();
        System.out.println("Masukkan jumlah Pembelian : ");
        jum_pembelian=in.nextInt();
        
        switch (menu){
            case 1:{
                harga  = 40000;
                tot_awal=harga*jum_pembelian;
                if(jum_pembelian>=3){
                    diskon=(float) (tot_awal*0.10);
                }
            }break;
            case 2:{
                harga = 50000;
                tot_awal=harga*jum_pembelian;
                if(jum_pembelian>3){
                    diskon=(float) (tot_awal*0.12);
                }
            }break;
            case 3:{
                harga = 60000;
                tot_awal=harga*jum_pembelian;
                if(jum_pembelian>1){
                    diskon=(float) (tot_awal*0.15);
                }
            }break;
            default:{
                harga=0;
                System.out.println("Merek tidak tersedia");
            }break;
        }
        tot_bayar = tot_awal - diskon;
        System.out.println("Total Biaya Awal         = Rp. "+tot_awal);
        System.out.println("Total Diskon             = Rp. "+diskon);
        System.out.println("Total yang harus dibayar = Rp. "+tot_bayar);
        
    }
    
}
