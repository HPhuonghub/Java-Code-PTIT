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
public class sodep1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            String s = in.nextLine();
            if(thuan_nghich(s) && chan(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean thuan_nghich(String n){
        StringBuilder m = new StringBuilder(n);
        if(m==m.reverse()){
            return true;
        }
        else return false;
    }
    public static boolean chan(String n){
        for(int i=0;i<n.length();i++){
            if(Integer.parseInt(n.substring(i, i+1))%2!=0){
                return false;
            }
        }
        return true;
    }
}
