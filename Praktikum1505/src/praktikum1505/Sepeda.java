/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum1505;

/**
 *
 * @author nofri
 */
public class Sepeda extends Kendaraan{
    protected String jmlSadel;
    protected int jmlGir;
    
    public Sepeda(){
        
    }
    public Sepeda(String jmlSadel,int jmlGir){
        this.jmlSadel=jmlSadel;
        this.jmlGir=jmlGir;   
    }
    public Sepeda(int jmlRoda, String warna, String jmlSadel,int jmlGir){
        super (jmlRoda,warna);
        this.jmlSadel=jmlSadel;
        this.jmlGir=jmlGir;   
    }
    public void setJmlSadel(){
        this.jmlSadel=jmlSadel;
    }
    public String getJmlSadel(){
        return jmlSadel;
    }
    public void jmlGir(){
        this.jmlGir=jmlGir;
    }
    public int getJmlGir(){
        return jmlGir;
    }
    @Override
    public void display (){
        System.out.println("Kelas Sepeda");
        System.out.println("Jumlah Roda :"+this.jmlRoda);
        System.out.println("Warna Kendaraan :"+this.warna);
        System.out.println("Jumlah Sadel :"+this.jmlSadel);
        System.out.println("Jumlah Gir :"+this.jmlGir);
        
    }
}