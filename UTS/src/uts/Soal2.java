/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;

/**
 *
 * @Created by azzahra putri21343004
 */
import java.util.Scanner;
public class Soal2 {
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         
         System.out.print("Masukkan jumlah baris :");
         int n = in.nextInt();
         for (int a = 1; a <=n; a++){
              for (int b = 1; b < a; b++)
              {
             System.out.print(" ");
         }
              for (int c = a; c <= n; c++)
              {
             System.out.print("# ");
              }   
          System.out.println("");
         }
         for (int a = n; a >= 1; a--){
             for (int b = 1; b < a; b++)
             {
             System.out.print(" ");
             }
             for (int c = a; c <= n; c++)
             {
             System.out.print("* ");
             }
             System.out.println("");
         }
}
}


