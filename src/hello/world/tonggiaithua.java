/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class tonggiaithua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long s = 0;
        for(int i=1;i<=n;i++){
            long m=1;
            for(int j=1;j<=i;j++){
                m*=j;
            }
            s+=m;
        }
        System.out.println(s);
    }
}
