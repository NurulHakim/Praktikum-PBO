/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrakPbo;

/**
 *
 * @author ASUS
 */
public class Lingkaran {
    double jari;
   
    
    public void IsiJari(double jari){
        this.jari = jari;
    }
    
    public double getLuas(){
        return 3.14*jari*jari;
    }
    public double getKeliling(){
        return 2*3.14*jari;
    }
    
    public void getHasil(){
        System.out.println("Luas Lingkaran = "+getLuas());
        System.out.println("Keliling Lingkaran = "+getKeliling());
    }
    
    public static void main(String args[]){
        Lingkaran aw = new Lingkaran();
        aw.IsiJari(5.0);
        aw.getHasil();
    }
}
