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
public class Latihan5Soal4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Meminta input dari user
        System.out.print("Masukkan angka: ");
        int n = in.nextInt();

        // Perulangan untuk mencetak pola
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Kondisi untuk mencetak "0" atau "*"
                if (j == 0 || i == j||i==0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}
