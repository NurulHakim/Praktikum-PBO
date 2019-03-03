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
public class Luas {
    float panjang, lebar;
    
    public void setPanjang(float panjang){
        this.panjang = panjang;
    }
    
    /**
     *
     */
    public void setLebar(float lebar){
        this.lebar = lebar;
    }
    
    public float getLuas(){
        float luas;
         luas = this.panjang * this.lebar;
         return(luas);
    }
  
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        Luas aw = new Luas();
        aw.setPanjang(2);
        aw.setLebar(5);
        System.out.println("Luas = "+aw.getLuas());
        
    }
    
}


