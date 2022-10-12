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
public class catdoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0){
            long n = scanner.nextLong();
            int dem = 0;
            long a = 0;
            int count = 0;
            while(n>0){
                long m = 0;
                m = n%10;
                n /= 10;
                if(m==0 || m==8 || m==9){
                    count += 1;
                }
                else if(m==1){
                    long k = 1;
                    long h=count;
                    while(h>0){
                        k = k*10;
                        h = h-1;
                    }
                    a = k + a;
                    count += 1;
                }
                else{
                    dem = 1;
                }
            }
            if(dem==1||a==0) System.out.println("INVALID");
            else System.out.println(a);
            t-=1;
        }
    }
}
