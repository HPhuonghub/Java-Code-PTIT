/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Tinhluythua {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true){
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            if(a==0 && b==0) break;
            System.out.println(pow(a, b));
        }
    }
    public static long pow(long n,long k){
        long M = (long)Math.pow(10, 9)+7;
        if(k==0) return 1;
        long x = pow(n,k/2);
        if(k%2==0) return x*x%M;
        return n*(x*x%M)%M;   
    }
}
