/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inheritance;

/**
 *
 * @author USER
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        A VarsuperOb = new A();
        B VarsubOb = new B();
        
        System.out.println("SupperClass"); 
        
        VarsuperOb.x = 10;
        VarsuperOb.y = 20;
        VarsuperOb.TampilkanNilaixy();
                
        System.out.println("SubClass");
        
        VarsubOb.x = 5;
        VarsubOb.y = 4;
        VarsubOb.TampilkanNilaixy();
        
        System.out.println("Subclass jumlah");
        
        VarsubOb.z = 30;
        VarsubOb.TampilkanJumlah();
        
        System.out.println("Subclass");
        VarsubOb.x = 15;
        VarsubOb.y = 14;
        VarsubOb.TampilkanNilaixy();
        
        System.out.println("SuperClass");
        VarsuperOb.x = 10;
        VarsuperOb.y = 20;
        
        VarsuperOb.TampilkanNilaixy();
        
        System.out.println("Subclass Jumlah");
        VarsubOb.z = 60;
        VarsubOb.TampilkanJumlah();
    
    }
    private static class A{
        int x; int y; 
        
        void TampilkanNilaixy(){
            System.out.println("Nilai x ; " + ", y ;"+y);
        }
    }
    
    private static class B extends A {
        int z;
        
        void TampilkanJumlah(){
            System.out.println("Jumlah : "+ (x+y+z));
        }
    }
}
