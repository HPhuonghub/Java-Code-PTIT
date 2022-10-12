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
public class sinhVien {
    private String ten, lop, sinh;
    private float diem;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getSinh() {
        return sinh;
    }

    public void setSinh(String sinh) {
        this.sinh = sinh;
    }

    public float getDiem() {
        return diem;
    }

    public void setDiem(float diem) {
        this.diem = diem;
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
        sinhVien x = new sinhVien();
        x.setTen(in.nextLine());
        x.setLop(in.next());
        x.setSinh(in.next());
        x.setDiem(in.nextFloat());
        System.out.print("B20DCCN001 " + x.getTen() + " " + x.getLop() + " " + x.ngaySinh() + " ");
        System.out.printf("%.2f",x.getDiem());
    }
}
