package org.basics.org;

import java.util.Scanner;

public class CabAllocation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the no of Persons :");
        int count= sc.nextInt();
        System.out.println("Enter the Capacity :");
        int capacity = sc.nextInt();
        int requiredCabs=0;
        if(count % capacity==0) {
            requiredCabs = count / capacity;
        }else{
            requiredCabs=count/capacity+1;
        }
        System.out.println("To accommodate"+count+"with capacity"+capacity+"Required total Cabs"+requiredCabs);
    }
}
