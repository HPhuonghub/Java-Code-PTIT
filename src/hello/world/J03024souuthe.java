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
public class J03024souuthe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            String s = in.next();
            if(chan(s)==0) System.out.println("INVALID");
            else if(chan(s)==1) System.out.println("NO");
            else System.out.println("YES");
        }
    }
    public static int chan(String s){
        int l = s.length();
        int le = 0;
        int demc = 0;
        if (s.charAt(0) == '0')
            return 0;
        else {
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)<'0' || s.charAt(i)>'9') return 0; 
                if ((s.charAt(i) - '0') % 2 == 0) {
                    demc++;
                }
                if((s.charAt(i) - '0') % 2 == 1) {
                    le++;
                }
            }
            if (l % 2 == 0) {
                if (demc > le) {
                    return 2;
                } else {
                    return 1;
                }
            }
            else{
                if (demc < le) {
                    return 2;
                } else {
                    return 1;
                }
            }
        }
    }
}
