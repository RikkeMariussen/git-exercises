package org.example;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i <= 200; i++) {

            if (i % 3 == 0 && i % 5 != 0) System.out.print("Fizz");
            if (i % 5 == 0 && i % 3 != 0) System.out.print("Buzz");
            if (i % 3 != 0 && i % 5 != 0) System.out.print(i);
            /*Commit 2: Change the main method to print BuzzFizz instead of FizzBuzz (remember to commit often and push to GitHub after each commit) and solve any merge conflicts that may occur.*/
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("BuzzFizz");
            }
            System.out.println();
        }
    }

}