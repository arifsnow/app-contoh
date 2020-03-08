/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAUnya;

import javax.swing.JLabel;

/**
 *
 * @author ArifS
 */
public class PAV_3 {
    public static void labelNya(){
        //  Membuat Objek JLabel
        JLabel labelku = new JLabel("Masukkan NIM");
        
        //  Menentukan layout Frame Sebelumnya
        PAV_2.frameku.setLayout(null);
         
        //  Memasukkan Label ke dalam Frame Sebelumnya
        PAV_2.frameku.add(labelku);
         
        //  Menentukan posisi label di dalam Frame. Menentukan Width dan Height
        labelku.setBounds(20, 20, 150, 30);   //  20 = posisi X; 20 = posisi Y; 100 = Width; 30; Height = 30

    }
}
