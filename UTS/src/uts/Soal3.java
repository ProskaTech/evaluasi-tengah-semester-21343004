/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts;



/**
 *
 * @Created by Azzahra Putri
 */
import javax.swing.JOptionPane;
public class Soal3 {
     public static void main(String[] args) {
        int angka;
        String a;
        
        a = JOptionPane.showInputDialog("Masukkan Angka");
        angka = Integer.parseInt (a);
        
        if(angka >=0){
            JOptionPane.showMessageDialog(null, "Angka"+angka+"merupakan bilangan positif");
         }
        else{
            JOptionPane.showMessageDialog(null, "Angka"+angka+"merupakan bilangan negatif");
            
        }
               
     }
     }
     
