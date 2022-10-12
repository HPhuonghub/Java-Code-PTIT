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
public class bosungdayso {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n+5]; 
        int max=0;
        for(int i=1;i<=n;i++){
            a[i] = in.nextInt();
            if(max<a[i]) max = a[i];
        }
        if(max==n) System.out.println("Excellent!");
        else{
            for(int i=1;i<=max;i++){
                int dem = 0;
                for(int j=1;j<=n;j++){
                    if(i==a[j]) dem=1;
                }
                if(dem==0) System.out.println(i);
            }
        }
    }
}
