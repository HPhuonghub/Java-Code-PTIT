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
public class soxacach {
    public static int n;
    public static int[] a = new int[15];
    public static int[] b = new int[15];
    public static int kiemtra(){
        for(int i=1;i<n;i++){
		int t=Math.abs(a[i]-a[i+1]);
		if(t==1) return 0;
	}
	return 1;
    }
    public static void in(){
	for(int i=1;i<=n;i++) System.out.print(a[i]);
        System.out.println("");
    }
    public static void back_track(int i){
	for(int j=1;j<=n;j++){
		if(b[j]==0){
			a[i]=j;
			b[j]=1;
			if(i==n){
                            if(kiemtra()==1) in();
			}
			else back_track(i+1);
			b[j]=0;
		}
	}
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
           n = in.nextInt();
           back_track(1);
           System.out.println("");
        }
    }
}
