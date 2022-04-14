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
public class ganjilOrGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Angka ganjil atau genap");
        System.out.println("");
        System.out.print("Masukkan angka : ");
        int a = input.nextInt();
        
        if (a % 2 == 0) {
            System.out.println("Angka "+a+" adalah genap");
        } else {
            System.out.println("Angka "+a+" adalah ganjil");
        }
    }
    
}
