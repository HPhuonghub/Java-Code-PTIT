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
public class chiahetcho11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            String s = in.nextLine();
            int m = 0;
            int n = 0;
            for(int i=0;i<s.length();i++){
                if(i%2==0){
                    m = m + Integer.parseInt(s.substring(i, i+1));
                }
                else{
                    n = n + Integer.parseInt(s.substring(i, i+1));
                }
            }
            int h = Math.abs(m-n);
            if(h%11==0){
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
    }
}
