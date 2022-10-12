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
public class thiSinh {
    private String ten, sinh;
    private float a,b,c;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSinh() {
        return sinh;
    }

    public void setSinh(String sinh) {
        this.sinh = sinh;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }
    
    public float tong(){
        float i = this.getA() + this.getB() + this.getC();
        return i;
    }
    
    public String ngaySinh(){
        String s = "";
        if(this.getSinh().charAt(1)=='/'){
            s = s + "0";
            s = s + this.getSinh().substring(0, 2);
            if(this.getSinh().charAt(3)=='/'){
                s = s + "0";
                s = s + this.getSinh().substring(2, this.getSinh().length());
            }
            else s = s + this.getSinh().substring(2, this.getSinh().length());
        }
        else{
            s = s + this.getSinh().substring(0, 3);
            if(this.getSinh().charAt(4)=='/'){
                s = s + "0";
                s = s + this.getSinh().substring(3, this.getSinh().length());
            }
            else s = s + this.getSinh().substring(3, this.getSinh().length());
        }
        return s;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        thiSinh x = new thiSinh();
        x.setTen(in.nextLine());
        x.setSinh(in.next());
        x.setA(in.nextFloat());
        x.setB(in.nextFloat());
        x.setC(in.nextFloat());
        System.out.print(x.getTen() + " " + x.ngaySinh() + " ");
        System.out.printf("%.1f",x.tong());
    }
}
