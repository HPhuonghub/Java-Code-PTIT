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
public class chiatamgiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0){
            int n = scanner.nextInt();
            int h = scanner.nextInt();
            for(int i=1;i<n;i++){
                double s = h*Math.sqrt((double)i/n);
                System.out.printf("%.6f", s);
                System.out.print(" ");
            }
            System.out.println("");
            t-=1;
        }
    }
}
