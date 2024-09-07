/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jihan
 */

import java.math.BigInteger;
import java.util.Scanner;
        
public class Soal6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String a = sc.next();
        String b = sc.next();
        
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        
        BigInteger sum = bigA.add(bigB);
        BigInteger product = bigA.multiply(bigB);
        
        System.out.println(sum);
        System.out.println(product);
    }
}
