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
public class danhdauchucai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String m = in.nextLine();
        int[] dem = new int[1000];
        for(char i='a';i<='z';i++) dem[i]=0;
        for(int j=0;j<m.length();j++){
            if(m.charAt(j)>='a'&&m.charAt(j)<='z') dem[m.charAt(j)]++;
        }
        int count = 0;
        for(char k='a';k<='z';k++){
            if(dem[k]!=0) count++;
        }
        System.out.println(count);
    }
}
