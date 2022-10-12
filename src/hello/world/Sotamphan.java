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
public class Sotamphan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0){
            long n = scanner.nextLong();
            if(solve(n)) System.out.println("YES");
            else System.out.println("NO");
            t-=1;
        }
    }
    public static boolean solve(long n){
        int dem = 0;
        int count = 0;
        while(n>0){
            long m = n%10;
            n /= 10;
            if(m==0 || m==1 || m==2) dem+=1;
            count += 1;
        }
        if(dem==count) return true;
        else return false;
    }
}
