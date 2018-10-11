package com.company;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner user = new Scanner(System.in);
            String name;
            System.out.print("What is your name?");
            name = user.nextLine();

            Scanner input = new Scanner(System.in);
            int guess;
            double x = Math.random();
            int num = (int)(x*11);
            System.out.print(name + ", guess my secret number:  ");
            guess = input.nextInt();
            int count = 0;
            while (guess!=(num)) {
                System.out.print(name+" guess again:  ");
                input = new Scanner(System.in);
                guess = input.nextInt();
                count ++;
            }
        System.out.println(guess+" is the correct number!");
        System.out.println("It took "+name+" "+count+" guesses to get to the correct number.");

    }
}

