/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contohpolimorfisme;

/**
 *
 * @author USER
 */
    abstract class Bentuk{
        protected int panjang;
        protected int lebar;
        
        public String getBentuk() { return "Bentuk Dasar"; };
        
        public int hitungLuas() { return panjang*lebar/2;};
             
      }

class BujurSangkar extends Bentuk {
       public BujurSangkar(int panjang1, int lebar1){
           this.panjang = panjang1;
           this.lebar = lebar1;
       }
       
       public String getBentuk() { return "Bentuk Bujur Sangkar"; }
       
       public int hitungluas() {
           return panjang*lebar;
       }
   
}

class segiTiga extends Bentuk {
    public segiTiga (int panjang2, int lebar2){
        this.panjang=panjang2;
        this.lebar=lebar2;
    }
    public String getBentuk() {
        return "bentukSegitiga";
    }
}

class Polimerfisme{
    public static void cetakLuasBentuk(Bentuk btk){
        System.out.println(btk.getBentuk()+ " denganluas " + btk.hitungLuas());
    }
    
    public static void main(String[] args ){
        BujurSangkar bs = new BujurSangkar(10,20);
        BujurSangkar bs1 = new BujurSangkar(10,20);
        segiTiga st = new segiTiga(5,10);
        segiTiga st1 = new  segiTiga(50,100);
        
        cetakLuasBentuk(bs);
        cetakLuasBentuk(bs1);
        cetakLuasBentuk(st);
        cetakLuasBentuk(st1);
    }
}


        
public class Polimorfisme {
    
}
