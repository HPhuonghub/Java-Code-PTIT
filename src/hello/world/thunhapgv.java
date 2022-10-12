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
public class thunhapgv {
    private String ma, ten;
    private long luong;

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }
    
    public long phucap(String s){
        String str = s.substring(0, 2);
        String s1 = "HT";
        String s2 = "HP";
        String s3 = "GV";
        if(str.equals(s1)){
            return 2000000;
        }
        else if(str.equals(s2)) return 900000;
        else return 500000;
    }
    
    public long heso(){
        long i = (this.getMa().charAt(2)-'0')*10+(this.getMa().charAt(3)-'0');
        return i;
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        thunhapgv x = new thunhapgv();
        x.setMa(in.nextLine());
        x.setTen(in.nextLine());
        x.setLuong(in.nextLong());
        long salery = x.heso()*x.getLuong() + x.phucap(x.getMa());
        System.out.println(x.getMa() + " " + x.getTen() + " " + x.heso() + " " +  x.phucap(x.getMa()) + " " +  salery);
    }
}
