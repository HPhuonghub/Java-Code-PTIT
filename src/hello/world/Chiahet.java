/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;
import java.util.*;
import java.math.*;
/**
 *
 * @author DELL
 */
public class Chiahet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            BigInteger c = a.mod(b);
            BigInteger d = b.mod(a);
            if(c.compareTo(BigInteger.ZERO)==0 || d.compareTo(BigInteger.ZERO)==0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
