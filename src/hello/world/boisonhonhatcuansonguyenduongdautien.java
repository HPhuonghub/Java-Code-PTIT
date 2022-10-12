/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;
import java.util.*;
import java.math.*;
/**
 *
 * @author DELL
 */
public class boisonhonhatcuansonguyenduongdautien {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            long n = in.nextLong();
            long s = 1;
            for(int i=1;i<=n;i++){
                s = s*i/ucln(s,i);
            }
            System.out.print(s);
            System.out.println("");
        }
    }
    public static long ucln(long a,long b){
        long r;
        while(a%b !=0){
            r =a%b;
            a = b;
            b = r;
        }
        return b;
    }
}
