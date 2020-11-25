package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here----------------------------------------------------
        Scanner scanner = new Scanner(System.in);             //scanner library
        int singleRoomPrice = 30; int doubleRoomPrice = 45;   //room price
        double discountFloorGreaterThan3 = 0.05;              // discount percentage if floor greater than 3
        double discountBillGreaterThan100 = 0.1;              //discount percentage if bill greater than 100
        double discount1=0.0;                                 // to hold floor discount value
        double discount2=0.0;                                 // to hold if bill > 100 value
        boolean isDouble;                                     // check room type
        boolean isG3rd;                                       // check floor type
        double sum =0.0;                                      // hold the final bill value all rooms *********
        double discount ;                                     // hold discount floor+ bill > 100 value current room
        double fullDiscount =0.0;                             // hold full discount value   all rooms*********
        int days;                                             // get how many days from user
        int total ;                                           // hold total value (days*price) to calculate bill
        double bill;                                          // payment after discount current room
        boolean newRoom ;                                     //  to START new order process or STOP APPLICATION
        //-----------------------------------------------------------------------
        System.out.println("Welcome New Room ? / enter  Boolean value" );
        newRoom = scanner.nextBoolean();
        System.out.println("============================");
        //---------------------------------------------------------------------- START LOOP
         while (newRoom) {
            System.out.println("start while looping");
            System.out.println(" How Many days ? / enter integer value");
            days = scanner.nextInt();
             System.out.println("============================");
            System.out.println("is it Double room  ?  /enter boolean value");
            isDouble = scanner.nextBoolean();
             System.out.println("============================");
            System.out.println("is it Greater than 3rd Floor? /enter boolean value");
            isG3rd = scanner.nextBoolean();
             System.out.println("============================");
            if (isDouble) {
                total = days * doubleRoomPrice;
            } else {
                total = days * singleRoomPrice;
            }
            //--------------------------------------------------------- is greater than 3 floor discount
            if (isG3rd) {
                discount1 = total * discountFloorGreaterThan3;
            }
            //--------------------------------------------------------- is greater than 100jd  discount
            if (total > 100) {
                discount2 = total * discountBillGreaterThan100;
            }
            //----------------------------------------------------------  OUTPUT(result)
            discount = discount1 + discount2;
            bill = total - discount;
             System.out.println("============================");
            System.out.println("current room payment after discount = "+bill); //current order
            sum = sum + bill;
             System.out.println("current room  discount = "+discount);        // current  order

            System.out.println("your total payment  after discount ="+sum);   //full order
             fullDiscount = fullDiscount+discount;
             System.out.println("total  discount = "+fullDiscount); //last order

             System.out.println("============================");
            System.out.println("HINT:NEW ROOM ???? /boolean");         // to stop application or loop again to new order
            newRoom = scanner.nextBoolean();


        } //----------------------------------------------------------------------------STOP LOOP
        System.out.println("THANKS FOR YOUR VISIT");

    }
}

