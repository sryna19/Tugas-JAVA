/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package contohpolimorfisme.JanganBuka.DibilangiJangan.MasihNgeyel.JanganAsu.Dahlah.BodoAmatlah;

/**
 *
 * @author USER
 */
import java.util.*;
public class Ujang {
    public static void main(String[] args) {
        Random r = new Random();
        int angkaR = r.nextInt(3);
        Scanner scan = new Scanner(System.in);
        
        String com, player;
        
        com = switch (angkaR) {
            case 0 -> "Batu";
            case 1 -> "Kertas";
            default -> "Gunting";
        };
        
        System.out.print("Pilih: ");
        player = scan.next();
        
        if (com.equals(player)){
            System.out.println(com);
            System.err.println("Seri");
        }else if ("Batu".equals(com)){
            switch (player) {
                case "Kertas" -> {
                    System.out.println("Komputer : " + com);
                    System.out.println("Menang");
                    break;
                }
                case "Gunting" -> {
                    System.out.println("Komputer : " + com);
                    System.out.println("Kalah");
                    break;
                }
                default -> System.out.println("ERROR");
            }
        }else if ("Kertas".equals(com)){
            switch (player) {
                case "Batu" -> {
                    System.out.println("Komputer : " + com);
                    System.out.println("Kalah");
                    break;
                }
                case "Gunting" -> {
                    System.out.println("Komputer : " + com);
                    System.out.println("Menang");
                    break;
                }
                default -> System.out.println("ERROR");
            }
        }else if ("Gunting".equals(com)){
            switch (player) {
                case "Batu" -> {
                    System.out.println("Komputer : " + com);
                    System.out.println("Kalah");
                    break;
                }
                case "Kertas" -> {
                    System.out.println("Komputer : " + com);
                    System.out.println("Menang");
                    break;
                }
                default -> System.out.println("ERROR");
            }
        }
    
    }  
}
