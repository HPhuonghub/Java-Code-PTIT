/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;
import java.util.*;
/**
 *
 * @author DELL
 */
public class hopcuahaidayso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[100005];
        int[] b = new int[100005];
        int[] dp1 = new int[100005];
        int[] dp2 = new int[100005];
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
            dp1[a[i]]=1;
        }
        for(int i=0;i<m;i++){
            b[i] = scanner.nextInt();
            dp2[b[i]]=1;
        }
        for(int i=0;i<=100000;i++){
            if(dp1[i]==1 || dp2[i]==1) System.out.print(i+" ");
        }
    }
}
