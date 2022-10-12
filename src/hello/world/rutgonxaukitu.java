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
public class rutgonxaukitu {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Stack<String> s = new Stack<String>();
        String a = in.nextLine();
        s.push(a.charAt(0)+"");
        for(int i =1;i<a.length();i++){
            if(s.size()==0) s.push(a.charAt(i)+"");
            else{
                if(s.peek().equals(a.charAt(i)+"")){
                    s.pop();
                }
                else{
                    s.push(a.charAt(i)+"");
                }
            }
        }
        if(s.size()==0) System.out.println("Empty String");
        else{
            String s1="";
            while(s.size()>0){
                s1 = s.pop() + s1;
            }
            System.out.println(s1);
        }
//        for(int i =1;i<a.length();i++){
//            s.push(a.charAt(i)+"");
//        }
//        while(s.size()>0){
//            System.out.println(s.pop());
//        }
    }
}
