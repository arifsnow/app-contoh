/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAUnya;

import javax.swing.JButton;
/**
 *
 * @author ArifS
 */
public class PAV_5 {
    public static void buttonNya(){
        //  Membuat Objek Button
        JButton buttonku = new JButton("Simpan");
         
        //  Memasukkan Button ke dalam Frame
        PAV_2.frameku.add(buttonku);
         
        //  Menentukan posisi Button di dalam Frame
        buttonku.setBounds(120, 60, 89, 20);
    }
}
