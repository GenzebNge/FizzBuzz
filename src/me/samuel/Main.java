package me.samuel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        System.out.println("Enter any positive integer: ");
        int upperLimit = input.nextInt();
        int count = 0;
        while(upperLimit>count){
            count = count+1;
            if(count%15==0){
                System.out.println("FizzBuzz");
            }
            else if (count%3==0){
                System.out.println("Fizz");
            }
            else if (count%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(count);
            }
        }
    }
}
