// section A Question 2

import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month number");
        int monthNumber = sc.nextInt();
        System.out.println("Enter the year number");
        int yearNumber = sc.nextInt();
        if(monthNumber == 1){
            System.out.println("January " + yearNumber + " has 31 days" );
        }
        else if(monthNumber == 2){
            if(yearNumber % 4 == 0)System.out.println("February " + yearNumber + " has 29 days" );
            else System.out.println("February " + yearNumber + " has 28 days" );
        }
        else if(monthNumber == 3){
            System.out.println("March " + yearNumber + " has 31 days" );
        } else if (monthNumber == 4) {
            System.out.println("April " + yearNumber + " has 30 days" );
        } else if (monthNumber == 5) {
            System.out.println("May " + yearNumber + " has 31 days" );
        } else if (monthNumber == 6) {
            System.out.println("June " + yearNumber + " has 30 days" );
        } else if (monthNumber == 7) {
            System.out.println("July " + yearNumber + " has 31 days" );
        } else if (monthNumber == 8) {
            System.out.println("August " + yearNumber + " has 31 days" );
        } else if (monthNumber == 9){
            System.out.println("September " + yearNumber + " has 30 days" );
        } else if (monthNumber == 10) {
            System.out.println("October " + yearNumber + " has 31 days" );
        } else if (monthNumber == 11) {
            System.out.println("November " + yearNumber + " has 30 days" );
        } else if (monthNumber == 12) {
            System.out.println("December " + yearNumber + " has 31 days" );
        }
    }
}
