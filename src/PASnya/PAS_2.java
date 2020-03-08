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
public class PAS_2 {
    
    public static double hitungPersentase(double data, double jumlahData){
        return data * 100 / jumlahData;
    }
    public static void main(String[] args){
        
        Scanner inputUser = new Scanner(System.in);
            System.out.println("Input Jumlah Data : ");
        double jumlahData = inputUser.nextInt();
            System.out.println("Input Data : ");
        double data = inputUser.nextInt();
        
        System.out.println("Jadi persentasenya adalah : " 
        + hitungPersentase(data, jumlahData) + "%");
    }
    
}
