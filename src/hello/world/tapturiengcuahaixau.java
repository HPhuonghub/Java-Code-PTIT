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
public class tapturiengcuahaixau {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t =Integer.parseInt(in.nextLine());
        while(t-->0){
            String[] a = in.nextLine().split("\\s");
            String[] b = in.nextLine().split("\\s");
            Set<String> s1 = new HashSet<>(Arrays.asList(a));
            Set<String> s2 = new HashSet<>(Arrays.asList(b));
            for(String x:s1){
                if(!s2.contains(x)){
                    System.out.print(x+" ");
                }
            }
            System.out.println("");
        }
    }
}
