/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum17042025;

/**
 *
 * @author nofri
 */
public class Kucing extends Hewan{
    
    public Kucing(String nama){
        super (nama);
    }
    
    public void bersuara(){
        super.bersuara();
        System.out.println(nama+"berkata Meong!!!");
    }
    
}
