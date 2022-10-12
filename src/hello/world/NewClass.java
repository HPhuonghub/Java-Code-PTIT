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
public class NewClass {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = Integer.parseInt(in.nextLine());
        while(h-->0){
            int n = Integer.parseInt(in.nextLine());
            if (n == 1) {
                String s = in.nextLine();
                s = s.trim().toLowerCase();
                String[] list = s.split("\\s+");
                int l = list.length;
                String s1 = "";
                s1 = s1 + list[l-1].substring(0, 1).toUpperCase() + list[l-1].substring(1);
                for(int i=0;i<l-1;i++){
                    s1 = s1 + " " + list[i].substring(0, 1).toUpperCase() + list[i].substring(1);
                }
                System.out.println(s1);
            }
            if (n == 2) {
                String m = in.nextLine();
                StringTokenizer st = new StringTokenizer(m);
                StringBuilder kq = new StringBuilder();
                int dem = 0;
                String s = "";
                while (st.hasMoreTokens()) {
                    String t = st.nextToken();
                    if (dem == 0) {
                        s = t.substring(0, 1).toUpperCase() + t.substring(1).toLowerCase();
                        dem++;
                    } else {
                        kq.append(Character.toUpperCase(t.charAt(0)));
                        for (int j = 1; j < t.length(); j++) {
                            kq.append(Character.toLowerCase(t.charAt(j)));
                        }
                        kq.append(" ");
                    }
                }
                kq.toString().trim();
                String str = kq.toString();
                str = str + s;
                System.out.println(str);
            }
        }
    }
}
