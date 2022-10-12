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
public class tonguocso_1 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int t=scanner.nextInt();
        long sum=0;
        int[] a = new int[2000001];
        for (int i=1;i<=2000000;i++){
            a[i]= i;
        }
        for (int i=2;i<=Math.sqrt(2000000);i++){
                for (int j=i*i;j<=2000000;j+=i){
                    if (a[j]==j){
                        a[j]=i;
                    }
                }
        }
        while (t>0){
            int n=scanner.nextInt();
            while(n!=1){
                sum=sum+a[n];
                n=n/a[n];
            }
            t--;
        }
        System.out.print(sum);
    }  
}
