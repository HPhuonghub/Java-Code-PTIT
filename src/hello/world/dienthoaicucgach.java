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
public class dienthoaicucgach {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            String a = in.nextLine();
            int n = a.length(),ok = 1;
            a = a.toLowerCase();
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                if (a.charAt(i) >= 'a' && a.charAt(i) <= 'c') {
                    b[i] = 2;
                } else if (a.charAt(i) >= 'd' && a.charAt(i) <= 'f') {
                    b[i] = 3;
                } else if (a.charAt(i) >= 'g' && a.charAt(i) <= 'i') {
                    b[i] = 4;
                } else if (a.charAt(i) >= 'j' && a.charAt(i) <= 'l') {
                    b[i] = 5;
                } else if (a.charAt(i) >= 'm' && a.charAt(i) <= 'o') {
                    b[i] = 6;
                } else if (a.charAt(i) >= 'p' && a.charAt(i) <= 's') {
                    b[i] = 7;
                } else if (a.charAt(i) >= 't' && a.charAt(i) <= 'v') {
                    b[i] = 8;
                } else if (a.charAt(i) >= 'w' && a.charAt(i) <= 'z') {
                    b[i] = 9;
                }
            }
            for(int i=0;i<=(n-1)/2;i++){
                if(b[i]!=b[n-i-1]){
                    ok=0;
                    break;
                }
            }
            if(ok==1) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
