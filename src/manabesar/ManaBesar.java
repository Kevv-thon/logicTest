/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manabesar;
import java.util.Scanner;


/**
 *
 * @author LENOVO
 */
public class ManaBesar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Angka terbesar yang mana?");
        System.out.println("");
        System.out.print("Masukkan Angka 1 : ");
        int a = input.nextInt();
        System.out.print("Masukkan Angka 2 : ");
        int b = input.nextInt();
        
        if (a > b) {
            System.out.println("Angka terbesar : "+a);
        } else {
            System.out.println("Angka terbesar : "+b);
        }
    }
    
}
