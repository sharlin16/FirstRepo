package org.basics.org;

import java.util.Scanner;

public class ConvertToValidAge {
    public static void main(String[]args){

Scanner sc= new Scanner( System.in);
System.out.println("Enter the age:");
int age =sc.nextInt();
if (age<0){
    age=-age;

}
        System.out.println("Enter age is : "+age);
    }
}
