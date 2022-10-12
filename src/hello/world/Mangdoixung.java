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
public class Mangdoixung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0){
            int n = scanner.nextInt();
            int[] a = new int[n];
            for(int i=0;i<n;i++){
                int m = scanner.nextInt();
                a[i] = m;
            }
            if(solve(a,n)) System.out.println("YES");
            else System.out.println("NO");
            t-=1;
        }
    }
    public static boolean solve(int[] a,int n){
        for(int i=0;i<=n/2;i++){
            if(a[i]!=a[n-i-1]) return false;
        }
        return true;
    }
}
