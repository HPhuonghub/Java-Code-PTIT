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
public class xaunhiphan {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int[] f = new int[100];
        while(t-->0){
            int n = in.nextInt();
            long k = in.nextLong();
            System.out.println(FiboWord(n,k));
        }
    }
    public static char FiboWord(int n,long k){
        long[] f = new long[100];
        f[0] = 0;
        f[1] = 1;
        for(int i=2;i<=92;i++){
            f[i] = f[i-1] + f[i-2];
        }
        if(n==1) return '0';
        if(n==2) return '1';
        if(k <= f[n-2]) return FiboWord(n-2,k);
        return FiboWord(n-1,k-f[n-2]);
    }
}
