
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
import java.util.Scanner;

public class Aritmatika {
    
    int a, b, hasil;
    
    public void BilPertama(int a){
        this.a = a;
    }
    
    public void BilKedua(int b){
        this.b = b;
    }
    
    public int getSum(){
         hasil = this.a + this.b;
         return(hasil);
    }
  
    public int getDifferent(){
       hasil = this.a - this.b;
         return(hasil);
    }
  
    public int getProduct(){
        hasil = this.a * this.b;
         return(hasil);
    }
  
    public int getQuotient(){
        hasil = this.a / this.b;
         return(hasil);
    }
    
    public static void main(String[] args){
    
    Scanner bil = new Scanner (System.in);
    System.out.print("java ArithmeticOperation " );
        int a = bil.nextInt();
        int b = bil.nextInt();
    
    Aritmatika aw = new Aritmatika();
        aw.BilPertama(a);
        aw.BilKedua(b);
        System.out.println("sum = "+aw.getSum());
        System.out.println("different = "+aw.getDifferent());
        System.out.println("product = "+aw.getProduct());
        System.out.println("quotient = "+aw.getQuotient());
    }
}
