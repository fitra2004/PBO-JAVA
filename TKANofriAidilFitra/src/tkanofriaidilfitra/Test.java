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
public class Test {
    public static void main(String[] args) {
        // Membuat dua objek Nasabah
        Nasabah nasabah1 = new Nasabah("Mas", "Fitra");
        Tabungan tabungan1 = new Tabungan(10000);
        nasabah1.setTabungan(tabungan1);

        Nasabah nasabah2 = new Nasabah("Mbak", "Na");
        Tabungan tabungan2 = new Tabungan(20000);
        nasabah2.setTabungan(tabungan2);

        System.out.println("Nasabah 1: " + nasabah1);
        System.out.println("Nasabah 2: " + nasabah2);

        // Nasabah 1 menabung
        nasabah1.getTabungan().simpanUang(4000);
        System.out.println("Saldo Nasabah 1 setelah menabung (4000) : " + nasabah1.getTabungan().getSaldo());

        // Nasabah 2 menabung
        nasabah2.getTabungan().simpanUang(7000);
        System.out.println("Saldo Nasabah 2 setelah menabung (7000): " + nasabah2.getTabungan().getSaldo());

        // Nasabah 1 mengambil uang
        if (nasabah1.getTabungan().ambilUang(5000)) {
            System.out.println("Saldo Nasabah 1 setelah mengambil uang (5000) : " + nasabah1.getTabungan().getSaldo());
        } else {
            System.out.println("Nasabah 1 gagal mengambil uang. Saldo tidak mencukupi.");
        }

        // Nasabah 2 mengambil uang
        if (nasabah2.getTabungan().ambilUang(6000)) {
            System.out.println("Saldo Nasabah 2 setelah mengambil uang (6000) : " + nasabah2.getTabungan().getSaldo());
        } else {
            System.out.println("Nasabah 2 gagal mengambil uang. Saldo tidak mencukupi.");
        }

        // Nasabah 2 mentransfer uang ke Nasabah 1
        if (nasabah2.getTabungan().transfer(nasabah1.getTabungan(), 1000)) {
            System.out.println("Transfer saldo Mbak Na ke Mas Fitra (1000) ");
        } else {
            System.out.println("Transfer gagal. Saldo Nasabah tidak mencukupi.");
        }

        // Menampilkan saldo akhir
        System.out.println("Saldo akhir Nasabah 1: " + nasabah1.getTabungan().getSaldo());
        System.out.println("Saldo akhir Nasabah 2: " + nasabah2.getTabungan().getSaldo());
    }     
}
