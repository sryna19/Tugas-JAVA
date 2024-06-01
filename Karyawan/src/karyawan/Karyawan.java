/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package karyawan;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Karyawan {

    /**
     * @param args the command line arguments
     */
    String ID,nama,divisi;
    Double gaji;
    public Karyawan(String kode,String Nama,String div,Double Gaji){
        ID= kode;
        nama= Nama;
        divisi= div;
        gaji= Gaji;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Data Karyawan :");
        System.out.print("ID : ");
        String id = scan.next();
        System.out.print("Nama : ");
        String n = scan.next();
        System.out.print("Divisi : ");
        String d = scan.next();
        System.out.print("Gaji : ");
        Double g = scan.nextDouble();
        Karyawan k = new Karyawan(id,n,d,g);
        System.out.println("====================");
        
        System.out.println("ID : "+ k.ID);
        System.out.println("Nama : "+ k.nama);
        System.out.println("Divisi "+ k.divisi);
        System.out.println("Gaji "+ k.gaji);
        
        
        
    }
    
}
