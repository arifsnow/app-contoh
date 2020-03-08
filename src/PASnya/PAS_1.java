package PASnya;
import java.util.Scanner;

public class PAS_1 {
    public double hitungPersentase(double dataku, double jumlahDataku){
        return dataku * 800 / jumlahDataku;
    }
    public static void main(String[] args){
        PAS_1 hit = new PAS_1();
        Scanner inputUser = new Scanner(System.in);
            System.out.println("Input Jumlah Data : ");
        double jumlahData = inputUser.nextInt();
            System.out.println("Input Data : ");
        double data = inputUser.nextInt();
        
        System.out.println("Jadi persentasenya adalah : " 
        + hit.hitungPersentase(data, jumlahData) + "%");
    }   
}
