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
public class sodep3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            String s = in.nextLine();
            if(chan(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
    public static boolean chan(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-i-1)){
                return false;
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='2'||s.charAt(i)=='3'||s.charAt(i)=='5'||s.charAt(i)=='7'){
                continue;
            }
            else return false;
        }
        return true;
    }
}