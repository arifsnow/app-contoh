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
public class PAT_1 {
    
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        double menitTahun = 60 * 24 * 365;
            System.out.println("Masukkan angka dalam menit : ");
        double angka = input.nextDouble();
        long tahun = (long) (angka / menitTahun);
        int hari = (int) (angka / 60/24) % 365;
        System.out.println((int) angka + " menit adalah sekitar " + tahun + " Tahun dan "
        + hari + " Hari.");
    }
    
}
