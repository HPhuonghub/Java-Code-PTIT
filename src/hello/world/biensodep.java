/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;
import java.util.*;
import java.math.*;
/**
 *
 * @author DELL
 */
public class biensodep {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            String a = in.nextLine();
            if(check(a)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean check(String a) {
        char b5 = a.charAt(5);
        char b6 = a.charAt(6);
        char b7 = a.charAt(7);
        char b9 = a.charAt(9);
        char b10 = a.charAt(10);
        if (b5 < b6 && b6 < b7 && b7 < b9 && b9 < b10) {
            return true;
        }
        if (b5 == b6 && b6 == b7 && b9 == b10) {
            return true;
        }
        for (int i = 5; i <= 10; i++) {
            if (i == 8) {
                continue;
            }
            if (a.charAt(i) != '6' && a.charAt(i) != '8') {
                return false;
            }
        }
        return true;
    }
}
