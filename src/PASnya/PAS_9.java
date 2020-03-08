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
public class PAS_9 {
    public static void main(String[] args){
        int n=6, a, c, d;
        for (a=0; a<n-2; a++){
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
        for (a=-1; a<n-(n-1); a++){
            for (c=a+2; c<n-(n-2); c++){
                System.out.print(" ");
            }
            for (c=a; c<n-(n-1); c++){
                System.out.print("*");
            }
            for (c=2; c<a+n; c++){
                System.out.print(" ");
            }
            for (c=1; c<a+n-2; c++){
                System.out.print(" ");
            }
            for (c=-1; c<a; c++){
                System.out.print(" ");
            }
            for (c=-1; c<a; c++){
                System.out.print(" ");
            }
            for (c=a; c<n-(n-1); c++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
