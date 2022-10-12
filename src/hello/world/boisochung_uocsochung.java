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
public class boisochung_uocsochung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0){
            long a = scanner.nextLong();
            long b = scanner.nextLong();
            System.out.print(a*b/ucln(a,b) + " " + ucln(a,b));
            System.out.println("");
            t-=1;
        }
    }
    public static long ucln(long a,long b){
        long r;
        while(a%b !=0){
            r =a%b;
            a = b;
            b = r;
        }
        return b;
    }
}
