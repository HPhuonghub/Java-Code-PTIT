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
public class xaukhacnhaudainhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            if(s1.equals(s2)) System.out.println("-1");
            else System.out.println(Math.max(s1.length(), s2.length()));
        }
    }
}
