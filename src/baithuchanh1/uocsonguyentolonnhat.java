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
public class uocsonguyentolonnhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0){
            long n = scanner.nextLong();
            long max = 0;
            for(long i=1;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    if(snt(i)) max = i;
                    if(snt(n/i)){
                        max=n/i;
                        break;
                    }
                }
            }
            System.out.println(max);
            t-=1;
        }
    }
    public static boolean snt(long n){
        if(n<2) return false;
        else{
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0) return false;
            }
            return true;
        }
    }
}
