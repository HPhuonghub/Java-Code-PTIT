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
public class songuyento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t>0){
            int n = scanner.nextInt();
            if(Snt(n)){
                System.out.println("YES");
            }
            else System.out.println("NO");
            t-=1;
        }
    }
    public static boolean Snt(int n){
        if(n<2) return false;
        else{
            for(int i=2;i<Math.sqrt(n);i++){
                if(n%i==0) return false;
            }
            return true;
        }
    }
}
