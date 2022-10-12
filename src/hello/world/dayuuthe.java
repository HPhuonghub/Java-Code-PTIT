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
public class dayuuthe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            String s = in.nextLine();
            String[] list = s.split("\\s+");
            int l = list.length;
            int chan = 0;
            int le = 0;
            for(int i=0;i<l;i++){
                int a = Integer.parseInt(list[i]);
                if(a%2==0) chan++;
                else le++;
            }
            if(l%2==0){
                if(chan>le) System.out.println("YES");
                else System.out.println("NO");
            }
            else{
                if(chan<le) System.out.println("YES");
                else System.out.println("NO");
            }
        }
    }
}
