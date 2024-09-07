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

public class Soal5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String mobil1 = sc.next();
        String mobil2 = sc.next();
        String mobil3 = sc.next();
        String mobil4 = sc.next();
        
        String gabunganPlat = mobil1 +mobil2 + mobil3 + mobil4;
        
        long angkaGabungan = Long.parseLong(gabunganPlat);
        
        long hasil = (angkaGabungan - 999999) % 5;
        
        if (hasil == 0) {
            System.out.println("Berenti");
        } else {
            System.out.println("Jalan");
        }
    }
}
