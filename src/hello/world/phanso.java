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
public class phanso {
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
    
    public long timUSCLN(long a, long b) {
        while (a * b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
	return a+b;
    }
     
    public void toiGianPhanSo() {
        long i = timUSCLN(this.getTu(), this.getMau());
        this.setTu(this.getTu() / i);
        this.setMau(this.getMau() / i);
        System.out.println(this.getTu() + "/" + this.getMau());
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        phanso p1 = new phanso();
        p1.tu = in.nextLong();
        p1.mau = in.nextLong();
        p1.toiGianPhanSo();
    }
}
