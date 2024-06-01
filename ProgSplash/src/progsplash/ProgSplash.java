/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package progsplash;

/**
 *
 * @author USER
 */
public class ProgSplash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        FormAwal awal=new FormAwal();
        awal.setVisible(true);
        FormMenu menu=new FormMenu();
        
        //ini untuk exception handle
        
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(50);
                awal.loadingnum.setText(Integer.toString(i)+"%");
                awal.loadingbar.setValue(i);
                if (i == 100){
                    awal.setVisible(false);
                    menu.setVisible(true);
                }
            }
        }
        catch (Exception e){
        }
        }
        
    }
    
    

