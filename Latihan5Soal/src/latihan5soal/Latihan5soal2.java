/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan5soal;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author nofri
 */
public class Latihan5soal2 {
    public static void main (String[] args){
        int A[];//deklarasi array
        int B[];
        int i,uk,ukb,sum;//i=indeks,uk=ukuran
        Scanner in=new Scanner (System.in);
        Random rand=new Random();
        System.out.print("Masukkan Ukuran array A = ");
        uk=in.nextInt();
        System.out.print("Masukkan Ukuran array B = ");
        ukb=in.nextInt();
        A=new int[uk];
        for(i=0;i<uk;i++){
            A[i]=rand.nextInt(100)+1;
            }
        B=new int [ukb];
        for (i=0;i<ukb;i++){
            B[i]=rand.nextInt(100)+1;
        }
        //menampilkan array
        System.out.println("---Isi Array---");
        System.out.print("Array A :\t");
        for(i=0;i<uk;i++)
        System.out.print(A[i]+"\t");
        System.out.println();
        
        System.out.print("Array B :\t");
        for(i=0;i<ukb;i++)
        System.out.print(B[i]+"\t");
        System.out.println();
        
        System.out.print("Array C :\t");
        if (uk > ukb){
            for(i=0;i<uk;i++)
            System.out.print(A[i]+"\t");
            for(i=0;i<ukb;i++)
            System.out.print(B[i]+"\t");
        }
        else{
            for(i=0;i<ukb;i++)
            System.out.print(B[i]+"\t");
            for(i=0;i<uk;i++)
            System.out.print(A[i]+"\t");
        }
        
    }
}
