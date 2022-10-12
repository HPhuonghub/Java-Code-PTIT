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
public class diemcanbang {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int m=0;
            int n = in.nextInt();
            int[] a = new int[n+5];
            for(int i=0;i<n;i++){
                a[i] = in.nextInt();
                if(i==0) continue;
                m+=a[i];
            }
            int kt=0;
            int t1=0;
            for(int i=0;i<n-1;i++){
                if(t1==m){
                    System.out.println(i+1);
                    kt=1;
                    break;
                }
                else{
                    t1+=a[i];
                    m-=a[i+1];
                }
            }
            if(kt==0) System.out.println(-1);
        }
    }
}
