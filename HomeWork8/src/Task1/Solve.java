package Task1;

import java.util.Scanner;

public class Solve {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Please give me a number: ");
        int num = reader.nextInt();
        int factNum = factorial(num);
        System.out.println(num + "! = " + factNum);
    }
    // input: get an int number
    // output: return the factorial of the number
    public static int factorial(int num){
        int factNum = 1;
        for(int i = 1 ; i <= num ; i++){
            factNum *= i;
        }
        return factNum;
    }
}
