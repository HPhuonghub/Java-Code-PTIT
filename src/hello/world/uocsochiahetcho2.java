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
public class uocsochiahetcho2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0){
            int n = scanner.nextInt();
            int count = 0;
            if(n%2==0){
                for(int i=1;i<=Math.sqrt(n);i++){
                    if(n%i==0){
                        if(i%2==0){
                            count += 1;
                        }
                        if((n/i)%2==0 && i*i!=n){
                            count += 1;
                        }
                    }
                }
            }
            System.out.println(count);
            t-=1;
        }
    }
}
