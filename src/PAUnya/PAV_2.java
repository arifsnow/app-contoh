/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PAUnya;

import javax.swing.JFrame;
/**
 *
 * @author ArifS
 */
public class PAV_2 {
    //	Membuat objek JFrame diakses Seluruh Class
    public static JFrame frameku = new JFrame();
    
    // Membuat method Frame
    public static void frameNya(){
        //	Menentukan title bar di Frame
        frameku.setTitle("Belajar JFrame");

        //	Menentukan ukuran Frame
        frameku.setSize(400, 200);

        //	Membuat letak Frame berada di tengat ketika program dijalankan
        frameku.setLocationRelativeTo(null);

        //	Mengaktifkan event agar ketika frame di close maka, program akan berhenti
        frameku.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //	[Optional] Untuk menonaktifkan button maximize di Frame
        frameku.setResizable(false);

        //	Aktifkan Visible Frame
        frameku.setVisible(true);
    }
}
