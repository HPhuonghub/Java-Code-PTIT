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
public class chuso4_chuso7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextLong();
        int dem = 0;
        while(n>0){
            long m = n % 10;
            n /= 10;
            if(m==4 || m==7){
                dem += 1;
            }
        }
        if(dem == 4 || dem == 7){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
