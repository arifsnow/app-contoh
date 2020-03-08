/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PASnya;

/**
 *
 * @author ArifS
 */
public class PAS_7 {
    public static void main (String[] args) {
        int a, b, c = 1;
        for (a=1; a<=8; a++){
            System.out.println();
            for (b=c; b<=7; b++){
                System.out.print(" * ");
            }   
            c++;
        }
        System.out.println();
        System.out.println();
        int d, e, f = 1;
        for (d=1; d<=8; d++){
            System.out.println();
            for (e=2; e<=f; e++){
                System.out.print(" * ");
            }   
            f++;
        }
    }
}
