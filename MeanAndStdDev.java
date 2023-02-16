import java.util.Scanner;

public class MeanAndStdDev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a sequence of numbers, separated by spaces: ");
        String numbersString = input.nextLine();
        String[] numbersArray = numbersString.split(" ");

        double sum = 0;
        double sumOfSquares = 0;
        for (String number : numbersArray) {
            double x = Double.parseDouble(number);
            sum += x;
            sumOfSquares += x * x;
        }

        double mean = sum / numbersArray.length;
        double variance = sumOfSquares / numbersArray.length - mean * mean;
        double stdDev = Math.sqrt(variance);

        System.out.println("Mean: " + mean);
        System.out.println("Standard deviation: " + stdDev);
    }
}
