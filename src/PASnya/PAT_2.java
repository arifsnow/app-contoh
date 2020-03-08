/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PASnya;

import java.util.Scanner;

/**
 *
 * @author ArifS
 */
public class PAT_2 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        double menitTahun = 60 * 24 * 365;
            System.out.println("Masukkan angka dalam detik : ");
        double detik = input.nextInt();
        PAS_5 objPAS5 = new PAS_5();
        double angka = objPAS5.konversiMenit((int) detik);
        long tahun = (long) (angka / menitTahun);
        int hari = (int) (angka / 60/24) % 365;
        System.out.println((int) angka + " menit adalah sekitar " + tahun + " Tahun dan "
        + hari + " Hari.");
    }
    
}
