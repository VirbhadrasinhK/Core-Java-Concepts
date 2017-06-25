package com.veer;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {



                Scanner scan = new Scanner(System.in);


                int  i = scan.nextInt();
                double  d = scan.nextDouble();

                //   System.out.println("Enter a string");
                String s = scan.next();

                //  System.out.println(s);



                System.out.println("String: " + s);
                System.out.println("Double: " + d);
                System.out.println("Int: " + i);
                scan.close();
            }
        }

