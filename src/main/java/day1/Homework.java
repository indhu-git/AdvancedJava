package day1;

import java.util.Scanner;

public class Homework {

    public static void main(String[] args) {
        //Read the numbers from 1 to 20;
       // - a. if the number is even number print the square value of the number
       // - b. if the number is odd number and divisible by 3 print separate
       // - c. if the number is divisible by 5 and 2, add 10 and print

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number ");
        int n = sc.nextInt();
        
        for (int i =1; i<=n;i++){
            if(i%2==0){
                if(i%5==0){
                    System.out.println("The '"+i+"' is divisible by 5 and 2.");
                }else{
                    System.out.println("The '"+i+"' is even number and square of '"+i+"' is "+i*i);
                }
            }else if(i%2!=0 && i%3==0){
                System.out.println("The '"+i+"' is odd and divisible by 3.");
            } else{
                System.out.println("The '"+i+"' is not satisfied any the of above condition.");
            }
        }
    }
}
