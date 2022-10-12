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
public class sapxepnoibot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[100000];
        int m=1,dem=0;
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
	for(int i=0;i<n-1;i++){
            for(int j=1;j<n;j++){
		if(a[j]<a[j-1]){
                    int t=a[j];
                    a[j]=a[j-1];
                    a[j-1]=t;
                    dem+=1;
		}
            }
            if(dem>0){
                System.out.print("Buoc "+m+": ");
                for(int j=0;j<n;j++){
                    System.out.print(a[j]+" ");
                }
                System.out.println("");
                m++;
                dem=0;
            }
	}
    }
}
