import java.util.Scanner;

public class MyMain {
    
    // Calculates the square root iteratively, using the Babylonian method
    public static double babylonian(double x) {
        double n = 1.0;
        double old = 0.0;
        while (Math.abs(n-old) > 0.00001) {
            old = n;
            n = (n + (x/n))/2;
        }
        return n;
    }

    // Calculates the factorial of a number
    public static double factorial(int x) {
        if (x == 0)
            return 1;
        else {
            for (int i = x; i > 1; i--) {
                x = x * (i-1);
            }
        }   
        return x;
    } 

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        double finish = 1/factorial(0);
        int count = 1;
        while (Math.abs(finish-Math.E) > 0.00001) {
            finish += 1/factorial(count);
            count++;
        }
        return finish;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a positive number: ");
        System.out.println("The square root of your number is " + babylonian(Double.parseDouble(scan.next())));
        System.out.println("The value of e is rougly: " + calculateE());

        scan.close();
    }
}
