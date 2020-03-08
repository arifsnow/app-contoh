/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAUnya;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
/**
 *
 * @author ArifS
 */
public class PAV_6 {
    public static void main(String[] args)
    {
        //  Membuat objek JFrame
        JFrame frame = new JFrame();
         
        //  Menentukan title bar di Frame
        frame.setTitle("Belajar JFrame");
         
        //  Menentukan ukuran Frame
        frame.setSize(400, 200);
         
        //  Membuat letak Frame berada di tengat ketika program dijalankan
        frame.setLocationRelativeTo(null);
         
        //  Mengaktifkan event agar ketika frame di close maka, program akan berhenti
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        //  [Optional] Untuk menonaktifkan button maximize di Frame
        frame.setResizable(false);
         
        //  Aktifkan Visible Frame
        frame.setVisible(true);
         
        //  Membuat Objek JLabel ------------------------------------
        JLabel label = new JLabel("Masukkan NIM");
         
        //  Menentukan layout Frame
        frame.setLayout(null);
         
        //  Memasukkan Label ke dalam Frame
        frame.add(label);
         
        //  Menentukan posisi label di dalam Frame. Menentukan Width dan Height
        label.setBounds(20, 20, 150, 30);   //  20 = posisi X; 20 = posisi Y; 100 = Width; 30; Height = 30
         
        //  Membuat Objek TextField ------------------------------------
        JTextField textfield = new JTextField();
         
        //  Memasukkan TextField ke dalam Frame
        frame.add(textfield);
         
        //  Menentukan posisi textfield di dalam Frame.
        textfield.setBounds(150, 20, 230, 30);
         
        //  Membuat Objek Button ---------------------------------------
        JButton button = new JButton("Simpan");
         
        //  Memasukkan Button ke dalam Frame
        frame.add(button);
         
        //  Menentukan posisi Button di dalam Frame
        button.setBounds(120, 60, 89, 20);
    }
}
