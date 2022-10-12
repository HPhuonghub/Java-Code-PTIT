/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh1;
import java.util.*;
/**
 *
 * @author DELL
 */
public class kiemtrasofibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0){
            t-=1;
            long n = scanner.nextLong();
            long fn=0, f1=1, f2=1;
            if(n==0 || n==1){
                System.out.println("YES");
                continue;
            }
            while(fn<n){
                fn = f1 + f2;
                f1 = f2;
                f2 = fn;
            }
            if(fn == n){
                System.out.println("YES");
            }
            else System.out.println("NO");
        }
    }
}
