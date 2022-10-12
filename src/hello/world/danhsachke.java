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
public class danhsachke {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[1001][1001];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                a[i][j] = in.nextInt();
            }
        }
        for(int i=1;i<=n;i++){
            System.out.print("List("+i+") = ");
            for(int j=1;j<=n;j++){
                if(a[i][j]==1) System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}
