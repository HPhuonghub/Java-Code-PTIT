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
public class giaiphuongtrinhbacnhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if(a==0 && b!=0){
            System.out.println("VN");
        }
        else if(a==0 && b==0){
            System.out.println("VSN");
        }
        else{
            double x = -b/a;
            System.out.printf("%.2f",x);
        }
    }
}
