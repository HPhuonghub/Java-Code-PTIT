/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package baithuchanh1;
import java.util.*;
import java.math.*;
/**
 *
 * @author DELL
 */
public class nhonhatvalonnhat {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            int t = Integer.parseInt(in.nextLine());
            if (t == 0) {
                break;
            } else {
                BigInteger a = new BigInteger(in.nextLine());
                BigInteger min = a, max = a;
                for (int i = 1; i < t; i++) {
                    BigInteger d = new BigInteger(in.nextLine());
                    min = min.min(d);
                    max = max.max(d);
                }
                if (min.equals(max)) {
                    System.out.println("BANG NHAU");
                } else {
                    System.out.println(min + " " + max);
                }
            }
        }
    }
}
