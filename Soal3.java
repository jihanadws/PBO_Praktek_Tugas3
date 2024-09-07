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

public class Soal3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A = sc.nextInt();
        char operator = sc.next().charAt(0);
        int B = sc.nextInt();
        
        int result = 0;
        
        switch (operator) {
            case '+':
                result = A + B;
                break;
            case '-':
                result = A - B;
                break;
            case '*':
                result = A * B;
                break;
            case '/':
                result = A / B;
                break;
            case '%':
                result = A % B;
                break;
            default:
                System.out.println("Operator tidak valid");
                return;
        }
        System.out.println(result);
    }
}
