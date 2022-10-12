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
public class Chuanhoaxauhoten2 {
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
        int dem = 0;
        String s = "";
        while(st.hasMoreTokens()){
            String t = st.nextToken();
            if(dem==0){
                s = t.toUpperCase();
                dem++;
            }
            else{
                kq.append(Character.toUpperCase(t.charAt(0)));
                for(int j=1;j<t.length();j++){
                    kq.append(Character.toLowerCase(t.charAt(j)));
                }
                kq.append(" ");
            }
        }
        kq.toString().trim();
        String str = kq.toString();
        int n = str.length()-1;
        str = removeCharAt(str, n) + ", " + s;
        return str;
    }
    public static String removeCharAt(String s, int pos) {
      return s.substring(0, pos) + s.substring(pos + 1);
   }
}
