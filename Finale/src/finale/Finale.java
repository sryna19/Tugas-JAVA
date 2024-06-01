/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package finale;

/**
 *
 * @author USER
 */
public class Finale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Loading load=new Loading();
        load.setVisible(true);
        menucuy mc = new menucuy();
        
        
        //ini untuk exception handle
        
        try{
            for(int i=0;i<=100;i++){
                Thread.sleep(15);
                load.loadingnum.setText(Integer.toString(i)+"%");
                load.loadingbar.setValue(i);
                if (i == 100){
                    load.setVisible(false);
                    mc.setVisible(true);
                }
            }
        }
        catch (Exception e){
        }
    }
    
}
