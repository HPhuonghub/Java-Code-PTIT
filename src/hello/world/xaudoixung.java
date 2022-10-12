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
public class xaudoixung {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            String s = in.next();
            int dem = 0;
            if (s.length() % 2 == 0) {
                int l = s.length() / 2;
                for (int i = 0; i < l; i++) {
                    if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                        dem++;
                    }
                }
                if (dem == 1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            else {
                int l = s.length() / 2;
                for (int i = 0; i < l; i++) {
                    if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                        dem++;
                    }
                }
                if (dem == 1 || dem ==0) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}
