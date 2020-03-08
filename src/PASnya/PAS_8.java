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

class Binatang {
    public void makan() {
        System.out.println("Binatang makan..");
    }
    public void tidur() {
        System.out.println("zZzz zZzz..");
    }
}
class Anjing extends Binatang {
    @Override
    public void makan() {
        System.out.println("Anjing makan tulang..");
    }
    public void suaraAnjing() {
        System.out.println("Guk ! Guk !");
    }
}
class Burung extends Binatang {
    @Override
    public void makan() {
        System.out.println("Burung makan beras..");
    }
    public void suaraBurung() {
        System.out.println("Cit ! Cit !");
    }
}
class Robot {
    public void makan() {
        System.out.println("Sedang di cas");
    }
    public void modif() {
        System.out.println("Ubah warna body");
    }
}
public class PAS_8 {
    public static void main (String[] args) {
        Binatang binatang1 = new Binatang();
        Anjing anjing1 = new Anjing();
        Burung burung1 = new Burung();
        binatang1.makan();
        anjing1.makan();
        anjing1.suaraAnjing();
        anjing1.tidur();
        burung1.makan();
        System.out.println("");
        
        Binatang binatang2 = new Anjing();
        binatang2.makan();
        
        Anjing anjing2 = (Anjing) binatang2;
        anjing2.makan();
        
        Robot drone = new Robot();
        drone.makan();
        
    }
}