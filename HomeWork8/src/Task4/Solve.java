package Task4;

import java.util.Scanner;

public class Solve {
    public static Scanner reader = new Scanner(System.in);
    public static void main(String[] args) {
        int num, spaces, sign;
        char ch;
        System.out.print("Insert num of lines: ");
        num = reader.nextInt();
        System.out.print("Choose a character: ");
        ch = reader.next().charAt(0);
        for(int j = 1 ; j <= num ; j++){
            spaces = num - j;
            sign = 2 * j - 1;
            for(int i = 0 ; i < spaces ; i++){
                System.out.print(" ");
            }
            for(int i = 0 ; i < sign ; i++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
