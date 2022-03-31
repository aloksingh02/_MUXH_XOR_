package com.company;
import java.util.*;
public class New {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if((a^b)!=0){
                System.out.println("NO");
            }
            else{
                System.out.println("YES");
            }
        }
    }
}
