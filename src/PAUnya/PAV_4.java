/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAUnya;

import javax.swing.JTextField;
/**
 *
 * @author ArifS
 */
public class PAV_4 {
    public static void textfieldNya(){
        //  Membuat Objek TextField
        JTextField textfieldku = new JTextField();
         
        //  Memasukkan TextField ke dalam Frame
        PAV_2.frameku.add(textfieldku);
         
        //  Menentukan posisi textfield di dalam Frame.
        textfieldku.setBounds(150, 20, 230, 30);
    }
}
