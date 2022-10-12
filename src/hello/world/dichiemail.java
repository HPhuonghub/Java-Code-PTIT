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
public class dichiemail {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        ArrayList<String> s1 = new ArrayList<>();
        while(t-->0){
            String m = in.nextLine();
            m = m.trim().toLowerCase();
            String[] list = m.split("\\s+");
            String a = "";
            int n=list.length;
            for(int i=0;i<n-1;i++){
                a += list[i].charAt(0);
            }
            a = list[n-1] + a;
            int dem = 1;
            for(String str : s1){
                if(str.equals(a)) dem++;
            }
            s1.add(a);
            if(dem==1){
                System.out.println(a + "@ptit.edu.vn");
            }
            else{
                System.out.println(a + dem + "@ptit.edu.vn");
            }
        }
    }
}
