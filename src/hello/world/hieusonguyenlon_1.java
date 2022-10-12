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
public class hieusonguyenlon_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            String c = a.toString();
            String d = b.toString();
            int max = 0;
            if(c.length()>d.length()) max = c.length();
            else max = d.length();
            BigInteger e = a.subtract(b);
            e = e.abs();
            String f = e.toString();
            if(f.length()==max) System.out.println(f);
            else{
                for(int i=1;i<=max-f.length();i++){
                    f = "0" + f;
                }
                System.out.println(f);
            }
        }
    }
}
