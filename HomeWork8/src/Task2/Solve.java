package Task2;

import java.util.Scanner;

public class Solve {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please give me the starting number: ");
        int startNum = reader.nextInt();
        System.out.print("Please give me the ending number: ");
        int endNum = reader.nextInt();
        int firstNum = rnfr(startNum, endNum),
                secondNum = rnfr(startNum, endNum),
                thirdNum = rnfr(startNum, endNum);
        if(firstNum != secondNum && firstNum != thirdNum && secondNum != thirdNum){
            System.out.println("The numbers are: " + firstNum + ", " + secondNum + ", " + thirdNum + ".");
        }
        else{
            System.out.print("Some of the numbers are similar!");
        }
    }
    // rnfr = randomNumberFromRange
    // input: get 2 numbers
    // output: returns a random number in that range, not including the numbers itself
    public static int rnfr(int startNum, int endNum){
        return (startNum+1)+(int)(Math.random()*(endNum-startNum+1));
    }
}
