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
public class Demsolanxuathien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int h=1;h<=t;h++){
            int n = scanner.nextInt();
            int[] a = new int[n];
            int[] b = new int[n];
            for(int i=0;i<n;i++){
                a[i] = scanner.nextInt();
                b[i] = 1;
            }
            System.out.println("Test "+h+":");
            for(int i=0;i<n-1;i++){
                int dem = 1;
                for(int j=i+1;j<n;j++){
                    if(a[i]==a[j]){
                        dem+=1;
                        b[j] = 0;
                    }
                }
                if(b[i] != 0) b[i] = dem;
            }
            for(int i=0;i<n;i++){
                if(b[i]>0){
                    System.out.println(a[i] + " xuat hien " + b[i] + " lan");
                }
            }
        }
    }
}
