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
public class mungkinKah {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int a = 0;
        int b = 0;
        int hasil = 0;
        String desc = "TIDAK BISA";
        
        System.out.println("Mencari hasil dari array dari 2 angka ");
        System.out.println("");
        System.out.print("Masukkan jumlah array : ");
        a = input.nextInt();
        int[] no = new int[a];
        
        for(int i = 0; i < no.length; i++){
            no[i] = r.nextInt(15);;
        }
        System.out.println(Arrays.toString(no));
        System.out.println("");
        
        System.out.print("Masukkan total angka yang diinginkan : ");
        b = input.nextInt();
        
        for(int i = 0; i < a; i++) {
            for(int j = 0; j < a; j++) {
                if(no[i] != no[j]) {
                    if(no[i] + no[j] == b) {
                        hasil++;
                    }
                }
            }
        }
        if (hasil > 0) {
            desc = "BISA";
        }
        System.out.println("");
        System.out.println("Array : "+Arrays.toString(no));
        System.out.println("Apakah mungkin? " + desc);
    }
    
}
