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
public class tongphanso {
    private long tu, mau;

    public long getTu() {
        return tu;
    }

    public void setTu(long tu) {
        this.tu = tu;
    }

    public long getMau() {
        return mau;
    }

    public void setMau(long mau) {
        this.mau = mau;
    }
    
    public long ucln(long a, long b) {
        while (a * b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
	return a+b;
    }
    
    public void tong(tongphanso b){
        long x = this.getTu() * b.mau + this.getMau() * b.tu;
        long y = this.getMau() * b.mau;
        long z = ucln(x,y);
        this.setTu(x / z);
        this.setMau(y / z);
        System.out.println(this.getTu() + "/" + this.getMau());
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        tongphanso a = new tongphanso();
        tongphanso b = new tongphanso();
        a.setTu(in.nextLong());
        a.setMau(in.nextLong());
        b.setTu(in.nextLong());
        b.setMau(in.nextLong());
        a.tong(b);
    }
}
