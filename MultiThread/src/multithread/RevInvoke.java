/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithread;
import java.awt.Container;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;






/**
 *
 * @author USER
 */
public class RevInvoke {
    private static JButton good = new JButton("THREAD 1");
    private static JButton bad2 = new JButton("THREAD 2");
    private static JLabel resultLabel = new JLabel ("THREAD SIAP DICOBA", JLabel.CENTER);
    
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p = new JPanel();
        p.setOpaque(true);
        p.setLayout(new FlowLayout ());
        p.add(good);
        p.add(bad2);
        
        Container c = f.getContentPane();
        c.setLayout(new BorderLayout());
        c.add (p, BorderLayout.CENTER);
        c.add(resultLabel, BorderLayout.SOUTH);
        
        good.addActionListener(new ActionListener(){
            
        }
        
    }
    
}
