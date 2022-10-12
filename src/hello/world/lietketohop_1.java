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
public class lietketohop_1 {
    public static int[] a = new int[100];
    public static int n,k,dem=0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
        k = in.nextInt();
        Try(1);
        System.out.print("Tong cong co " + dem + " to hop");
        dem=0;
    }
    public static void out(){
        dem++;
        for(int i=1;i<=k;i++) System.out.print(a[i] + " ");
        System.out.println("");
    }
    public static void Try(int i){
        for(int j=a[i-1]+1;j<=n-k+i;j++){
            a[i]=j;
            if(i==k) out();
            else Try(i+1);
        }
    }
}
