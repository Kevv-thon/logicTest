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
public class maxArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random r = new Random();
        int a = 0;
        
        System.out.println("Mencari Maximum");
        System.out.println("");
        System.out.print("Masukkan jumlah array : ");
        a = input.nextInt();
        int[] no = new int[a];
        int max = no[0];
        
        for(int i = 0; i < no.length; i++){
            no[i] = r.nextInt(20);
        }
        System.out.println(Arrays.toString(no));
        System.out.println("");
        
        for(int i = 0; i < no.length; i++){
            if(no[i] > max) {
                max = no[i];
            }
        }
        System.out.println("Terbesar : "+max);
    }
    
}
