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
public class matrannhiphan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int dem = 0;
        int[][] a = new int[n][3];
        for(int i=0;i<n;i++){
            for(int j=0;j<3;j++){
                a[i][j] = in.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            int count = 0;
            for(int j=0;j<3;j++){
                if(a[i][j]==1) count++;
            }
            if(count > 1) dem++;
        }
        System.out.println(dem);
    }
}
