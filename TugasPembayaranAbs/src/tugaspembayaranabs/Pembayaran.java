/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspembayaranabs;

/**
 *
 * @author nofri
 */
public abstract class Pembayaran {
    protected double totalBayar;

    public Pembayaran(double totalBayar) {
        this.totalBayar = totalBayar;
    }

    public abstract void pilihMetode();
}
