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
public class nhanVien {
    private String ten, gioitinh, sinh, dc, sdt, ki;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getSinh() {
        return sinh;
    }

    public void setSinh(String sinh) {
        this.sinh = sinh;
    }

    public String getDc() {
        return dc;
    }

    public void setDc(String dc) {
        this.dc = dc;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getKi() {
        return ki;
    }

    public void setKi(String ki) {
        this.ki = ki;
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
    
    public String ngayKi(){
        String s = "";
        if(this.getKi().charAt(1)=='/'){
            s = s + "0";
            s = s + this.getKi().substring(0, 2);
            if(this.getKi().charAt(3)=='/'){
                s = s + "0";
                s = s + this.getKi().substring(2, this.getKi().length());
            }
            else s = s + this.getKi().substring(2, this.getKi().length());
        }
        else{
            s = s + this.getKi().substring(0, 3);
            if(this.getKi().charAt(4)=='/'){
                s = s + "0";
                s = s + this.getKi().substring(3, this.getKi().length());
            }
            else s = s + this.getKi().substring(3, this.getKi().length());
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        nhanVien x = new nhanVien();
        x.setTen(in.nextLine());
        x.setGioitinh(in.nextLine());
        x.setSinh(in.nextLine());
        x.setDc(in.nextLine());
        x.setSdt(in.nextLine());
        x.setKi(in.nextLine());
        System.out.println("00001 "+x.getTen()+" "+x.getGioitinh()+" "+x.ngaySinh()+" "+x.getDc()+" "+x.getSdt()+" "+x.ngayKi());
    }
}
