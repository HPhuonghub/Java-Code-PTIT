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
public class sapxepchen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[1000];
        for(int i=0;i<n;i++) a[i] = scanner.nextInt();
        Vector<Integer> b = new Vector<Integer>();
        for(int i=0;i<n;i++){
            System.out.print("Buoc " + i + ": ");
            b.add(a[i]);
            Collections.sort(b);
            for(Integer o : b){
                System.out.print(o + " ");
            }
            System.out.println("");
        }
    }
}
