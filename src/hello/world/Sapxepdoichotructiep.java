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
public class Sapxepdoichotructiep {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i] = scanner.nextInt();
        }
        int dem = 1;
        for(int i=0;i<n-1;i++){
            int count = 0;
            for(int j=i+1;j<n;j++){
                if(a[i]>a[j]){
                    int m = a[i];
                    a[i] = a[j];
                    a[j] = m;
                    count += 1;
                }
            }
            if(count > 0){
                System.out.print("Buoc "+ dem +": ");
                dem+=1;
                for(int j=0;j<n;j++){
                    System.out.print(a[j]+" ");
                }
                System.out.println("");
            }
        }
    }
}
