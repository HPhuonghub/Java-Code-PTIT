/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hello.world;
import java.util.*;
import java.math.*;
/**
 *
 * @author DELL
 */
public class point {
    private double x, y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public double distance(point b){
        double i = (double)Math.sqrt((double)Math.pow(this.getX() - b.x,2)+(double)Math.pow(this.getY() - b.y,2));
        return i;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            point a = new point();
            point b = new point();
            a.setX(in.nextDouble());
            a.setY(in.nextDouble());
            b.setX(in.nextDouble());
            b.setY(in.nextDouble());
            System.out.printf("%.4f",a.distance(b));
            System.out.println("");
        }
    }
}
