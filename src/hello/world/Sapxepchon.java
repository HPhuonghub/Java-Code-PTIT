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
public class Sapxepchon {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        for(int i=0;i<n-1;i++){
            int k = i;
            int min = a[i];
            for(int j=i+1;j<n;j++){
                if(min>a[j]){
                    min=a[j];
                    k=j;
                }
            }
            int m = a[i];
            a[i] = a[k];
            a[k] = m;
            int b=i+1;
            System.out.print("Buoc "+ b +": ");
            for(int j=0;j<n;j++){
                System.out.print(a[j]+" ");
            }
            System.out.println("");
        }
    }
}
