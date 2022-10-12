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
public class hinhvuong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int x1=sc.nextInt(),y1=sc.nextInt();
            int x2=sc.nextInt(),y2=sc.nextInt();
            int x3=sc.nextInt(),y3=sc.nextInt();
            int x4=sc.nextInt(),y4=sc.nextInt();
            
            int canh=Math.max(Math.max(y4,y2)-Math.min(y3,y1),Math.max(x4,x2)-Math.min(x3,x1));
            System.out.println(canh*canh);
    }
}
