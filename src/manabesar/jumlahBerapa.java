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
public class jumlahBerapa {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        int s = 0;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Total angka");
        System.out.println("");
        System.out.print("Masukkan angka : ");
        int a = input.nextInt();
        
        for(int i = 1; i <= a; i++) {
            if(a == i) {
                System.out.print(i);
            } else {
                System.out.print(i+" + "); 
            }
            
            s+=i;
        }
        System.out.println(" = "+s);
        
    }
        
    
}
