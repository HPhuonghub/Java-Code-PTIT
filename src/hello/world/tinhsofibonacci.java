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
public class tinhsofibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0){
            long n = scanner.nextLong();
            long fn=0, f1=1, f2=1;
            if(n<=2) System.out.println(1);
            else{
                for(int i=3;i<=n;i++){
                    fn = f1 + f2;
                    f1 = f2;
                    f2 = fn;
                }
                System.out.println(fn);
            }
            t-=1;
        }
    }
}
