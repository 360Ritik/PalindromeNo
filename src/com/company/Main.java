package com.company;

import java.util.Scanner;

class Find{
    int i,j;
    Find() {


        int count=0;

        System.out.println("enter  a number :");
        Scanner s = new Scanner(System.in);

        String sc = s.nextLine();
        int n = s.nextInt();

        char []c=sc.toCharArray();

        System.out.println("palindrome ");
        for( i=0;i<=(c.length)-n;i++) {

            StringBuilder b = new StringBuilder();
            for (j = i; j < (i + n); j++) {
                b.append(c[j]);}

                if (b.toString().equals(b.reverse().toString())) {
                    count++;
                    System.out.println(b + "");}


        }
        System.out.print("total number of palindrome :"+count);

    }
}
public class Main {

    public static void main(String[] args) {

        Find ob = new Find();

    }
}
