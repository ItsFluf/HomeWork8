package Task3;

public class Solve {
    public static void main(String[] args) {
        for(int h = 0 ; h < 24 ; h++){
            for(int m = 0 ; m < 60 ; m++){
                for(int s = 0 ; s < 60 ; s++){
                    System.out.println(h + ":" + m + ":" + s);
                    delay(54_000_000);
                }
            }
        }
    }
    // input: gets a number
    // output: runs a for loop for delay
    public static void delay(int maxDelay){
        double temp;
        for(int delay = 1 ; delay <= maxDelay ; delay++){
            temp = Math.pow(Math.PI, 2);
            temp = Math.pow(Math.PI, temp);
        }
    }
}
