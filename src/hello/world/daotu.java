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
public class daotu {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-->0){
            String m = in.nextLine();
            String[] list = m.split("\\s");
            for(int i=0;i<list.length;i++){
                String s = "";
                for(int j=list[i].length()-1;j>=0;j--){
                    s += list[i].charAt(j);
                }
                System.out.print(s + " ");
            }
            System.out.println("");
        }
    }
}
