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
public class Mahasiswa {
    int nip;
    String nama;
    
    public Mahasiswa(int i, String n){
        nip = i;
        nama = n;
    }
    
    public int getNrp(){
        return nip;
}
    public String getNama(){
        return nama;
    }
}
