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
public class phantichthuasonguyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i=1;i<=t;i++){
            int n = scanner.nextInt();
            System.out.print("Test " + i + ": ");
            int dem = 0;
            while(n%2==0){
                dem+=1;
                n/=2;
            }
            if(dem>0) System.out.print(2+"("+dem+") ");
            for(int j=3;j<=Math.sqrt(n);j+=2){
                dem = 0;
                while(n%j==0){
                    dem+=1;
                    n/=j;
                }
                if(dem>0){
                   System.out.print(j+"("+dem+") "); 
                }
            }
            if(n>1){
                System.out.print(n+"("+1+")");
            }
            System.out.println("");
        }
    }
}
