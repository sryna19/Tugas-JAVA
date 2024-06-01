/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithread;

/**
 *
 * @author USER
 */
public class MultiThread implements Runnable {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread MThread1 = new Thread("Penis");
        Thread MThread2 = new Thread("titit");
        Thread MThread3 = new Thread("kontol");
        
        MThread1.start();
        MThread2.start();
        MThread3.start();
        
        System.out.println("MULTITHREAD SEDANG BERJALAN YA KONTOL");
        
        System.out.println(MThread1.getName());
        System.out.println(MThread2.getName());
        System.out.println(MThread3.getName());
    }
    public void run(){}
    
}
