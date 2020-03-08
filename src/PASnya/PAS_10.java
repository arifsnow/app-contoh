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
public class PAS_10 {
        public static void main(String[] args){
        int n=10, a, c, d, e;
        if (n<=2){
            e = 0;
        } else if (n<=5){
            e = 1;
        } else if (n<=7){
            e = 2;
        } else if (n<=10){
            e = 3;
        } else {
            e = 0;
        }
        for (a=0; a<n-e; a++){
            for (c=a+1; c<n; c++){
                System.out.print(" ");
            }
            for (c=-1; c<a; c++){
                System.out.print("*");
            }
            for (c=0; c<a; c++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (a=-1; a<(n-1)-(n-e); a++){
            for (c=a+2; c<n-(n-e); c++){
                System.out.print(" ");
            }
            for (c=a+1; c<n-(n-e); c++){
                System.out.print("*");
            }
            for (c=e+e; c<a+n; c++){
                System.out.print("a");
            }
            for (c=e+e; c<a+n+e; c++){
                System.out.print("i");
            }
            for (c=e-1; c<a+e; c++){
                System.out.print("u");
            }
            for (c=e-1; c<a+3; c++){
                System.out.print("e");
            }
            for (c=a+1; c<n-(n-e); c++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
