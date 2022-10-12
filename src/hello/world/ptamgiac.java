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
public class ptamgiac {
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
    
    public double kc(ptamgiac b){
        double i = (double)Math.sqrt((double)Math.pow(this.getX() - b.x,2)+(double)Math.pow(this.getY() - b.y,2));
        return i;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            ptamgiac a = new ptamgiac();
            ptamgiac b = new ptamgiac();
            ptamgiac c = new ptamgiac();
            a.setX(in.nextDouble());
            a.setY(in.nextDouble());
            b.setX(in.nextDouble());
            b.setY(in.nextDouble());
            c.setX(in.nextDouble());
            c.setY(in.nextDouble());
            double a1 = a.kc(b);
            double b1 = b.kc(c);
            double c1 = c.kc(a);
            double d = a1 + b1 + c1;
            if (a1 + b1 <= c1)
                System.out.println("INVALID");
            else if (a1 + c1 <= b1)
                System.out.println("INVALID");
            else if (b1 + c1 <= a1)
                System.out.println("INVALID");
            else
                System.out.printf("%.3f", d);
                System.out.println("");
        }
    }
}
