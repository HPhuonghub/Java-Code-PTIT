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
public class chuan_hoa_xau_ho_ten_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        while(n>0){
            String m = scanner.nextLine();
            System.out.println(Chuan_hoa(m));
            n--;
        }
    }
    public static String Chuan_hoa(String m) {
        StringTokenizer st = new StringTokenizer(m);
        StringBuilder kq = new StringBuilder();
        while(st.hasMoreTokens()){
            String t = st.nextToken();
            kq.append(Character.toUpperCase(t.charAt(0)));
            for(int j=1;j<t.length();j++){
                kq.append(Character.toLowerCase(t.charAt(j)));
            }
            kq.append(" ");
        }
        return kq.toString().trim();
    }
}
