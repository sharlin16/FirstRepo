package org.basics.org;

import java.util.Scanner;

public class CaliculateInvoiceAmount {

    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter the Bill Amount :");
      float billAmount =Sc.nextFloat();
      float discount=0;
      if (billAmount >= 5000){
          discount= billAmount* 0.2f;

        }
      float netAmount =billAmount-discount;
        System.out.println("Bill Amount :"+billAmount);
        System.out.println("discount :"+discount);
        System.out.println("Net Amount :"+netAmount);

    }
    }


