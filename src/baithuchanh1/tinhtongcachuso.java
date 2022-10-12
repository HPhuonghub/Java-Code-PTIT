/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh1;
import java.util.*;
/**
 *
 * @author DELL
 */
public class tinhtongcachuso {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            String s = in.nextLine();
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    sum += s.charAt(i) - '0';
                }
            }
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                    list.add(s.substring(i, i + 1));
                }
            }
            Collections.sort(list);
            for (String a : list) {
                System.out.print(a);
            }
            System.out.print(sum);
            System.out.println("");
        }
    }
}
