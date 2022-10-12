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
public class Sokhonglienke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0){
            long n = scanner.nextLong();
            if(Chia_het_cho_10(n) == true && solve(n)==1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
            t-=1;
        }
    }
    public static boolean Chia_het_cho_10(long n){
        long s = 0;
        while(n>0){
            long m = n%10;
            n /= 10;
            s += m;
        }
        if(s%10==0) return true;
        else return false;
    }
    public static long solve(long n){
        int dem = 0;
        int count = 0;
        while(n>10){
            long h=n%10;
            n=n/10;
            long k=n%10;
            if(h-k==2 || k-h==2) dem += 1;
            count += 1;
        }
        if(dem==count) return 1;
        else return 0;
    }
}
