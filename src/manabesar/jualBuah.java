/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manabesar;
import java.util.Arrays;
import java.util.Random;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class jualBuah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String gaguna = input.nextLine();
        int a = 0;
        
        System.out.print("Masukkan total barang : ");
        a = input.nextInt();
        String[] buah = new String[a];
        int[] jumlah = new int[a];
        int max = jumlah[0];
        
        System.out.println("Masukkan "+buah.length+" barang : ");
        for(int i = 0; i < buah.length; i++) {
            buah[i] = input.nextLine();
        }        
        System.out.println("");
        System.out.println("Barang : "+Arrays.toString(buah));
        
        for (int j = 0; j < buah.length; j++) {
            if (jumlah[j] > max) {
                max = jumlah[j];
            }
        }
        System.out.println("Barang terbanyak : "+buah[max]);
        
    }
    
}
