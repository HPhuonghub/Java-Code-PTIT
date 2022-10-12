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
public class Rectange {
    private double width, height;
    private String color;
    
    public Rectange(){
        width = 1;
        height = 1;
    }
    
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public double findArea(){
        return this.getHeight() * this.getWidth();
    }
    
    public double findPerimeter(){
        return 2 * (this.getHeight() + this.getWidth()); 
    }
    
    public String findColor(){
        String st = this.getColor().substring(0, 1);
        String st1 = this.getColor().substring(1, this.getColor().length());
        st = st.toUpperCase();
        st1 = st1.toLowerCase();
        return st + st1;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Rectange x = new Rectange();
        double a = in.nextDouble();
        double b = in.nextDouble();
        if(a>0 && b>0){
            x.setHeight(a);
            x.setWidth(b);
            x.setColor(in.next());
            System.out.printf("%.0f",x.findPerimeter());
            System.out.print(" ");
            System.out.printf("%.0f",x.findArea());
            System.out.print(" ");
            System.out.println(x.findColor());
        }
        else{
            System.out.println("INVALID");
        }
    }
}
