package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int countN=0,countT=0;
        String str = sc.next();
        str = str.toUpperCase();
        if(str.length()==l){
            for(int i=0;i<l;i++){
                if(str.charAt(i)=='N' || str.charAt(i)=='T'){
                    if(str.charAt(i)=='N'){
                        countN++;
                    }
                    else if(str.charAt(i)=='T'){
                        countT++;
                    }
                }
            }
            if(countN>countT){
                System.out.println("Nutan");
            }
            else{
                System.out.println("Tusla");
            }
        }

    }
}