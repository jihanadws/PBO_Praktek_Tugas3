/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jihan
 */

import java.util.Scanner;

public class Soal4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int gajiPokok = 500000;
        int hargaPerItem = 50000;
        
        int jumlahPenjualan = sc.nextInt();
        
        int totalPenjualan = jumlahPenjualan * hargaPerItem;
        double gaji = gajiPokok;
        
        if (jumlahPenjualan > 80) {
            gaji += totalPenjualan * 0.35;
        } else if (jumlahPenjualan >= 40) {
            gaji += totalPenjualan * 0.25;
        } else if (jumlahPenjualan < 15) {
            int selisih = 15 - jumlahPenjualan;
            gaji -= selisih * hargaPerItem * 0.15;
        } else {
            gaji += totalPenjualan * 0.10;
        }
        System.out.println((int)gaji);
    }
    
    
}
