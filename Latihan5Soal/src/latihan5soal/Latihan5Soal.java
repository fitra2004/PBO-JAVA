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
public class Latihan5Soal {
    /**
     * @param args the command line arguments
     */
    //fungsi untuk menghitung faktorial
   
    public static void main(String[] args){
        int n,r,i;
        int mutasi=1, kombinasi=1, x=1;
        
        Scanner input = new Scanner(System.in);
        
        //input dari user
        System.out.print("Masukan nilai n: ");
        n = input.nextInt();
        System.out.print("Masukan nilai r: ");
        r = input.nextInt();
        System.out.println("=================");
        
        for (i=n; i>(n-r); i--){
        mutasi *= i;}
        for (i=r; i>(1); i--){
        x *=i;}
        kombinasi = mutasi/x;
        
            System.out.println("Nilai Permutasi:"+mutasi);
            System.out.println("Nilai Kombinasi:"+kombinasi);
        }
    
}
