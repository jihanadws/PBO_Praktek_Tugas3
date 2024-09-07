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
        
public class Soal2 {
    public static void main(String[] agrs) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x  = sc.nextInt();
            
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");
    }
}
