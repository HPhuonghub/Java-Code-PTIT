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
public class tichmatran {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int h=1;h<=t;h++){
            int n = in.nextInt();
            int m = in.nextInt();
            int[][] a = new int[n+5][m+5];
            int[][] b = new int[m+5][n+5];
            int[][] c = new int[n+5][n+5];
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    a[i][j]= in.nextInt();
                    b[j][i] = a[i][j];
                }
            }
            System.out.println("Test " + h + ":");
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    int s = 0;
                    for(int k=1;k<=m;k++){
                        s += (a[i][k]*b[k][j]);
                    }
                    c[i][j] = s;
                }
            }
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    System.out.print(c[i][j] + " ");
                }
                System.out.println("");
            }
        }
    }
}
