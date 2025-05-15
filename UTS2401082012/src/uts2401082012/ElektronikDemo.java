/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts2401082012;

import java.util.Scanner;

/**
 *
 * @author nofri
 */
public class ElektronikDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Menu Elektronik ===");
            System.out.println("1. Input Data Laptop");
            System.out.println("2. Input Data Gaming Laptop");
            System.out.println("3. Input Data Smartphone");
            System.out.println("4. Input Data Smartwatch");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine(); 

            switch (pilihan) {
                case 1:
                    Laptop laptop = new Laptop();

                    System.out.print("Masukkan merek: ");
                    laptop.setMerek(input.nextLine());

                    System.out.print("Masukkan tahun produksi: ");
                    laptop.setTahunProduksi(input.nextInt());

                    System.out.print("Masukkan garansi (tahun): ");
                    laptop.setGaransi(input.nextInt());

                    System.out.print("Masukkan ukuran layar (inci): ");
                    laptop.setUkuranLayar(input.nextInt());

                    System.out.print("Masukkan kapasitas RAM (GB): ");
                    laptop.setKapasitasRAM(input.nextInt());

                    System.out.println("\n--- Data Laptop ---");
                    laptop.Display();
                    break;

                case 2:
                    Gaming gaming = new Gaming();

                    System.out.print("Masukkan merek: ");
                    gaming.setMerek(input.nextLine());

                    System.out.print("Masukkan tahun produksi: ");
                    gaming.setTahunProduksi(input.nextInt());

                    System.out.print("Masukkan garansi (tahun): ");
                    gaming.setGaransi(input.nextInt());

                    System.out.print("Masukkan ukuran layar (inci): ");
                    gaming.setUkuranLayar(input.nextInt());

                    System.out.print("Masukkan kapasitas RAM (GB): ");
                    gaming.setKapasitasRAM(input.nextInt());

                    input.nextLine(); 
                    System.out.print("Masukkan kartu grafis: ");
                    gaming.setKartuGrafis(input.nextLine());

                    System.out.print("Masukkan refresh rate (Hz): ");
                    gaming.setRefreshRate(input.nextInt());

                    System.out.println("\n--- Data Gaming Laptop ---");
                    gaming.display();
                    break;

                case 3:
                    Smartphone smartphone = new Smartphone();

                    System.out.print("Masukkan merek: ");
                    smartphone.setMerek(input.nextLine());

                    System.out.print("Masukkan tahun produksi: ");
                    smartphone.setTahunProduksi(input.nextInt());

                    System.out.print("Masukkan garansi (tahun): ");
                    smartphone.setGaransi(input.nextInt());

                    System.out.print("Masukkan kapasitas baterai (mAh): ");
                    smartphone.setKapasitasBaterai(input.nextInt());

                    System.out.print("Masukkan jumlah kamera: ");
                    smartphone.setJumlahKamera(input.nextInt());

                    System.out.println("\n--- Data Smartphone ---");
                    smartphone.display();
                    break;

                case 4:
                    SmartWatch smartWatch = new SmartWatch();

                    System.out.print("Masukkan merek: ");
                    smartWatch.setMerek(input.nextLine());

                    System.out.print("Masukkan tahun produksi: ");
                    smartWatch.setTahunProduksi(input.nextInt());

                    System.out.print("Masukkan garansi (tahun): ");
                    smartWatch.setGaransi(input.nextInt());

                    System.out.print("Masukkan kapasitas baterai (mAh): ");
                    smartWatch.setKapasitasBaterai(input.nextInt());

                    System.out.print("Masukkan jumlah kamera: ");
                    smartWatch.setJumlahKamera(input.nextInt());

                    System.out.print("Masukkan ukuran layar (inci): ");
                    smartWatch.setUkuranLayar(input.nextInt());

                    System.out.print("Apakah tahan air (true/false): ");
                    smartWatch.setTahanAir(input.nextBoolean());

                    System.out.println("\n--- Data Smartwatch ---");
                    smartWatch.display();
                    break;

                case 0:
                    System.out.println("Keluar dari program.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        input.close();
    }
}

