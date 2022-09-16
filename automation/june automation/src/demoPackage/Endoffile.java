package demoPackage;

import java.io.*;
import java.util.*;

public class Endoffile {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ab=sc.nextLine();
        int a=0;
        while(ab!=null){
            System.out.printf("%d %s\n",++a,ab);
            ab=sc.nextLine();
        }
        sc.close();
    }
}